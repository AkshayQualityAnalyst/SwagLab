package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import base.TestBase;

public class ReadData extends TestBase {
	
	public static String getData(String value) throws IOException {
		
		Properties prop=new Properties();
		FileInputStream file =new FileInputStream("C:\\Users\\manka\\eclipse-workspace\\SwagLabProject\\src\\main\\java\\Config\\TestData1.properties");
		
	//	FileInputStream file=new FileInputStream("C:\Users\manka\eclipse-workspace\SwagLabProject\src\main\java\Config\TestData1.properties");
		prop.load(file);
		return prop.getProperty(value);
		
		
		
		
	}

}
