package JavaScriptExecuter;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnTask2 {
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		try {
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement Month = driver.findElement(By.id("month"));
		Select Monthsel=new Select(Month);
		
		List<WebElement> alloptions = Monthsel.getOptions();
		
		for(WebElement option: alloptions) {
			String monthname = option.getText();
			
			if(!monthname.isEmpty()) 
			{
				Monthsel.selectByVisibleText(monthname);
				System.out.println("Selected month:"+monthname);
				Thread.sleep(500);
			}
		}
	}
	catch (InterruptedException e) {
		e.printStackTrace();
	}
	finally {
		
		driver.quit();
	}
		
	}
}


