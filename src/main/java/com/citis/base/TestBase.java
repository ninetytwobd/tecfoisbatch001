package com.citis.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static  WebDriver driver;
	public  static Properties prop;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\NewProject1\\tecfoisbatch001\\src\\main\\java\\"
					+ "com\\citis\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


      public static void initialization1() {
    	  String browsername = prop.getProperty("browser");
    	  
    	  
    	
    		  System.setProperty("webdriver.chrome.driver","\\C:\\Driver\\chromedriver.exe\\");
    		driver = new ChromeDriver();
    	 
	

    	  driver.manage().window().maximize();
    	  driver.manage().deleteAllCookies();
    	  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	  
    	  
    	  driver.get(prop.getProperty("url"));
}
}



