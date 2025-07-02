package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnContains2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/men");
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//button[contains(text(),'add to cart')]")).click();
		driver.findElement(By.xpath("//span[text()='roadster']/../..//button[@name='add to cart']")).click();
	}
		

}
