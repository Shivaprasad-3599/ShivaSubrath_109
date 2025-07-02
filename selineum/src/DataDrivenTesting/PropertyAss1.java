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

public class PropertyAss1 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./Test data/commondata.properties1");
		
		Properties pro=new Properties();
		
		pro.load(fis);
//		String URL = pro.getProperty("url");
//		System.out.println(URL);
//		
//		String username = pro.getProperty("username");
//		System.out.println(username);
//		
//		String pass = pro.getProperty("password");
//		System.out.println(pass);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String time = LocalDateTime.now().toString().replace(":", "-");
		
		
		driver.get(pro.getProperty("url"));
		
		driver.findElement(By.id("user-name")).sendKeys(pro.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(pro.getProperty("password"));
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		TakesScreenshot Ts=(TakesScreenshot)driver;
		File temp = Ts.getScreenshotAs(OutputType.FILE); 	
		File Dt = new File("./screenshots/"+time+".png");
		FileHandler.copy(temp, Dt);
	}

}
