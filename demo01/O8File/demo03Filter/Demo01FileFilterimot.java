package com.javabase.example.demo01.O8File.demo03Filter;

import java.io.File;
import java.io.FileFilter;

public class Demo01FileFilterimot implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()){
        return true; }
    return pathname.getName().toLowerCase().endsWith(".docx");
    }
}
