package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class kawasaki {
	@Test(groups = "smoke")
	public void lanunch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kawasaki.com/en-us/");
		Reporter.log("kawasaki lanuched",true);
	}

}
