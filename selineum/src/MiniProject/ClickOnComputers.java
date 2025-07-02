package MiniProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClickOnComputers  extends BaseClassDM {
	@Test
	public void clickOnComputers() 
	{
		driver.findElement(By.xpath("//a[contains(text(),'Computers')]")).click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Computers","Computers Page is not Displayed.");
		Reporter.log("Computers Page is Displayed.", true);
		}

}
