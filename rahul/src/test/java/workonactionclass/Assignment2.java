package workonactionclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	Actions actions = new Actions(driver);
	driver.get("https://magento.softwaretestingboard.com/");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	//SignIn
	WebElement signInLink = driver.findElement(By.xpath("//div[@class='panel header']/ul//a[contains(.,'Sign In')]"));
	signInLink.click();
	//emailTextField
	WebElement emailTextField = driver.findElement(By.id("email"));
	actions.sendKeys(emailTextField, "yourEmailAddress").perform();
	//passwordTextField
	actions.sendKeys(driver.findElement(By.name("login[password]")),"yourPassowrd").perform();
	//signButton
	actions.click(driver.findElement(By.xpath("//span[text()='Sign In' and not(@data-bind)]"))).perform();
	//SearchTextField
	actions.sendKeys(driver.findElement(By.id("search")), "Jacket").sendKeys(Keys.ENTER).build().perform();
	//FindingElements
	jse.executeScript("window.scrollTo(0,500)");
	//finding common path for size and color
	List<WebElement> sizeAndColor = driver.findElements(By.xpath("//a[contains(.,'Adrienne Trek Jacket')]/../../div[@class='swatch-opt-1316']"));
	for (WebElement changes : sizeAndColor) {
		actions.click(changes.findElement(By.xpath("//div[@id='option-label-size-143-item-167']"))).perform();
		actions.click(changes.findElement(By.xpath("//div[@id='option-label-color-93-item-56']"))).perform();
		break;
	}
	//add to cart
	actions.click(driver.findElement(By.xpath("//a[contains(.,'Adrienne Trek Jacket')]/../../div[@class='product-item-inner']//span[text()='Add to Cart']"))).perform();
	//checking add to cart
	actions.click(driver.findElement(By.xpath("//span[@class='counter qty' and contains(@data-bind,'css')]"))).perform();
	//quantity changes 
	WebElement quantityChange = driver.findElement(By.xpath("//input[@class='item-qty cart-item-qty']"));
	actions.click(quantityChange).sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.BACK_SPACE).sendKeys("10").build().perform();
	//update
	actions.click(driver.findElement(By.xpath("//span[text()='Update']"))).pause(4000).build().perform();
	//proceedToCheckOut
	actions.click(driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']"))).pause(5000).build().perform();
	//post-conditions
	driver.manage().window().minimize();
	driver.quit();
	}
}