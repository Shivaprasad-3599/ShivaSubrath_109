package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/user/Desktop/Movietable.html");
		Thread.sleep(2000);
		//String collection = driver.findElement(By.xpath("//td[text()='SALAR']/preceding-sibling::td")).getText();
		//System.out.println("position of salar Movie: "+collection);
		String position = driver.findElement(By.xpath("//td[text()='KGF']/preceding-sibling::td")).getText();
		System.out.println("position of KGF Movie: "+position);
		

   }
}
