package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssDemoWebShop {
	@Test(dataProviderClass =    StorageData.class,dataProvider = "RCB")
	public void Login(String[] cred) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-"+cred[0]+"")).click();
		driver.findElement(By.id("FirstName")).sendKeys(cred[1]);
		driver.findElement(By.id("LastName")).sendKeys(cred[2]);
		driver.findElement(By.id("Email")).sendKeys(cred[3]);
		driver.findElement(By.id("Password")).sendKeys(cred[4]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cred[5]);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	}
}
