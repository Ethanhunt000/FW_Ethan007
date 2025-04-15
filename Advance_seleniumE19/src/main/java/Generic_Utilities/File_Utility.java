package Generic_Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class File_Utility {

	public String getKeyAndValuePair(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/common_data1.properties.txt");

		// step2:-create an object to properties class to load all the keys
		Properties pro = new Properties();
		pro.load(fis);

		// step3:-read the value using getProperty()
		String Value = pro.getProperty(key);
		
		
		return Value;
		
	}
}
