package com.javabase.example.demo01.O9IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\idea\\io\\01.txt");
        fos.write(99);
        byte[] bytes ={65,63,33};
        fos.write(bytes);
        fos.close();
    }

}
