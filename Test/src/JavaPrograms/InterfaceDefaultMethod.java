package JavaPrograms;
@FunctionalInterface //This is functional interface even though it has two methods. Actually it allows only one abstract method and any no. of default methods
interface demo{
	void abc();
	default void show(){ //this definition of a method in interface is possible only after java 1.8
		System.out.println("In Interface we can define methods with a special keyword Default");
	}
}
interface demo2{
	default void show(){
		System.out.println("Inside another interface having same default method");
	}
}
class interfaceimpl implements demo,demo2{ //Now if we don't define the show method inside the class it will throw error as duplciate default methods are available for both interfaces
	public void abc(){  //as multiple inheritence is not allowed in Java we need to define the duplicate method inside the class
		System.out.println("Interface method is defined here");
	}
	//public void show(){
		//System.out.println("Interface default methods can be overridden");
	//}
@Override
public void show() {
		demo.super.show();  //This is another way of removing ambiguity and specifying which show method needs to be executed with the use of super keyword
}                    //if we specify demo2.super.show then the show method of the second interface will get executed
}
interface staticdemo{
	void def();
	int num=10; //Inside interface we cannot just declare variables,we have to assign values to the variables as these are FINAL variables which cannot be modified with another class
	static void staticmethod(){
		System.out.println("Like default methods we can define static methods in interface");
	}
}
public class InterfaceDefaultMethod {

	public static void main(String[] args) {
		demo obj=new interfaceimpl();
		obj.abc();
		obj.show();
		staticdemo.staticmethod();//for static methods in interface we don't need to define another class to create objects and then call this method
	}                         //static methods from interface can be called with interfacename.methodname
}
