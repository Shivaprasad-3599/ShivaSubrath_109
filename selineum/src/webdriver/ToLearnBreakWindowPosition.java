package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBreakWindowPosition {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();

		switchToWindow(driver, "flipkart");
		Point fpos = driver.manage().window().getPosition();
		System.out.println(fpos);
		
		switchToWindow(driver, "ebay");
		Point epos = driver.manage().window().getPosition();
		System.out.println(epos);
		
		switchToWindow(driver, "flipkart");
		driver.manage().window().setPosition(epos);
		
	}

	private static void switchToWindow(WebDriver driver, String expUrl) {
		Set<String> allwindowIds = driver.getWindowHandles();
		for (String id : allwindowIds) {
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains(expUrl)) {
				break;

			}
		}
	}

}
