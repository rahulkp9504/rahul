package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {
WebDriver driver;
public void loginpage(WebDriver driver) {
	this.driver= driver;
	PageFactory.initElements(driver, null);
}

@FindBy(id = "sssjod")
private WebElement login;

public WebElement getlogin() {
	return login;
}

}
