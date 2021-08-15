package com.guru99.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configsreader {
	public static Properties prop;
	public static void readproperties(String filepath) {
     File src=new File(filepath);
     try {
		FileInputStream fis=new FileInputStream(src);
		 prop=new Properties();
		prop.load(fis);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
     
	}
	public static  String getproperty(String key) {
	String value=	prop.getProperty(key);
	return value;
		 
	}
}
