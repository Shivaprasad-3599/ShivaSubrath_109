package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLinkText2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
    	Thread.sleep(5000);
		
     	driver.findElement(By.linkText("Register")).click();
     	Thread.sleep(5000);
		driver.findElement(By.name("Gender")).sendKeys("gender-male");
		driver.findElement(By.name("Gender")).click();
	    driver.findElement(By.id("FirstName")).sendKeys("shiva");
	    driver.findElement(By.id("LastName")).sendKeys("prasad");
    	driver.findElement(By.id("Email")).sendKeys("shiva45@gmail.com");
    	driver.findElement(By.id("Password")).sendKeys("shiva@362578");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("shiva@362578");
		Thread.sleep(5000);
		driver.findElement(By.id("register-button")).click();
		
		
	}

}


