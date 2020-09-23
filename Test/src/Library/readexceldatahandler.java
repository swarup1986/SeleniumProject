package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexceldatahandler {
	XSSFWorkbook workbook1;
	XSSFSheet sheet1;
	public readexceldatahandler(String excelpath)
	{
		try {
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);
			workbook1=new XSSFWorkbook(fis);
			//in case of xls file we need use HSSFworkbook class
			
		} 
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	public double getdata(int sheetnumber,int row,int column)
	{
		sheet1=workbook1.getSheetAt(sheetnumber);
		double data=sheet1.getRow(row).getCell(column).getNumericCellValue();
		return data;
	}
	

}
