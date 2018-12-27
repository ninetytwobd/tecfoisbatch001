package com.citis.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {
	
	
	
	public static WebDriver driver;
	public static Properties prop; 
	
	public TestBase() {
		
		
			try {
				prop = new Properties();
				
				
				FileInputStream fileInputStream = new FileInputStream("C:\\Users\\jahan\\eclipse-workspace\\com.citi.uat"
						+ "\\src\\main\\java\\com\\"
						+ "citi\\config\\config.properties");
				
				prop.load(fileInputStream);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
	}
}
		 
			
		 
			
