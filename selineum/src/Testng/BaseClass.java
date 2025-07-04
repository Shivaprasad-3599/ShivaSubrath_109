package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
public WebDriver driver;

@BeforeClass
public void OpenBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://demowebshop.tricentis.com/");
}
@BeforeMethod
public void Login() {
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("shivaprasad123@gamil.com");
	driver.findElement(By.id("Password")).sendKeys("shiva@123");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
}

@AfterMethod
public void Logout() {
	driver.findElement(By.linkText("Log out")).click();
}



@AfterClass
public void CloseBrowser() {
	driver.quit();
}
}
