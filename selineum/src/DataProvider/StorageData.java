package DataProvider;

import org.testng.annotations.DataProvider;

public class StorageData {
	@DataProvider
	public String[][] RCB(){
		String[][] data= {{"male","Virat","Kohili","virat18@gmail.com","virat@18","virat@18"},
		{"male","MS","Dhoni","msd07@gmail.com","msd@07","msd@07"},
		{"female","smirthi","mandhana","smrithi95@gmail.com","smrithi@95","smrithi@95"},
		{"male","Rohit","shrma","rohit45@gmail.com","rohit@45","rohit@45"},
		{"male","Shiva","Prasad","shiva09@gmail.com","shiva@09","shiva@09"}};
		return data;
	}
	
	
	}
	
	
	



