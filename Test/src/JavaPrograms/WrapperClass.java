package JavaPrograms;

import java.awt.*;
import java.util.Date;

public class WrapperClass {

	public static void main(String[] args) {
		int i=5; //primitive data types which are faster compared to wrapper class
		Integer j=new Integer(10);  //This is called wrapper class which are needed for some frameworks like Collection APIs where primitive data type is not allowed
		Integer k=new Integer(i);  // Also called wrapping or boxing where assigning values is done through Integer class
		  //Like Integer we have wrapper classes like String,Character...                  
		int l=j.intValue(); //Also called unboxing or unwrapping
		Integer m=i;  //Also called Auto-boxing or Auto-wrapping as Java creates the new Integer part for us
		int n=j; //Also called Auto-unboxing or Auto-unwrapping where we don't need to call intValue method
		
		String str="12345";  //
		int convertedNumber=Integer.parseInt(str); //parseInt is a static method so we have to call it with parent class Integer
		System.out.println(convertedNumber);
		int a=123_456_789; //for readability we can add _ for a huge no. , int,float--these are primitive data types
		long b=23_123_456_789L; //we add a L or l to denote long no.
		float c=10.89f; //for float we add f
		Date now=new Date(); //These are reference data types for which we create diff objects to access these
		Point point1=new Point(1,1); //The main diff with primitive data types is that the variables hold the address of the values,they are copied by reference whereas primitives are copied by values
		Point point2=point1;    //So if we change the values with any variable it affects both the objects
		point1.x=2;    //We are changing the x coordinate value through point1 variable
		System.out.println(point2);  //But this will print (2,1), as any change through any variable changes the original object stored in some address
		
	}

}
