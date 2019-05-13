package com.kgisl.qs1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Permission
 */
public class Permission {

    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("D:\\a1.txt");
       // FileInputStream fi=new FileInputStream(f);
        boolean b=f.canRead();
        System.out.println("Is the file can be Readable:"+b);
        boolean b1=f.canWrite();
        System.out.println("Is the file can be writable:"+b1);
    }
}