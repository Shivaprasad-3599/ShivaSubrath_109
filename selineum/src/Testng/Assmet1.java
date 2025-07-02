package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assmet1 {
	@FindBy(id="email")
	private WebElement EmailIdtextfield;
	
	@FindBy(id="pass")
	private WebElement PasswordTextfield;

	@FindBy(name="login")
	private WebElement LoginButton;
	
	 public Assmet1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getEmailIdtextfield() {
		return EmailIdtextfield;
	}

	public WebElement getPasswordTextfield() {
		return PasswordTextfield;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
}
