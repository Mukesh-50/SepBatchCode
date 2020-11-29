package readingdataExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertyFile2 {
	
	@Test
	public void readConfig() throws IOException
	{	
		System.out.println(System.getenv());
		
		System.out.println(System.getenv("USERDOMAIN_ROAMINGPROFILE"));
		
		System.out.println(System.getProperty("user.dir"));
		
		Properties pro=new Properties();
		
		pro.load(new FileInputStream(new File(System.getProperty("user.dir")+"/Config/Config.property")));
		
		System.out.println(pro.getProperty("stagingURL"));
		
		System.out.println(pro.getProperty("browser1"));
	}

}
