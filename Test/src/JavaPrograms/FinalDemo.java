package JavaPrograms;

class Mobile{
	final int i=5; //This is Constant in a way
	final int DAY; //usually final keyowrds are written in CAPS
	//final double MARKS; this will throw error till we assign a value to it either in class or constructor
	public Mobile(){
		//int i=10; This is allowed which creates a local variables inside the constructor even with Final Keyword
		//i=10;  this is not allowed which refers to the class level i as the i variables is declared as final
		DAY=15;  //this is allowed where we declare the variable at class level but assign the value in constructor
		// DAY=20 this will throw error as 15 has already been assigned to DAY
	}
}
final class Laptop{ //if we make any class as final no other class can extend this class or can use the methods defined 
	
	final public void sell(){  //for the final class thus making it un-inheritable
		
	}
}
// class tab extends Laptop{} is not allowed
class HandHeld{
	final public void Fax(){
		System.out.println("In a final Method");
	}
}
class pager extends HandHeld{
	// public void Fax(){} is not allowed as Fax is a final method
}

public class FinalDemo {

	public static void main(String[] args) {
		Mobile obj1=new Mobile();
		System.out.println(obj1.i);
		

	}

}
