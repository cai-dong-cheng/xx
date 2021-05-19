package com.javabase.example.demo01.File.demo03Filter;

import java.io.File;

public class Demo01Filter {
    public static void main(String[] args) {
        File file = new File("D:\\视频\\作业\\软件工程");
        getAllFile(file);
    }
    public static void getAllFile(File dir){
        File[] files = dir.listFiles(new Demo01FileFilterimot());
        for (File file : files) {
            if (file.isDirectory()){
                getAllFile(file);
            }else{
                    System.out.println(file);
                }
            }
        }
}
