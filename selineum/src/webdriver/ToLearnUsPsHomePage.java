package webdriver;

import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnUsPsHomePage {
	public static void main(String[] args) throws IOException {
		String time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("")).click();
		
		driver.findElement(By.name("username")).sendKeys("shiva57786@gamil.com");
		
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("shiva3545");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.close();
	}

}
