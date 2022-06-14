package com.core.java.collections.map;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Properties;

public class TestHashtable {
    public static void main(String[] args) {
        Hashtable h=new Hashtable();
      /*  //h.put(1,null);
        //h.put(null,null);
        h.put(3,3); //3rd bucket
        h.put(2,2);//
        h.put(1,1);
        h.put(4,4);
        h.put(10,10); //
        h.put(15,10);//15%11 = 4,10
        h.put("str",10);
        System.out.println(h);*/
        h.put(new Test(5),"A");
        h.put(new Test(2),"A");
        h.put(new Test(6),"A");
        h.put(new Test(15),"A");//15%11=4
        h.put(new Test(23),"A");//23%11 =1
        h.put(new Test(16),"A"); //16%11=5
        System.out.println(h);
    }
}
class  Test{
    int i;
    Test(int i){
        this.i=i;
    }
    public  int hashCode(){
        return i;
    }
    public  String toString(){
        return i+"";
    }
}
