package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetCssValue {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(3000);
		String fontfamily = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("font-family");
		System.out.println(fontfamily);
		driver.close();
		}
}
