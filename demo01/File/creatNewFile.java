package com.javabase.example.demo01.File;

import java.io.File;
import java.io.IOException;

public class creatNewFile {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\视频\\File\\1.txt");
        boolean newFile = f1.createNewFile();
    }
}