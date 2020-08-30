package com.qa.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;

public class Common_utility extends Test_Base{

//	public static String url;
//	public void read_Property_File(String spath) throws Exception {
//		FileInputStream fi = new FileInputStream(spath);
//		Properties property = new Properties();
//		property.load(fi);
//		System.getProperties().putAll(property);
//		url = System.getProperty("URL");
//	}
	
	public void load_Log4j(String spath) throws Exception {
		FileInputStream file = new FileInputStream(spath);
		Properties prop = new Properties();
		prop.load(file);
		PropertyConfigurator.configure(prop);
	}
}
