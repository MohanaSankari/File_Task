package com.kgisl.qs1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Compare
 */
public class Compare {

    public static void main(String[] args) throws IOException {
        File f=new File("D:\\mohana\\java\\FileTest\\qs1-master\\src\\main\\java\\com\\kgisl\\qs1\\c.txt");
        File f1=new File("D:\\mohana\\java\\FileTest\\qs1-master\\src\\main\\java\\com\\kgisl\\qs1\\c1.txt");
       BufferedReader fi=new BufferedReader(new FileReader("D:\\mohana\\java\\FileTest\\qs1-master\\src\\main\\java\\com\\kgisl\\qs1\\c.txt"));
       BufferedReader fi1=new BufferedReader(new FileReader("D:\\mohana\\java\\FileTest\\qs1-master\\src\\main\\java\\com\\kgisl\\qs1\\c1.txt"));
       BufferedWriter fos=new BufferedWriter(new FileWriter("write.txt"));
      String v;
        long length = f.length();
    System.out.println("  c.txt length :"+length);
    List<String> s=new ArrayList<String>();
    List<String> s1=new ArrayList<String>();
 long length1=f1.length();
        String a;
 System.out.println("c1.txt:"+length1);
      while((a=fi.readLine())!=null){   
       s.add(a);
       System.out.println("File 1: "+s);
      //System.out.println(v);
    }
    
        String v1;
    while((v1=fi1.readLine())!=null){
        String[] a1=v1.split(" ");
        s1.add(a1[0]);
        s1.add(a1[1]);
        System.out.println("File 2: "+s1);
    }
    boolean b=fi.equals(fi1);
System.out.println("Is the two files have same content:"+b);
s1.removeAll(s);
System.out.println(s1);
List<String> s4=new ArrayList<String>(s1);
for(int i=0;i<s4.size();i++){
    //a = s3.get(i);
    //fos.write(a);
        System.out.println("Difference in the two files:"+s4.get(i));
}
    }
}

        //s1.addAll(a1);
        //System.out.println(Arrays.toString(a1));
       // List<String> a2=Arrays.asList(a1);
    //     List<String> a4=new ArrayList<String>(Arrays.asList(a1));
    //     System.out.println(s);
    //     a4.removeAll(s);
    //     System.out.println(a4);
    //     List<String> s3=new ArrayList<String>(a4);
    //     for(int i=0;i<s3.size();i++){
    //          //a = s3.get(i);
    //          //fos.write(a);
    //              System.out.println("Difference in the two files:"+s3.get(i));
    // }

//         Object[] a = s.toArray();
//         Object[] a1=s1.toArray();
//        for(int i=0;i<a.length;i++){
// for (int j=0;j<a1.length;j++){

// }
//        }
//System.out.println("s:"+s);
//System.out.println("s1:"+s1);
//s1.removeAll(s);
//System.out.println(s1);
// List<String> s4=new ArrayList<String>(s1);
// for(int i=0;i<s4.size();i++){
//     //a = s3.get(i);
//     //fos.write(a);
//         System.out.println("Difference in the two files:"+s4.get(i));
// }
    
