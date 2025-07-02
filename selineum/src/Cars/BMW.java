package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BMW {
	@Test(groups = "regression")
	public void lanunch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bmw.in/en/index.html");
		Reporter.log("BMWCar lanuched",true);
	}


}
