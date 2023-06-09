package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		 System.out.println(driver.findElement(By.tagName("body")).getText());
		driver.switchTo().parentFrame();
		 //driver.switchTo().defaultContent(); its not working
		 driver.switchTo().frame("frame-right");
		 
		 System.out.println(driver.findElement(By.tagName("body")).getText());
		 driver.quit();
		
	}

}
