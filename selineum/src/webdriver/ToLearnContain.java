package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnContain {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//div[contains(text(),'Cancellation & Refund')]")).click();		
	}
	
}
	
	
