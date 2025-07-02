package JavaScriptExecuter;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnFaceBookGEOption {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement Month = driver.findElement(By.id("month"));
		Select Monthsel=new Select(Month);
		List<WebElement> alloptions = Monthsel.getOptions();
		System.out.println(alloptions.size());
		
		for(WebElement ele:alloptions) {
			System.out.println(ele.getText());
			System.out.println(ele);
		
		}
}
}