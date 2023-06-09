package practice;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FunctionalityCheckofSelectedOption {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		 WebElement monthDropDownButton = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthDropDownButton);
		java.util.List<WebElement> allOption = monthSelect.getOptions();
		for (WebElement monthoption : allOption) {
			String visbleText = monthoption.getText();
			monthSelect.selectByVisibleText(visbleText);
			if (monthoption.isSelected()) {
				System.out.println("pass "+visbleText+" is selected");
			}else {
				System.out.println("fail "+visbleText+" is not selected");
			}
			
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}