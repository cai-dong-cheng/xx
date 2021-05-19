package com.javabase.example.demo01.File.demo03Filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo02FileFilter {
    public static void main(String[] args) {
        File file = new File("D:\\视频\\作业\\软件工程");
        getAllFile(file);
    }
    public static void getAllFile(File dir){
/*        File[] files = dir.listFiles(new FileFilter(){
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith("docx");
            }
        });*/
        File[] files = dir.listFiles((pathname)->
                pathname.isDirectory() || pathname.getName().toLowerCase().endsWith("docx"));
     /*   File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory()||name.toLowerCase().endsWith("docx");
            }
        });*/

       /* File[] files = dir.listFiles((d, name)->new File(dir,name).isDirectory()||name.toLowerCase().endsWith("docx"));*/

        for (File file : files) {
            if (file.isDirectory()){
                getAllFile(file);
            }else{
                System.out.println(file);
            }
        }
    }
}
