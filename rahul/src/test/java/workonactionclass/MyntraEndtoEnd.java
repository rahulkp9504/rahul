package workonactionclass;

import java.awt.RenderingHints.Key;
import java.sql.DriverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraEndtoEnd {
	public static void main(String[] args) {
		
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.myntra.com/");
	WebElement search =driver.findElement(By.tagName("input"));
	Actions actions= new Actions(driver);
	actions.click(search).sendKeys(search, "manshirt").perform();
	actions.sendKeys(Keys.ENTER).perform();
    WebElement shirt = driver.findElement(By.xpath("//img[contains(@title,'Checked Sustainable Casual Shirt')]"));
	actions.click(shirt).perform();
	
	}

}
