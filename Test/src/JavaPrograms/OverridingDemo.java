package JavaPrograms;

class parent{
	int i;
	public void show(){
		System.out.println("In Class Parent");
		}
}
class child extends parent{  //if we don't declare any show method in class child then the show method in class parent
	@Override                //will be called. But if we have the show class in class child then that will override the method in Class parent
	public void show(){       //we can add annotation @Override so that we get compile erro if we do any silly mistake while writing the parent method
	System.out.println("In Class Child");
	super.show();             // we can call the parent class show method with super keyword
	super.i=10;               // same way we can call any parent class variables
	}
	public void config(){
		System.out.println("In Config method of Class Child");
	}
}
class child2 extends parent{
	public void show(){
		System.out.println("In class child2");
	}
}
public class OverridingDemo {
	
	public static void main(String[] args) {
		child obj1=new child();
		parent obj2=new child(); //object of child class but parent reference
		obj1.show();
		obj2.show();   //obj2.config() will throw error as with parent reference we can only call methods common to parent class i.e in this case show()
        obj2=new child2();
        obj2.show();  //the same parent class reference obj2 can be associated with different child objects i.e child and child2. So the show method
                      //which will be called is based on the child objectat runtime. This is called Dynamic Method Dispatch or runtime polymorphism
	}

}
