package com.util.exam;

import java.io.*;
public class Test {
    public static void main(String args[]) throws IOException {
        BufferedReader buf=new BufferedReader(
                new InputStreamReader(System.in));
        while(true) {
            String  str=buf.readLine();
            if(str.equals("quit"))
                break;
            int x=Integer.parseInt(str);
            System.out.println(x*x);
        }
    }
}

