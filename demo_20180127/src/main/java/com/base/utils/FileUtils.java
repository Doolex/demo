package com.base.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*
* @date 2018-3-5 10:27:15
* @author huangxj
* @desc 文件工具类(jdk1.8)
* */
public class FileUtils {

    public void createFile(){
    }


    public static void main(String[] args) throws IOException {
        Files.createDirectories(Paths.get("C:/temp", "aaaa"));
    }
}
