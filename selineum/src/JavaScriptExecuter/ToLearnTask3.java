package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTask3 {
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.dream11.com/");
//		Thread.sleep(5000);y
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("send-sms-iframe");
		WebElement dream11 = driver.findElement(By.xpath("//iframe[@title=\"Iframe Example\"]"));
		driver.switchTo().frame(dream11);
		driver.findElement(By.id("regEmail")).sendKeys("9191918273");
//		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//div[@id='hamburger']")).click();
		
		}
		
		
	

}
