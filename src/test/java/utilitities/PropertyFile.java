package utilitities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class PropertyFile {

	public static void main(String[] args) throws IOException {
		
		
		
		//Loacation of property file
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\testData\\config.properties");
		
		//create obj of properties file and loading file in it
		Properties prop = new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("appUrl");
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		String orderid = prop.getProperty("orderID");
		
		System.out.println(url +" "+ email +" "+ password +" "+ orderid);
		
		Set<Object> keyVal = prop.keySet();
		
		Collection<Object> value = prop.values();
		
		System.out.println("Key Pair : "+keyVal);
		System.out.println("VALUES : "+value);
		
		
		fis.close();
	}

}
