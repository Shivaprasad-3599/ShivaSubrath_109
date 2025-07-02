package Actions;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMouseOverAct {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://www.vtiger.com/");
//		WebElement feature = driver.findElement(By.partialLinkText("Features"));
		
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.moveByOffset(373, 103).perform();
//		act.moveToElement(feature).perform();
		
//		Thread.sleep(5000);
		
//		WebElement SA = driver.findElement(By.partialLinkText("Sales Automation"));
//		act.moveToElement(SA).perform();
		
		
		
}

}
