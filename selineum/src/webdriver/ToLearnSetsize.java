package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSetsize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getHeight());
	    System.out.println(size.getWidth());
	    driver.manage().window().setSize(new Dimension(450, 450));
	    Thread.sleep(4000);
	    driver.quit();
	}
	

}
