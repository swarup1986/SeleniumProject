package BasePackage;

public class ParentClass {
	static int i=15;
	double f=4.5;
	
	public static void main(String[] args) {
		
		ParentClass obj1= new ParentClass();
		//obj1.i=10;
		obj1.printvalue();
		obj1.printValue2();
		//obj1.i=10;
		System.out.println("The value of i is " +i);

	}
	public void printvalue()
	{
		ParentClass obj1= new ParentClass();
		int i =30;
		obj1.i=25;
		System.out.println("The value of i in the method is " +i);
		System.out.println("The value of instance variable in the method is " +this.i);
	}
	public void printValue2()
	{
		ParentClass obj1= new ParentClass();
		int i =40;
		obj1.i=35;
		System.out.println("The value of i in the method is " +i);
		System.out.println("The value of instance variable in the method is " +this.i);
	}

}
