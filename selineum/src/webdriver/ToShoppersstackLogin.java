package webdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToShoppersstackLogin {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
				
		driver.get("https://shoppersstack.com/");
		// driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		List<WebElement> alllinks = driver.findElements(By.tagName("button"));
		System.out.println(alllinks.size());
		driver.close();
		
			}

}
