package com.actitime.qs.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
		WebDriver driver;
		public Homepage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(id="logoutLink")
		private WebElement logoutbutton;

		public WebElement getlogoutbutton() {
			return logoutbutton;
		}

}
