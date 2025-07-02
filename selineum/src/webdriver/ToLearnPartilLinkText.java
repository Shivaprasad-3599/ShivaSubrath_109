package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class ToLearnPartilLinkText {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//driver.findElement(By.partialLinkText("Recently ")).click();
	    // driver.findElement(By.partialLinkText("Books")).click();
		driver.findElement(By.partialLinkText("Computers")).click();
	}
	    

}
