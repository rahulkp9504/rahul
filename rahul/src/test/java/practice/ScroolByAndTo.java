package practice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScroolByAndTo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(0,1000)");
		//driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		
		/*
		 * Thread.sleep(5000); js.executeScript("window.scrollBy(0,1000)");
		 * Thread.sleep(5000); js.executeScript("window.scrollTo(0,1000)");
		 * js.executeScript("window.scrollBy(0,1000)"); Thread.sleep(5000);
		 * js.executeScript("window.scrollBy(0,1000)"); Thread.sleep(5000);
		 * js.executeScript("window.scrollTo(0,1000)");
		 */
	}

}
