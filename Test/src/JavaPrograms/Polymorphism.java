package JavaPrograms;

public class Polymorphism {

	public static void main(String[] args) {
		Polymorphism obj1=new Polymorphism();
		obj1.add(55,5555);
	    obj1.add(71,45.78);
	    obj1.add(78, 554, 4478);
	    obj1.add(78.22114, 55);

	}
public void add(int a,int b)
{
int c=a+b;
System.out.println("The sum is "+c);
}
public void add(int a,double b)
{
double d=a+b;
System.out.println("The sum is "+d);
}
public void add(int a,int b,int c)
{
double d=a+b+c;
System.out.println("The sum is "+d);
}
public void add(double a,int b)
{
double d=a+b;
System.out.println("The sum is "+d);
}

}
