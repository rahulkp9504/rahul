package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FceFileUploadPopup {
	@Test
	
	public static void FceFileUpload() throws InterruptedException, AWTException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 driver.get("https://demo.guru99.com/test/upload/");
		 WebElement choseFolder = driver.findElement(By.id("uploadfile_0"));
		 //choseFolder.click();
		 Actions action = new Actions(driver);
		 String filePathUpload = "C:\\Users\\Admin\\eclipse-workspace\\rahul\\abc.txt";
		 StringSelection content = new StringSelection(filePathUpload);
		 Toolkit toolKit = Toolkit.getDefaultToolkit();
		 Clipboard clipBpard = toolKit.getSystemClipboard();
		 clipBpard.setContents(content, null);
		 action.moveToElement(choseFolder).click().perform();
		 Thread.sleep(3000);
		 Robot robot=new Robot();
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 Thread.sleep(1000);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(500);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 Thread.sleep(100);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 driver.findElement(By.id("terms")).click();
		 driver.findElement(By.id("submitbutton")).click();
		 driver.manage().window().minimize();
		 driver.quit();
	}

}
