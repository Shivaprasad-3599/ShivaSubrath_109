package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	@FindBy(linkText="Register")
	private WebElement Registerlink;
	
	@FindBy(id="gender-male")
    private WebElement maleRadioButton;
	
	@FindBy(id="gender-female")
	private WebElement femaleRadioButton;
	
	@FindBy(id="FirstName")
	private WebElement FirstNameTextfield;
	
	@FindBy(id="LastName")
	private WebElement LastNameTextfield;
	
	@FindBy(id="Email")
	private WebElement EmailTextfield;
	
	@FindBy(id="Password")
	private WebElement privateTextfield;
	
	@FindBy(id="ConfirmPassword")
	private WebElement ConfirmPasswordTextfield;
	
	@FindBy(name="register-button")
	private WebElement registerButton;
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getRegisterlink() {
		return Registerlink;
	}
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}
	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}
	public WebElement getFirstNameTextfield() {
		return FirstNameTextfield;
	}
	public WebElement getLastNameTextfield() {
		return LastNameTextfield;
	}
	public WebElement getEmailTextfield() {
		return EmailTextfield;
	}
	public WebElement getPrivateTextfield() {
		return privateTextfield;
	}
	public WebElement getConfirmPasswordTextfield() {
		return ConfirmPasswordTextfield;
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}
	
}
