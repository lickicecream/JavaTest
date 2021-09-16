package com.lhm.iostream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class BufferedReaderTest02 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis=new FileInputStream("lhm");

        InputStreamReader isr=new InputStreamReader(fis);

        BufferedReader br=new BufferedReader(isr);

        String line=null;

        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        //只用关闭最外层
        br.close();
    }
}
