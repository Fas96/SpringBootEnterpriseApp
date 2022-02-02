package com.example.utils;



import com.apple.eawt.Application;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.LogManager;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
@Slf4j
class wcTest {

    @Test
    public void one_valid(){

        Assert.assertSame(1, 1);
    }

    @Test
    public void  LogAddAppender() {
        Logger logger = (Logger) LogManager.getLogger("MyLogger");

        logger.info("hello");
    }
}