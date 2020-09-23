package JavaPrograms;

class Bottle{
	public void show(){
		System.out.println("In Class Man");
	}
}

public class AnonymousClassDemo {

	public static void main(String[] args) {
		Bottle obj1=new Bottle(){
			public void show(){
				System.out.println("In Anonymous Class");
			};
		};

		obj1.show();
		//Charger obj2=new Charger();--ideally this is not allowed to create objects of interface
		Charger obj2=new Charger(){
			public void Charge(){
				System.out.println("We can implement the Interface's method here");
			};
		};
		obj2.Charge();
		Bed obj3=() ->System.out.println("Lambda Expression at work");
		//As for functional interface it is obvious we would be calling the lone function it has,so we can get rid of 
		//object creation and implementation of the method, we can write the body of the method with lambda expression
		obj3.Sleep();
	}}
//If we call show method with object then the show method in the parent class will get executed
//So if we want to explicitly execute a method with different statements we can define the method while creating the object like above
//This way of calling a class is called anonymous class
//Ideally we are not allowed to create objects of interface.We create a class which implements the interface's methods.
//But if we don't want to reuse class's implementation we can use Anonymous class to implement the same
interface Charger{
	void Charge();
}
@FunctionalInterface  //We can use this notation to define functional interface which can have a single method
interface Bed{
	void Sleep();
	
}
//Types of Interface--1. Normal--Can have one or more methods,
//2. Single Abstract Method--Contains a single method--In Java 8 it is called Functional Interface which is relevant for lambda expression which is coming from SCALA
// 3. Marker Interface--Does not contain any method like Serializable
