package workonactionclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickOnButton {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("file:///C:/Users/HP/Desktop/check.html");
	WebElement buttonToDoubleClick = driver.findElement(By.id("doubleclick"));
	new Actions(driver).doubleClick(buttonToDoubleClick).perform();
	driver.switchTo().alert().accept();
	WebElement rightclickOption = driver.findElement(By.id("rightclick"));
	new Actions(driver).contextClick(rightclickOption).perform();
}
}