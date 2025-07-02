package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnChickIn {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.get("https://www.shoppersstack.com/products_page/24");
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("560083");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='Check']")).click();
		driver.close();
	}
}
