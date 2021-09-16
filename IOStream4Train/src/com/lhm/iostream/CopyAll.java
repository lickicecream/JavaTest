package com.lhm.iostream;

import java.io.*;
import java.nio.Buffer;

public class CopyAll {
    public static void main(String[] args) {
        BufferedReader br=null;
        BufferedWriter bw=null;
        try{
            File scrFile=new File("/home/lihanmian/dir");

            File destFile=new File("/home/lihanmian/dest");

            copyDir(scrFile,destFile);


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    /**
     *
     * @param scrFile 源文件
     * @param destFile 目标文件
     */
    private static void copyDir(File scrFile, File destFile) {
        if(scrFile.isFile()){
//            String path=new String(destFile.getPath()+"/"+scrFile.get)
            File newFile=new File(destFile.getAbsolutePath()+scrFile.getAbsolutePath().substring(15));
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return;
        }

        File list[]=scrFile.listFiles();
        for (File file:list) {
            if(file.isDirectory()){
                String srcDir=file.getAbsolutePath().substring(15);
//                System.out.println(srcDir);
//                System.out.println(destFile.getAbsolutePath());
                File newDir=new File(destFile.getAbsolutePath()+srcDir);
                System.out.println(newDir.getAbsolutePath());
                newDir.mkdirs();
            }

//            System.out.println(file.getAbsolutePath());
            copyDir(file,destFile);
        }
    }


}
