package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetForLoop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/24");
		Thread.sleep(30000);
		driver.findElement(By.id("compare")).click();
		
	Set<String> allwindiowids = driver.getWindowHandles();
	System.out.println(allwindiowids);
	
	for(String id:allwindiowids) {
		System.out.println(id);
	}
		
		driver.quit();
	}

}
