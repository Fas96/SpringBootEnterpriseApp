package com.example.threads;

import junit.framework.TestCase;
import org.apache.logging.log4j.ThreadContext;
import org.junit.Assert;

public class MainThreadsTest extends TestCase {

    public void test_threads() throws Exception {

        Assert.assertTrue(2==2);
        Assert.assertEquals(nextUrlOrNull(),"fas");
        }

        static  class urlGenerator{
        public static String next(){
            return "fas";
        }
        }
    public synchronized static String nextUrlOrNull() {
        String url =  urlGenerator.next();
        Thread.yield(); // inserted for testing. updateHasNext();
        return url;
    }
}
