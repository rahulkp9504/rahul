package practice;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShort {
	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.fb.com");
	    TakesScreenshot ts=  (TakesScreenshot)driver;
		File scrFile = ts.getScreenshotAs(OutputType.FILE);
		String localtime = LocalDateTime.now().toString().replace(":", "-");
		File file = new File("./assd"+localtime+".png");
		FileUtils.copyFile(file, scrFile);
		
		
	}

}
