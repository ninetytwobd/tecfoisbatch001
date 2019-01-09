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
			FileInputStream ip = new FileInputStream("C:\\Users\\jahan\\eclipse-workspace\\automation.qa\\src"
					+ "\\main\\java\\com\\demo\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


      public static void initialization1() {
    	  String browsername = prop.getProperty("browser");
    	  
    	  
    	  if(browsername.equals("chrome")) {
    		  System.setProperty("webdriver.chrome.driver","\\C:\\Users\\jahan\\OneDrive\\Desktop\\Driver\\chromedriver.exe\\");
    		driver = new ChromeDriver();
    	  }
    	  else if(browsername.equals("FF")){
    		  System.setProperty("webdriver.gecko.driver","\\C:\\Users\\jahan\\OneDrive\\Desktop\\Driver\\chromedriver.exe\\");
    		driver = new FirefoxDriver();
    	  
	
}
    	  driver.manage().window().maximize();
    	  driver.manage().deleteAllCookies();
    	  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
    	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	  
    	  
    	  driver.get(prop.getProperty("url"));
}
}



