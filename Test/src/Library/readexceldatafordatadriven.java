package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexceldatafordatadriven {
	XSSFWorkbook workbook1;
	XSSFSheet sheet1;
	public readexceldatafordatadriven(String excelpath)
	{
		try {
			File src=new File(excelpath);
			FileInputStream fis=new FileInputStream(src);
			workbook1=new XSSFWorkbook(fis);
			//in case of xls file we need to use HSSFworkbook class
			
		} 
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
	public String getdata(int sheetnumber,int row,int column)
	{
		sheet1=workbook1.getSheetAt(sheetnumber);
		String data=sheet1.getRow(row).getCell(column).getStringCellValue();
		return data;
	}
	public int getRowCount(int sheetIndex)
	{
		int row=workbook1.getSheetAt(sheetIndex).getLastRowNum();
        row=row+1;
        return row;
	}
	

}
