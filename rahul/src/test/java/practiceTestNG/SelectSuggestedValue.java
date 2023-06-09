package practiceTestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectSuggestedValue {
	public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	 driver.navigate().to("https://www.facebook.com/");
	 driver.get("https://www.google.com/");
	 driver.get("https://www.facebook.com");
	 driver.close();
	
	 driver.findElement(By.id("APjFqb")).click();
	 //driver.findElement(By.xpath("//span[text()='rahul gandhi congress']"));
	 List<WebElement> allvalue = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]"));
	 for (WebElement value: allvalue) {
		
	 System.out.println(value.getText());

	 }
	 //driver.quit();
	}
	

}
