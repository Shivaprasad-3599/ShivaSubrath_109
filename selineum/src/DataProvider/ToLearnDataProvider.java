package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class ToLearnDataProvider {
	
	
	@Test(dataProviderClass =    DataStorage.class,dataProvider = "RegisterData")
	public void Login(String[] cred) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(cred[0]);
		driver.findElement(By.id("password")).sendKeys(cred[1]);
		
	}

}
