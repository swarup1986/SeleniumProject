package JavaPrograms;

public class ChildClassExtends extends ParentClass {

	public static void main(String[] args) {
		ChildClassExtends obj1=new ChildClassExtends();  //Can access all methods from baseclass as well as childclass
		obj1.addition();
		obj1.Multiplication();
		ParentClass obj2=new ChildClassExtends();    //can access only baseclass methods
		ParentClass obj3=new ParentClass();
//   ChildClassExtends obj4=new ParentClass();   //Not Allowed child reference to baseclass objects is not allowed
//		obj3.Multiplication();      //BaseClass Reference can access base class methods only
		obj3.addition();
		
	//	obj2.Multiplication();
		obj2.subtraction();
	}
public static void Multiplication()
{int a =7;
int b=8;
int c=a*b;
System.out.println("Multiplication is "+c);
	
	}
}
