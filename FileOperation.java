package com.training;

import java.io.File;
import java.util.Scanner;

public class FileOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file path");
        String myfile = sc.next();
        File file = new File(myfile);
        if (file.isDirectory()) {
            System.out.println("its a directory");
        } else if (file.exists()) {
            System.out.println("directory exists");
        } else
            System.out.println("doesn't exist");

        File f1[] = file.listFiles();
        for (File f2 : f1) {
            //System.out.println("list of contents");
            System.out.println(f2.getName());
        }
        System.out.println(myfile.length());
        System.out.println("***********************************************");
    }
}
