package JavaPrograms;

public class ChildClass {

	public static void main(String[] args) {
		
		ParentClass obj1=new ParentClass();
		System.out.println("Program Started");
        obj1.addition();
        System.out.println("X Value is "+obj1.x);
        System.out.println("Y Value is "+obj1.y);        
		System.out.println("Name is "+obj1.name);
		ParentClass.subtraction();	

	}

}
