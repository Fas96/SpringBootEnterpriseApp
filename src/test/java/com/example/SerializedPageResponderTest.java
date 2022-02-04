package com.example;

import org.hibernate.boot.jaxb.cfg.spi.JaxbCfgMappingReferenceType;

import static org.junit.Assert.assertEquals;

public class SerializedPageResponderTest {
    public void testGetPageHieratchyAsXml() throws Exception
    {
        let crawler=null;
        crawler.addPage(root, PathParser.parse("PageOne"));
        crawler.addPage(root, PathParser.parse("PageOne.ChildOne"));
        crawler.addPage(root, PathParser.parse("PageTwo"));
        JaxbCfgMappingReferenceType request;
        request.setResource("root");
        request.addInput("type", "pages");
        Responder responder = new SerializedPageResponder();
        SimpleResponse response = (SimpleResponse) responder.makeResponse(
                        new FitNesseContext(root), request);
        String xml = response.getContent();
        assertEquals("text/xml", response.getContentType());
        assertSubString("<name>PageOne</name>", xml);
        assertSubString("<name>PageTwo</name>", xml);
        assertSubString("<name>ChildOne</name>", xml);
    }
    public void testGetPageHieratchyAsXmlDoesntContainSymbolicLinks()
            throws Exception
    {
        WikiPage pageOne = crawler.addPage(root, PathParser.parse("PageOne"));
        crawler.addPage(root, PathParser.parse("PageOne.ChildOne"));
        crawler.addPage(root, PathParser.parse("PageTwo"));
        PageData data = pageOne.getData();
        WikiPageProperties properties = data.getProperties();
        WikiPageProperty symLinks = properties.set(SymbolicPage.PROPERTY_NAME);
        symLinks.set("SymPage", "PageTwo");
        pageOne.commit(data);
        request.setResource("root");
        request.addInput("type", "pages");
        Responder responder = new SerializedPageResponder();
        SimpleResponse response =
                (SimpleResponse) responder.makeResponse(
                        new FitNesseContext(root), request);
        String xml = response.getContent();
        assertEquals("text/xml", response.getContentType());
        assertSubString("<name>PageOne</name>", xml);
        assertSubString("<name>PageTwo</name>", xml);
        assertSubString("<name>ChildOne</name>", xml);
        assertNotSubString("SymPage", xml);
    }
    public void testGetDataAsHtml() throws Exception
    {
        crawler.addPage(root, PathParser.parse("TestPageOne"), "test page");
        request.setResource("TestPageOne");
        request.addInput("type", "data");


    private void assertSubString(String s, String xml) {
    }
}
