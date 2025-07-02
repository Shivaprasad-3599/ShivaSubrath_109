package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDrageDrop {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		
		WebElement image = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
//		WebElement image1 = driver.findElement(By.xpath(""));
		WebElement trash=driver.findElement(By.id("trash"));
		Actions act=new Actions(driver);
		act.dragAndDrop(image, trash).perform();
		
	}
		
}
