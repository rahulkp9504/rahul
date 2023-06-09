package practiceTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Fbsignup {
	@Test
	public void fbsignup() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement maleRadioButton = driver.findElement(By.xpath("//label[text()='Male']/../input[@type='radio']"));
		maleRadioButton.click();
		WebElement dateDropDown = driver.findElement(By.id("day"));
		Select dateSelect = new Select(dateDropDown);
		//dateSelect.selectByValue("31");
		//dateSelect.selectByVisibleText("31");
	      dateSelect.selectByIndex(30);	
	      WebElement monthDropDown = driver.findElement(By.id("month"));
			Select monthSelect = new Select(monthDropDown);
			//monthSelect.selectByValue("8");
			//monthSelect.selectByVisibleText("Aug");
			monthSelect.selectByIndex(7);	
			WebElement yearDropdownButton = driver.findElement(By.id("year"));
			Select selectYear = new Select(yearDropdownButton);
			//selectYear.selectByVisibleText("1997");
			//selectYearselectYear.selectByValue("1997");
			selectYear.selectByIndex(25);
	}

}
