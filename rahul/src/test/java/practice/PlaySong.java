package practice;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class PlaySong {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.youtube.com/");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='search']")).click();
		driver.switchTo().activeElement().sendKeys("rahul");
		 Actions action = new Actions(driver);
		 action.sendKeys(Keys.ENTER).perform();
		List<WebElement> rills = driver.findElements(By.xpath("//a[@id='thumbnail']"));
		action.scrollByAmount(0, 500).click().perform();
		//action.scrollByAmount(0, 500).perform();
//		for (WebElement first : rills) {
//			first.click();
//			Thread.sleep(5000);
//		}
		
	}

}
