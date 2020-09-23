package ExcelData;

public class Student1Main {

	public static void main(String[] args) {
		Student1 obj1=new Student1();
		obj1.NoofBooks=12; //We can acces NoofBooks(declared without public keyword) from Student1 class as both belogn to the same package
        //obj1.Name="Baban";  this throws error as the Name variable is declared as private meaning it is visible within class and subclass and not even other classes within the same package
		obj1.marks=80; //protected variable is accessible to other classes within the same package
	}

}
