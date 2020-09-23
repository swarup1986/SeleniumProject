package JavaPrograms;
class A{
	public A(){
		System.out.println("In Class A");
		
	}
	public A(int i){
		System.out.println("In Class A Int Constructor" +i);
	}
	public A(int i, int j){
		System.out.println("In Class A Constructor with two arguments");
		System.out.println(i+j);
	}
}
class B extends A{ //multiple inheritence is not allowed in Java because different classes can have same method names
	public B(){    //so when call the method with object name of child class then we won't be sure which method to call
		//super(); // super class is always present in the child class even when we don't mention it
		//super(5); // to call the default constructor of B and the parametereized constructor of A by passing the value of 5
		System.out.println("In Class B");
	}
	public B(int i){
		
		super(i); // so if we want to call the super class constructor having parameters we need to add the same in the super method 
		System.out.println("In Class B Int Constructor");
	}
public B(int i,int j){
		super(i,j); 
		System.out.println("In Class B Int Constructor");
	}
}

public class SuperDemo {
	
	public void show(){
		
	}

	public static void main(String[] args) {
		B obj1=new B();    //This prints both the constructor print statements of class A and B
		B obj2=new B(5);  //This prints the int constructor plus the default constructor of A
		B obj3=new B(2,4);
		}
}
