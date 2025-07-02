package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaintainPopup {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("submit")).click();
		Alert popup = driver.switchTo().alert();
		System.out.println(popup.getText());
		popup.accept();
		Thread.sleep(4000);
		popup.accept();
		
		
	}
}
