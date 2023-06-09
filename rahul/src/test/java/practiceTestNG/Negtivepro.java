package practiceTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Negtivepro {
	@Test(priority = 0)
	public void ramikasen(){
		Reporter.log("KGF is Controlled by ramikasen");
	}
@Test(priority = -2)
	public void vanaram(){
		Reporter.log("KGF is Controlled by vanaram");
	}
@Test(priority = 1)
	public void mumbaiShetty(){
		Reporter.log("KGF is Controlled by mumbaiShetty");
	}


}
