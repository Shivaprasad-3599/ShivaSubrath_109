package AssMent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class AbhiBusAss1 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.abhibus.com/");

        Actions act = new Actions(driver);
        act.scrollByAmount(0, 11000).perform();

        driver.findElement(By.xpath("//a[text()='Hyderabad to Bangalore Bus']")).click();
        

        driver.findElement(By.xpath("//div[text()='Bus Partner']")).click();
         
        driver.findElement(By.xpath("//label[text()='Go Tour Travels and Holidays']")).click();

        List<WebElement> allPriceElements = driver.findElements(By.xpath("//span[contains(text(),'₹')]"));

        List<Integer> priceList = new ArrayList<>();
        for (WebElement priceElement : allPriceElements)
        {
            String priceText = priceElement.getText().replace("₹", "").replace(",", "").trim();
            
            try {
                int price = Integer.parseInt(priceText);
                priceList.add(price);
                System.out.println("Bus Price: ₹" + price);
            } 
            catch (NumberFormatException e) 
            {
                // Skip if not a valid number
            }
        }
        
        int minPrice = Integer.MAX_VALUE;
        for (int price : priceList) 
        {
            if (price < minPrice) 
            {
                minPrice = price;
            }
        }

        System.out.println("Hyderabad to Bangalore travel lowest price is: ₹" + minPrice);
    }
		
}

