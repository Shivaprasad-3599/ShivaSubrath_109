package Actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ToAss1Actions {
	public static void main(String[] args) throws IOException, InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String time = LocalDateTime.now().toString().replace(":", "_");
		
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		
	 WebElement rightbutton = driver.findElement(By.id("btn_a"));
	 Actions act=new Actions(driver);
	 act.contextClick(rightbutton).perform();
	 Thread.sleep(5000);
	 
     driver.findElement(By.xpath("//div[text()='Yes']")).click();
     Thread.sleep(5000);
     
	 String color = driver.findElement(By.xpath("//span[contains(text(),'You selected')]")).getCssValue("color");
	 System.out.println(color);
	 
	 TakesScreenshot ts=(TakesScreenshot) driver;
	 File temp=ts.getScreenshotAs(OutputType.FILE);
	 File dest=new File("./screenshots/"+time+".png");
	 FileHandler.copy(temp,dest);
	 
	 driver.quit();
	 
	
	 }

}
