package JavaPrograms;

public class ParentClass {
 int x=100;
 int y=200;
 String name ="Swarup";

	public static void main(String[] args) {
		ParentClass obj1=new ParentClass();
		System.out.println("Program Started");
        obj1.addition();
        System.out.println("X Value is "+obj1.x);
        System.out.println("Y Value is "+obj1.y);        
		System.out.println("Program Ended");

	}
	public void addition()
	{
		int a=40;
		int b=40;
		int c=a+b;
		System.out.println("The sum is " +c);
	}
	public static void subtraction()
	{
		int a=5000;
		int b=2100;
		int c=a-b;
		System.out.println("The subtraction is " +c);
	}

}
