package Testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScriptInt1 extends BaseClass {
	@Test
	public void ClickComputers() {
		driver.findElement(By.xpath("//a[contains(text(),'Computers')][1]")).click();
		if(driver.getTitle().equals("Demo Web Shop.Computers")) {
			Reporter.log("Computers page is displayed sucessfuly",true);
			
		}else{
			Reporter.log("Damer",true);
			
		}
	}

}

	


