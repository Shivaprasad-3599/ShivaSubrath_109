package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToLearnWebElement {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://www.shoppersstack.com/products_page/24");
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("560083");
		Thread.sleep(5678);
		
		WebElement checkBtn = driver.findElement(By.xpath("//button[@id='Check']"));
		
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.elementToBeClickable(checkBtn));
		 
	}
		
	}

 
