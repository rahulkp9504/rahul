package java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LounchChromeBrowser {
	@Test
	
	public void Lounch() {
	
		WebDriver driver= new ChromeDriver();
		driver.get("http//www.fb.com");
	}

}
