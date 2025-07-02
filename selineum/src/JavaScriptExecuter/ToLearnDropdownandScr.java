package JavaScriptExecuter;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class ToLearnDropdownandScr {
	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String time = LocalDateTime.now().toString().replace(":", "_");
				
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@href='/books']")).click();
		
		WebElement things = driver.findElement(By.id("products-orderby"));
		Select sort=new Select(things);
		sort.selectByIndex(2);

		WebElement ram= driver.findElement(By.name("products-pagesize"));
		Select page=new Select(ram);
		page.selectByVisibleText("12");
		
		WebElement view = driver.findElement(By.id("products-viewmode"));
		Select see =new Select(view);
		see.selectByVisibleText("Grid");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+time+".png");
		FileHandler.copy(temp, dest);	
		
		driver.close();
		
		
	}

}