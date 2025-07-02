package Testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;



public class TodayAssmt2 {
	@Test
	public void welcome() throws IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("./Test Data/login.properties");
		
		Properties pro=new Properties();
		
		pro.load(fis);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		String time = LocalDateTime.now().toString().replace(":", "-");

		driver.get(pro.getProperty("url"));
		
		Assmet1 ass=new Assmet1(driver);
		
		ass.getEmailIdtextfield().sendKeys(pro.getProperty("emailid"));
		ass.getPasswordTextfield().sendKeys(pro.getProperty("password"));
		ass.getLoginButton().click();
		
		Thread.sleep(10000);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File fs=new File("./screenshots/"+time+".png");
		FileHandler.copy(temp, fs);
		
		
	}
	
   
}
