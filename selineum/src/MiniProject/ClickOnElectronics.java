package MiniProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ClickOnElectronics extends BaseClassDM {
	@Test
	public void clickOnElectronics() {
		driver.findElement(By.xpath("//a[contains(text(),'Electronics')]")).click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Computers","Computers Page is not Displayed.");
		Reporter.log("Electronics Page is displayed");
	}
	

}
