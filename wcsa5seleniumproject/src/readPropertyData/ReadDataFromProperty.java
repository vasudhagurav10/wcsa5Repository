package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {
	public static void main(String[] args) throws IOException {
		//read the data from connfig.properties file
		
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//creat a obj of properties class
		Properties prop = new Properties();
		
		////make a file ready to read
		prop.load(fis);
		
		//read the particular property from file
		String data = prop.getProperty("Browser");
		
		System.out.println(data);
		
	}

}
