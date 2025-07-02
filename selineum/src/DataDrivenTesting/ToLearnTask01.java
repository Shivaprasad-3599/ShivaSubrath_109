package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ToLearnTask01 {
public static void main(String[] args) throws IOException {
		
		FileInputStream fils=new FileInputStream("./Testdata/commondata2.properties");
		
		Properties prop=new Properties();
		
		prop.load(fils);
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String time = LocalDateTime.now().toString().replace(":", "-");
		
		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.id("user-name")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("pass"));
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+time+".png");
		FileHandler.copy(temp, dest);
}

}
