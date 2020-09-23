package ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

public class HashsetDemo1 {

	public static void main(String[] args) {
		HashSet<String> values=new HashSet<>();
		values.add("Selenium");
		values.add("QTP");
		values.add("1");                            //No specific index is set against the values
		values.add("Java");
		System.out.println("Values are" +values);     //U cannot addd duplicate values in Set
		for(String e:values)
		{
			System.out.println(e);
		}
		
	ArrayList<String> list1=new ArrayList<>(values);  //converting hashset to arraylist
	System.out.println("Third value is " +list1.get(3));
	
	}

}
