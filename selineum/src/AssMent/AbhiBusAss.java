package AssMent;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AbhiBusAss {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.abhibus.com/");
		
		Actions act=new Actions(driver);
		Thread.sleep(5000);
		act.scrollByAmount(0, 5000).perform();
		driver.findElement(By.xpath("//a[text()='View Buses'][1]")).click();
		act.scrollByAmount(0, 600).perform();
		driver.findElement(By.xpath("//div[text()='Bus Partner']")).click();
		driver.findElement(By.xpath("//label[text()='Go Tour Travels and Holidays']")).click();
		 List<WebElement> allPrices = driver.findElements(By.xpath("//span[contains(text(),'₹')]"));
			for (WebElement price : allPrices) {
				String prices=price.getText().replace("₹", "");
				 
			}
			int[] prices= {618,9500,1488,1610,1888,1600,1454};
			int lowest=prices[0];
			for(int i=1;i<prices.length-1;i++)
			{
				if(prices[i]<lowest)
					lowest=prices[i];
			}
			System.out.println("Lowest Bus Price :"+lowest);
		}
    }
