package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnClickandHold {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("shiva@123");
		WebElement eyeicon = driver.findElement(By.xpath("//div[contains(@class,'showPassword')]"));
		
		Actions act=new Actions(driver);
		act.clickAndHold(eyeicon).perform();
				
	}
	

}
