package webdriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnTOUrl {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().to(new URL("https://www.flipkart.com/"));

		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		
		driver.quit();
	}
		

}
