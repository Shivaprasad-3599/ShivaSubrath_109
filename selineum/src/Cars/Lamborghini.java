package Cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Lamborghini {
	@Test(groups = "integration")
	public void lanunch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lamborghini.com/en-en");
		Reporter.log("LamborghiniCar lanuched",true);
	}

}
