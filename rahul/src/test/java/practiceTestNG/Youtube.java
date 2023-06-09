package practiceTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Youtube {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.youtube.com/");
		WebElement searctextfield =driver.findElement(By.xpath("//input[@id='search']"));
		searctextfield.click();
		searctextfield.sendKeys("video");
		searctextfield.findElement(By.xpath("(//li[@dir='ltr'])[2]")).click();
		
		
	}

}
