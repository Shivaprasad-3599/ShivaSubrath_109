package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopRegistration {
	public static void main(String[] args) throws IOException {
		FileInputStream fis1=new FileInputStream("./Test Data/Commondata.properties");
		Properties pro=new Properties();
		pro.load(fis1);
		
		FileInputStream fis2=new FileInputStream("./Test Data/assvit.xlsx");
		Workbook wb=WorkbookFactory.create(fis2);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(pro.getProperty("url"));
		WelcomePage wp=new WelcomePage(driver);
		wp.getRegisterLink().click();
		RegisterPage rp=new RegisterPage(driver);
		rp.getMaleRadioButton().click();
		rp.getFirstNameTextfield().sendKeys(wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue());
		rp.getLastNameTextfield().sendKeys(wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue());
		rp.getEmailTextfield().sendKeys(wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue());
		rp.getConfirmPasswordTextfield().sendKeys(wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue());
		rp.getConfirmPasswordTextfield().sendKeys(wb.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue());
		rp.getRegisterButton().click();
		driver.close();
		
		
	}

}





