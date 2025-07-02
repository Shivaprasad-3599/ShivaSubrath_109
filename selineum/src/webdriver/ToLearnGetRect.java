package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetRect {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		 Rectangle rect = driver.findElement(By.xpath("//input[@value='Search store']")).getRect();
		System.out.println(rect);
		
		System.out.println("rect of scarch text field:"+ rect.getHeight());
		System.out.println("rect of scarch text field:"+ rect.getWidth());
		System.out.println("rect of scarch text field:"+ rect.getX());
		System.out.println("rect of scarch text field:"+ rect.getY());
		driver.close();
	}

}
