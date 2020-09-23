package JavaPrograms;

public class PassParameters {

	private static final String Swarupananda = null;
	public static void main(String[] args) {
		PassParameters obj1=new PassParameters();
		obj1.add(400,500);
	    obj1.sub(500,400);
        double divvalue=obj1.div(55.45,21.67);
        System.out.println("Division Result is "+divvalue);
        String MyFullName=Name("Swarupananda",  "Tantubay");//static method call
        System.out.println("My Full Name is "+MyFullName);
	}
public void add(int x,int y)
{
	int z=x+y;
	System.out.println("Sum is " +z);
}
public void sub(int a,int b)
{
	int c= a+b;
	System.out.println("Subtraction is " +c);
}

public double div(double m,double n)
{
	double o=m/n;
	return o;
}
public static String Name(String FirstName,String LastName)
{String FullName=FirstName+"  "+LastName;
		return FullName;
	}
}
