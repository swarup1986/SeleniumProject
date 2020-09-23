package ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDatawithforloop {

	public static void main(String[] args) throws Exception {
		
		File src=new File("C:\\Swarup\\DOCS\\Test Data\\XLS Data\\Student_Record25 - Copy.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook workbook1=new XSSFWorkbook(fis);
		//in case of xls file we need use HSSFworkbook class
		XSSFSheet sheet1=workbook1.getSheetAt(0);
	    int row_count=sheet1.getLastRowNum();
	    System.out.println("The no. of rows in the current sheet is "+row_count);
	    for(int i=1;i<row_count;i++)
	    {
	    	double data0=sheet1.getRow(i).getCell(0).getNumericCellValue();
	    	System.out.println("The data from row "+i+" is "+data0);
	    }
		
		workbook1.close();
		//we need to close the workbook else it will remain in memory

	}

}
