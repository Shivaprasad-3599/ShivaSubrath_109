package Actions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnActionsRightClick {
	public static void main(String[] args) throws InterruptedException   {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.dream11.com/");
		Actions act=new Actions(driver);
		act.contextClick().perform();
		
		
	}

}
