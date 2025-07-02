package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Audi {
	@Test(groups = "smoke")
	public void lanunch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.audi.in/en/");
		Reporter.log("AudiCar lanuched",true);
	}
	

}
