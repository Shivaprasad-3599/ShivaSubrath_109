package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetLocation {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Point location = driver.findElement(By.xpath("//input[@value='Search store']")).getLocation();
		System.out.println(location);
		
		System.out.println("location of scerch text field:"+ location.getX());
		System.out.println("location of scerch text field:"+ location.getY());
		driver.close();
	}

}
