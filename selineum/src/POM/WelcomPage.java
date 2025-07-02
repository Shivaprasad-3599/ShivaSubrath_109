package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class WelcomPage {
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(className = "ico-login")
	private WebElement loginLink;
	
	public WelcomPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}
	

	

}
