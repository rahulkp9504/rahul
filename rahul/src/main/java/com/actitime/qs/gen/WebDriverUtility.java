package com.actitime.qs.gen;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
/**
 * this class will provide the webdriver accessories to thr script
 * @author RAHUL
 * implicit wait
 */

public class WebDriverUtility {
	/**
	 * this method will supply the time for invocation of searchContext
	 * authar RAHUL
	 * @param driver
	 */
	public void implicitwait(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

}
