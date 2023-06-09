package practiceTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class parallelexecution {
	@Test(invocationCount = 2)
	public void takescreenshot() throws IOException{
		
		//WebDriver driver= new ChromeDriver();
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriver driver = new ChromeDriver(options);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
				WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5000));
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				WebElement email = driver.findElement(By.id("email"));
				//File emailsc = email.getScreenshotAs(OutputType.FILE);
				//String localtime = LocalDateTime.now().toString().replace(":", "-");
				//File file = new File("./errorshots/face"+localtime+".png");
				//FileUtils.copyFile(emailsc, file);
			    //wait.until(ExpectedConditions.elementToBeSelected(email));
				TakesScreenshot ts= (TakesScreenshot)driver;
				File fbpage = ts.getScreenshotAs(OutputType.FILE);
				String datetime = LocalDateTime.now().toString().replace(":", "-");
				File file = new File("./errorshots/face"+datetime+".png");
				FileUtils.copyFile(fbpage, file);
	}

}
