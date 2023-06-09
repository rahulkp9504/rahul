package com.actitime.test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.actitime.qs.gen.BaseClass;
import com.actitime.qs.pomrepository.Homepage;
import com.actitime.qs.pomrepository.LoginPage;

public class EndToEnd extends BaseClass {
	@Test
	public void loginLOgout() throws IOException {
		webdriverutils.implicitwait(driver);
		LoginPage loginpage = new LoginPage(driver);
		WebElement emailtextfield = loginpage.getUsernameTextField();
		emailtextfield.sendKeys(fileutils.redDataFromPropertyFile("username"));
		WebElement pwdtextfield = loginpage.getPasswordTextField();
		pwdtextfield.sendKeys(fileutils.redDataFromPropertyFile("password"));
		WebElement loginbutton = loginpage.getloginButton();
		loginbutton.click();
		Homepage homepage = new Homepage(driver);
		WebElement logoutbutton= homepage.getlogoutbutton();
		logoutbutton.click();
	}

}
