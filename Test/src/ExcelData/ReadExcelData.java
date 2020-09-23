package ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		
		File src=new File("C:\\Swarup\\DOCS\\Test Data\\XLS Data\\Student_Record25 - Copy.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook workbook1=new XSSFWorkbook(fis);
		//in case of xls file we need use HSSFworkbook class
		XSSFSheet sheet1=workbook1.getSheetAt(0);
		String datacell1=sheet1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("The value at cell1 is "+datacell1);
		String datacell2coma5=sheet1.getRow(2).getCell(5).getStringCellValue();
		System.out.println("The value at cell2,5 is "+datacell2coma5);
		workbook1.close();
		//we need to close the workbook else it will remain in memory

	}

}
