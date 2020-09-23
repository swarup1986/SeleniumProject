package ExcelData;

import Library.readexceldatahandler;

public class readexceldatawithlibrary {

	public static void main(String[] args) {
		readexceldatahandler excel=new readexceldatahandler("C:\\Swarup\\DOCS\\Test Data\\XLS Data\\Student_Record25 - Copy.xlsx");
		double data=excel.getdata(1, 1, 0);
		System.out.println("The value from excel is "+data);

	}

}
