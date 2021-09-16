package com.lhm.iostream;

import java.io.*;

public class BufferedWriterTest01 {

    public static void main(String[] args) throws Exception {
        BufferedWriter bw=new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("lhm",true)));

        bw.write("shit bro");
        bw.write("mother fucker");

        bw.flush();
        bw.close();


    }
}
