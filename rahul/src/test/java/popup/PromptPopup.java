package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PromptPopup {
	@Test
public  void promptPopup() {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("file:///C:/Users/HP/Desktop/DesktopOffice/Sample%20WebPages/popups/prompt.html");
	 //handle the prompt popup
	 String assertiveStatement = driver.switchTo().alert().getText();
	 System.out.println("assertiveStatement = " + assertiveStatement);
	 driver.switchTo().alert().sendKeys("18");
	 driver.switchTo().alert().accept();
	 driver.manage().window().minimize();
	 driver.quit();
}
}