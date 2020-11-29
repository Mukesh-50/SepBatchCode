package readingdataExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WritingExcelDemo4 {

	
	@Test
	public void readExcel() throws IOException
	{
	
		File src=new File(System.getProperty("user.dir")+"/TestData/AutomationData.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sh1=wb.getSheet("Data1");
		
		XSSFRow r1=sh1.getRow(0);
		
		XSSFCell c1=r1.getCell(0);
		
		String str=c1.getStringCellValue();
		
		r1.createCell(3).setCellValue("PASS");
		
		r1.createCell(4).setCellValue("FAIL");
		
		wb.getSheet("Data1").createRow(11).createCell(0).setCellValue("Vidya");
		
		wb.getSheet("Data1").getRow(11).createCell(1).setCellValue("Sumeet");
		
		wb.getSheet("Data1").getRow(11).createCell(2).setCellValue("Anil");
		
		FileOutputStream fout=new FileOutputStream(new File(System.getProperty("user.dir")+"/TestData/AutomationDataNew.xlsx"));
		
		wb.write(fout);
		
		wb.close();
	}
	
	
}
