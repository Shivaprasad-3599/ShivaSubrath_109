package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./Test data/commondata.properties");
		
		Properties pro=new Properties();
		
		pro.load(fis);
		String URL = pro.getProperty("url");
		System.out.println(URL);
		
		String email = pro.getProperty("email");
		System.out.println(email);
		
		String pass = pro.getProperty("password");
		System.out.println(pass);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(URL);
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

}
