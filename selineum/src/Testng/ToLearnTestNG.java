package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG {//testNG class
	
	@Test
	public void sample() {
		Reporter.log("sample test case executed",true);
	}
	
	
	
	@Test
	public void demo() {//test case
		//test steps
		Reporter.log("come on lets dance together snakedance",true);
	}

}
