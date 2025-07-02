package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/24");
		Thread.sleep(30000);
		driver.findElement(By.id("compare")).click();
		Set<String> allwindowIds = driver.getWindowHandles();
		for(String id:allwindowIds) {
		driver.switchTo().window(id);
		Thread.sleep(1000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	    if(url.contains("ebay")) {
	    	break;
	    }
	    }
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
		Thread.sleep(2000);
		}
	}

