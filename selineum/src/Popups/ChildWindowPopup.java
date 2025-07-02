package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class ChildWindowPopup {
	   public static void main(String[] args)   {
       WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://www.shoppersstack.com/products_page/23");
		
		driver.findElement(By.id("compare")).click();
		switchoWindow(driver,"amazon");
		System.out.println(driver.getTitle());
		switchoWindow(driver,"shoppersstack");
		driver.close();
		switchoWindow(driver,"flipkart");
		driver.close();
		}
			
		private static void switchoWindow(WebDriver driver, String expetedurl) {
		Set<String> allwindowids = driver.getWindowHandles();
		for ( String id : allwindowids) {
			driver.switchTo().window(id);
			String acturl = driver.getCurrentUrl();
			if (acturl.contains("amazon")){
				break;
	}
		}

		}
}
