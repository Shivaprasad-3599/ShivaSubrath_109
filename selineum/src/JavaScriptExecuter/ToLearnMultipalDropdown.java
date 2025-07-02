package JavaScriptExecuter;

import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnMultipalDropdown {
	public static void main(String[] args) throws InterruptedException  {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/user/Desktop/cars.html");
		
		WebElement cars = driver.findElement(By.id("cars"));
		Select carssel=new Select(cars);
		carssel.selectByIndex(0);
		carssel.selectByValue("2");
		carssel.selectByVisibleText("Tata");
		
		Thread.sleep(2000);
		//carssel.deselectByIndex(2);
		//carssel.deselectByValue("2");
//		carssel.deselectByVisibleText("Ferreri");
		carssel.deselectAll();
		
		
	}

}
