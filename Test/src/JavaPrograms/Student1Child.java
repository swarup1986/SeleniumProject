package JavaPrograms;

import ExcelData.Student1;

public class Student1Child extends Student1{

	public void show() {
		//NoofBooks=15; the package private variables are not visible to child classes of other package
		marks=80; //the protected variables of parent class is accessible to child class of a diff package
		

	}

}
