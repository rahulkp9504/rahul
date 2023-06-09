package com.actitime.qs.gen;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	public FileUtility fileutils=new FileUtility();
	public WebDriverUtility webdriverutils=new WebDriverUtility();
	@BeforeMethod 
	
	public void configBeforeMethod() throws IOException {
		String browserName=fileutils.redDataFromPropertyFile("browser");
		if (browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			driver= new FirefoxDriver();
		} 
		else if (browserName.equals("edge")) {
			driver=new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.get(fileutils.redDataFromPropertyFile("url"));
		
	
	}
	@AfterMethod
	public void configAftermethod() {
		driver.manage().window().minimize();
		driver.quit();
	}

}
