package MiniProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClassDM {
	 public static WebDriver driver;
	  
	  @BeforeClass
	  public void openbrowser() {
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		  
		  driver.get("https://demowebshop.tricentis.com/");
	  }
	  
	  @BeforeMethod
		public void login()
		{
			driver.findElement(By.xpath("//a[text()='Log in']")).click();
			driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("Prasad123@gmail.com");
			driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("prasad@123");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
		}
		
		@AfterMethod
		public void logout()
		{
			driver.findElement(By.xpath("//a[text()='Log out']")).click();
		}
		
		@AfterClass
		public void closeBrowser()
		{
			driver.close();
		}

}
