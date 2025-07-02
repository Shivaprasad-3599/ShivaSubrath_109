package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnDropdown {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(5000);
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement month = driver.findElement(By.id("month"));
		Select monthsel=new Select(month);
		monthsel.selectByIndex(7);
		
		WebElement year = driver.findElement(By.id("year"));
		Select yearsel=new Select(year);
		yearsel.selectByValue("1947");
		
		WebElement day = driver.findElement(By.id("day"));
		Select daysel=new Select(day);
        daysel.selectByValue("15");
		
		
	}

}
