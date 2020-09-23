package JavaPrograms;

abstract class human{  //any class for which we don't want objects to call the methods,rather we want other classes to extend it
	public abstract void Eat(); //Abstract method are methods without any body, any class having abstract method has to be abstract
	public void Sleep(){
		
	}
}

class Man extends human{  //Any class extending any abstract class has to implement the abstract methods i.e Eat in this case
	public void Eat(){         //Else it will throw error. This class implementing the abstract class is called Concrete Class
		System.out.println("Man Eats");
	}
}

class Printer{
	public void print(Integer i){
		System.out.println(i);
		}
	public void print(Double i){
		
	}
}
abstract class Printer2{
	public abstract void print(Number i);
}
class printfloat extends Printer2{
	public void print(Number i){
		System.out.println(i);
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		human obj1=new Man();   //We can not instantiate i.e create objects of an abstract class
		                       // But we can create objects with any class extending the abstract class like Man in this case
                               //We can create reference of the abstract class like human obj1
		Printer obj2=new Printer();
		obj2.print(5); //Now if we try to call obj2.print(5.5) it will fail as it is a double value
		obj2.print(5.5); //So we have create another method with almost everything same except the data type
		                //To avoid that we can create use a superclass like Number which accepts all numeric number any data type can extend that
		Printer2 obj3=new printfloat();
		obj3.print(5.5f);
	}

}
