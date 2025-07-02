package MiniProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClickOnBooks  extends BaseClassDM {
	@Test
	public void clickOnBooks()
	{
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Books","Books Page is not Displayed.");
		Reporter.log("Books Page is Displayed.", true);
	}
}


