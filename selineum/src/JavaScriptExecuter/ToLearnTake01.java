package JavaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnTake01 {
	public static void main(String[] args)   {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement year = driver.findElement(By.id("year"));
		Select yearsel=new Select(year);
		int lastindex = yearsel.getOptions().size()-1;
		
		
		yearsel.selectByIndex(lastindex);
		
	}

}
