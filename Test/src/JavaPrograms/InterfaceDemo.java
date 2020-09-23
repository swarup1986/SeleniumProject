package JavaPrograms;

interface Writer{
	public abstract void write();
	void Show(); //In Interface all methods are abstract by default so we don't need to add public abstract before method name
}                //non-abstract methods are not allowed in Interface which is allowed in abstract classes.
interface Reader{
	void Read();
	void Recite();
}
abstract class Abc{
	public void draw(){
		System.out.println("Parent Class Draw is defined");
	}
	
}

class Pen extends Abc implements Writer {  //Now if class Pen want to extend more classes it is not possible as muliple inheritence is not allowed in Java
	public void write(){    //So we can convert the Write class as Interface so that we can achieve multiple inheritence
		System.out.println("I am a Pen");
		}
	public void Show(){     //While implementing any interface we need implement all methods of interface
		System.out.println("Need to implement all methods of interface");
	}
	
}
class Pencil extends Abc implements Writer,Reader{  //Now if class Pen or Pencil wants to extend any other class then they can do that as well like in here Class Abc
	public void write(){                    //one can implement multiple interfaces
		System.out.println("I am a Pencil");
	}
public void Show() {
	System.out.println("Need to implement all methods of interface");	
}
@Override
public void Read() {
	// TODO Auto-generated method stub
	
}
@Override
public void Recite() {
	// TODO Auto-generated method stub
	
}
}
class Kit{
	public void doSomething(Pen p){
		p.write();
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Kit k=new Kit();
		Pen p=new Pen();
		Pencil pc=new Pencil();
		// k.doSomething(pc); this will give error as we are passing pen object. To overcome this for calling different functions under different classes
		//we can add a parent class like Write which the other classes can extend. And calling a function of any child class will depend on the object
		Writer w=new Pen();
		Writer w1=new Pencil();
		w.write();    //Now as we are just defining the Write class to define the method and it will be implemented by child class which extends it
		w1.write();   //So both the Write class and method will be abstract
		w.Show();             //This approach will work fine as we are just creating reference of Writer and not any child of Writer class
		w1.Show();           //Again we cannot create objects of interface,can only create reference to it
		Abc w2=new Pen();
		Abc w3=new Pen();
		w2.draw();
		w3.draw();
	}

}
