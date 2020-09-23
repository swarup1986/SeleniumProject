package ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static void main(String[] args) throws Exception {
		
		File src=new File("C:\\Swarup\\DOCS\\Test Data\\XLS Data\\Selenium Test.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook workbook1=new XSSFWorkbook(fis);
		//in case of xls file we need use HSSFworkbook class
		XSSFSheet sheet1=workbook1.getSheetAt(0);
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		sheet1.getRow(1).createCell(2).setCellValue("Fail");
		FileOutputStream fout=new FileOutputStream(src);
		workbook1.write(fout);
		workbook1.close();
		//we need to close the workbook else it will remain in memory

	}

}
