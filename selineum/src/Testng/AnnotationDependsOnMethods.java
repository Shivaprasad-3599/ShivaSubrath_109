package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationDependsOnMethods {
	@Test
    public void register() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("Registered successfully",true);
	}
	
	@Test(dependsOnMethods = "register")
    public void login() {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log(" logged in successfully",true);
	}
		
		@Test(dependsOnMethods ={"register","login"})
	    public void addtocart() {
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demowebshop.tricentis.com/cart");
			Reporter.log("addedtocart successfully",true);
			
	}
}
