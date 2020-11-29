package readingdataExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertyFile {
	
	@Test
	public void readConfig() throws IOException
	{
		File file=new File(System.getProperty("user.dir")+"/Config/Config.property");
		
		FileInputStream fis=new FileInputStream(file);
		
		Properties pro=new Properties();
		
		pro.load(fis);
		
		System.out.println(pro.getProperty("stagingURL"));
		
		System.out.println(pro.getProperty("browser1"));
	}

}
