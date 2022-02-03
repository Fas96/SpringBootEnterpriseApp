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
        SimpleResponse response =
                (SimpleResponse) responder.makeResponse(
                        new FitNesseContext(root), request);
        String xml = response.getContent();
        assertEquals("text/xml", response.getContentType());
        assertSubString("<name>PageOne</name>", xml);
        assertSubString("<name>PageTwo</name>", xml);
        assertSubString("<name>ChildOne</name>", xml);
    }

    private void assertSubString(String s, String xml) {
    }
}
