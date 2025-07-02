package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnID {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
//	driver.findElement(By.id("email")).sendKeys("Granite Rajanna");
//	driver.findElement(By.id("pass")).sendKeys("9108824009");
//	driver.findElement(By.name("login")).click();
	driver.findElement(By.name("q")).sendKeys("mobile");
	
	}

}
