package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetsize {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Dimension size = driver.manage().window().getSize();
//		System.out.println(size.getHeight());
//		System.out.println(size.getWidth());
		System.out.println(size);
		driver.quit();
	}

}
