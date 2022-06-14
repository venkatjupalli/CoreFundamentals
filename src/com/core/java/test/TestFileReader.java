package com.core.java.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class TestFileReader {
    public static void main(String[] args) throws IOException {
        String path="D:\\Venkat R";
        File f= new File(path);
       String[] pathNmaes= f.list();
      /*  for (String name:pathNmaes
             ) {
            System.out.println(name);
            if(name.endsWith(".txt")){
                File ff=new File(path+"\\"+name);
                Scanner ss=new Scanner(ff);
                while (ss.hasNextLine()){
                    String str= ss.nextLine();
                    if(str.contains(" ")){
                        String[]  st= str.split(" ");
                        for (String s:st
                        ) {
                            System.out.println(s);
                        }
                    }else {
                        System.out.println(str);
                    }
                }            }
        }*/

        File file=new File("D:\\Venkat R\\Test.txt");
        System.out.println(file.getName());
        Scanner sc=new Scanner(file);
        while (sc.hasNextLine()){
          String str= sc.nextLine();
          if(str.contains(" ")){
           String[]  st= str.split(" ");
              for (String s:st
                   ) {
                  FileWriter fw=new FileWriter("testWrite.txt");
                  fw.append(s);
                  fw.close();
                  System.out.println(s);
              }
          }else {
              System.out.println(str);
          }
        }
        //System.out.println(sc.next());
    }
}
