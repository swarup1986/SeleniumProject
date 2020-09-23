package JavaPrograms;

class outerClass1{
	int a; //member variable
	public void show(){  //memeber method
		System.out.println("In Outer Class");
	}
	
	class innerClass{   //when compiled this class will be named as outerClass$innerClass.class
		public void display(){     //in total three class files will be created
			System.out.println("In Inner Class");
		}
	}
	static class innerClass2{    //we can create a static inner class just like static variables
		
	}
}

public class innerClassDemo {
	
	public static void main(String[] args) {
		outerClass1 obj=new outerClass1();
		obj.show();   //to access the member methods or variables we create object of the class
		outerClass1.innerClass obj1=obj.new innerClass();   //to access the innerclass we write like outerClass.innerClass
	                                                            //to access the constructor we write obj.new innerClass()
		                                                      //i.e we use object of the outerclass
	   outerClass1.innerClass2 obj2=new outerClass1.innerClass2();  // as this is a static class we don't need to use the object of the outerclass
	}

}
