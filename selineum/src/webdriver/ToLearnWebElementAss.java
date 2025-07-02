package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnWebElementAss {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Vtiger']")).click();
		Thread.sleep(5000);
		
		Set<String> allwindowids = driver.getWindowHandles();
		for( String id:allwindowids) {
			driver.switchTo().window(id);
			String acturl = driver.getCurrentUrl();
			if(acturl.contains("https://www.vtiger.com/"))
			{
				break;
			}
			
		}
		driver.findElement(By.id("loginspan")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("shiva57786@gamil.com");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("shiva3545");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(3000);
		
		String errormessage = driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
		System.out.println(errormessage);
		
		String color = driver.findElement(By.xpath("//p[@class='text-danger mb-0']")).getCssValue("color");
        System.out.println(color);
        
		String bagroundcolor = driver.findElement(By.xpath("//button[text()='Sign in']")).getCssValue("border-color");
        System.out.println(bagroundcolor);
        driver.quit();
	}
	}
		