package MiniProject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestScriptDM extends BaseClassDM implements ITestListener{
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Script is Passed.", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File shiva=new File("./screenshots/failed.png");
		try {
			FileHandler.copy(temp, shiva);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

}
