package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnReverseWindowPosition {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		for (String id: allWindowIds) {
			driver.switchTo().window(id);
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
		
			if(url.contains("ebay"))
				driver.manage().window().setPosition(new Point(9,249));
//				Point position = driver.manage().window().getPosition();
		
			Thread.sleep(3000);
			if(url.contains("flipkart"))
				driver.manage().window().setPosition(new Point(800,249));
//				position=driver.manage().window().getPosition();
			
				
		
		
	}
		Thread.sleep(2000);
		driver.quit();
	}
}