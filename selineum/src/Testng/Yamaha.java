package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yamaha {
	@Test(groups = "smoke")
	public void lanunch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
		Reporter.log("Yamaha lanuched",true);
	}

}
