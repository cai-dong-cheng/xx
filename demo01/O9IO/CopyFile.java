package com.javabase.example.demo01.O9IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\idea\\io\\学生.png");
        FileOutputStream fos = new FileOutputStream("D:\\idea\\file\\学生.png");
        byte [] bytes =new byte[1024] ;
        int len =0;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);

        }
      /*  while ((len=fis.read())!=-1){
            fos.write(len);
        }*/
        fis.close();
        fos.close();
        long e = System.currentTimeMillis();
        System.out.println(e-l);

    }
}
