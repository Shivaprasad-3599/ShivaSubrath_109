package TestOfDream11;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


public class Dream11 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		Thread.sleep(2000);
		 WebElement fId = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
		driver.switchTo().frame(fId);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("980765");
		driver.findElement(By.xpath("//a[@id='regUser']")).click();
		String errMsg = driver.findElement(By.xpath("//label[@id='errorMob']")).getText();
		System.out.println(errMsg);
		
		driver.switchTo().parentFrame();
		WebElement about = driver.findElement(By.xpath("//a[text()='About Us']"));
	     Actions act=new Actions(driver);
	    act.scrollToElement(about).perform();
	    about.click();
		switchToWindow(driver,"group");
		driver.findElement(By.xpath("(//a[contains(text(),'Dream R')])[1]")).click();
		switchToWindow(driver,"dream-responsibly");
		driver.findElement(By.xpath("//a[text()='Dream Stories']")).click();
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/screenshot.png");
	    FileHandler.copy(temp, dest);

	}

	private static void switchToWindow(WebDriver driver, String expURL) {
		Set<String> allIds = driver.getWindowHandles();
		for (String id : allIds) {
			driver.switchTo().window(id);
			String actURL = driver.getCurrentUrl();
			if(expURL.contains(actURL))
				break;
		
		
	}
	}
	}
		


