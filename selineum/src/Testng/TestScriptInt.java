package Testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScriptInt extends BaseClass {
	@Test
	public void ClickBooks() {
		driver.findElement(By.partialLinkText("Books")).click();
		if(driver.getTitle().equals("Demo Web Shop.Books")) {
			Reporter.log("Books page is displayed sucessfuly",true);
			
		}else{
			Reporter.log("Damer",true);
			
		}
	}

}
