//package com.example.utils;
//
//import org.aspectj.lang.annotation.Before;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.testng.annotations.Test;
//
//public class LogTest {
//    private final Logger logger     = LoggerFactory.getLogger(LogTest.class);
//
//    @Test
//    public void basicLogger() {
//
//        logger.info("basicLogger");
//    }
//    @Test
//    public void addAppenderWithStream() {
//        logger.info("addAppenderWithStream");
//    }
//    @Test
//    public void addAppenderWithoutStream() {
//        logger.trace("%p %t %m%n","addAppenderWithoutStream");
//        logger.info("addAppenderWithoutStream");
//    }
//}