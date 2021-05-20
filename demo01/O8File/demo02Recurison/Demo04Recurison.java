package com.javabase.example.demo01.O8File.demo02Recurison;
import java.io.File;

public class Demo04Recurison {
    public static void main(String[] args) {
        File file = new File("D:\\视频\\作业\\软件工程");
        getAllFile(file);
    }
    public static void getAllFile(File dir){
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()){
                getAllFile(file);
            }else{
//                String s = file.toString();
//                boolean b = s.endsWith(".docx");
//                if (b){
//                    System.out.println(file);
//                }
                if (file.getName().toLowerCase().endsWith(".docx")){
                    System.out.println(file);
                }
            }
        }
    }
}

