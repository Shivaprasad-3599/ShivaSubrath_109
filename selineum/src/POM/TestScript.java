package POM;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
	public static void main(String[] args) throws IOException, InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
	driver.get("https://demowebshop.tricentis.com/");
	
	WelcomPage wp=new WelcomPage(driver);
	
	wp.getLoginLink().click();
	}
}
