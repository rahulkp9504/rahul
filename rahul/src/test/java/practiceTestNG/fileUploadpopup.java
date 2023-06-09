package practiceTestNG;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class fileUploadpopup {
	@Test
	public void naukri() throws AWTException, InterruptedException, IOException {
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Actions actions= new Actions(driver);
		WebElement uploadbutton = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		actions.moveToElement(uploadbutton).click().perform();
		String path="C:\\Users\\Admin\\Desktop\\RAHUL KUMAR- SOFTWARE TESTER.pdf";
		StringSelection content = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(content, null);
		Robot robot= new Robot();
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		TakesScreenshot ts= (TakesScreenshot)driver;
		Thread.sleep(5000);
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		String datetime = LocalDateTime.now().toString().replace(":", "-");
		File file = new File("./errorshots/fileuploadnaukri"+datetime+".png");
		FileUtils.copyFile(screenshot, file);
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
