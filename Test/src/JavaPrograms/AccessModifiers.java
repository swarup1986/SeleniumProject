package JavaPrograms;
// final,abstract,private,public,protected are all access modifiers and not specifiers like C++
//Private and protected cannot be used with class but can be used for inner class
//we can write class A or public class A as the default is public but the only difference is that if we don't mention public the same class cannot be accessed outside the package
//private class:specific class,default:specific package,public:Any class or Package,Protected:Subsiding CLass
//Any child class which extends any parent class can access any protected variable declared inside the parent class

import ExcelData.Student1; //to access variable from a class of a different package we need to import the class

public class AccessModifiers {

	public static void main(String[] args) {
		
		Student1 Obj1=new Student1();
		
		Obj1.RollNo=10;
		// Obj1.NoofBooks=12; as Noofbooks is not declared as public it will throw error in classes of other package
		// Obj1.marks=80; even the protected variable is not visible outside package
		try{
			int a[]=new int[7];
			a[7]=10;
			int b[]=null;
			b[2]=14;
			int i=10;
			int j=0;
		    int k=i/j;
	       
		System.out.println("Value is "+k);
		}
		catch(ArithmeticException e){ //as we are doing arithmetic expression so we can catch the same using ArithmeticException
			//catch(ArithmeticException e | ArrayIndexOutOfBoundsException e ) we can write several exceptions under one catch block to execute some common code
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("When we try to access aray object which is out of size");
		}
		catch(Exception e){
			System.out.println("This Exception which is superclass to all other exceptions must be added at the last,else compiler will throw error");
			System.out.println("As it is superclass it is able to handle all exceptions so the rest of the catch blocks will be unreachable,hence compiler error");
		}
		finally{
			System.out.println("If we need to execute something irrespective of pass/fail in try block we put that under finally");
		}
	}
	

}
