package com.example.test;

import org.apache.http.util.Args;

public class mainTest {
    public static void main(String[] args) {
        Args arg = new Args("l,p#,d*", args);
        boolean logging = arg.getBoolean('l');
        int port = arg.getInt('p');
        String directory = arg.getString('d');

    }
}
