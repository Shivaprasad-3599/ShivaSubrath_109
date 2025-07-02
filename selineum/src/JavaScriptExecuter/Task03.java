package JavaScriptExecuter;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Task03 {

	public static void main(String[] args) throws IOException, InterruptedException 	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String time = LocalDateTime.now().toString().replace(":", "_");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//img[@alt='Picture of 14.1-inch Laptop']")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']")).click();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+time+".png");
		FileHandler.copy(temp, dest);
		Thread.sleep(5000);
		
		driver.close();
		
		

	}

}


	


