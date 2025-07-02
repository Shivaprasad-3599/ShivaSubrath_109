package DataProvider;

import org.testng.annotations.DataProvider;

public class DataStorage {
	@DataProvider
	public String[][] datasender(){
		String[][] data= {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
		return data;
	}
	@DataProvider
	public String[][] LoginData(){
		String[][] data= {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
		return data;
	}
	@DataProvider
	public String[][] RegisterData(){
		String[][] data= {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};
		return data;
	}
}
