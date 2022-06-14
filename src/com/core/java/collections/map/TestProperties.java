package com.core.java.collections.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class TestProperties {

    public boolean validate(String userName,String password){
        //validation is success then u retrun true else false
        if(password.equalsIgnoreCase("dummy")){
            return  true;
        }
        return false;
    }

    public static void main(String[] args) throws Exception {

        Properties p=new Properties();
        FileInputStream fis=new FileInputStream("D:\\work\\CoreFundamentals\\src\\test.properties");
        p.load(fis);
        System.out.println(p);
        System.out.println(p.getProperty("username"));
        p.setProperty("newKey","newKey");
        FileOutputStream fos=new FileOutputStream("D:\\work\\CoreFundamentals\\src\\test.properties");
        p.store(fos,"updates");
    }
}
