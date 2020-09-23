package ArrayList;


import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo1 {

	public static void main(String[] args) {
		LinkedHashSet<String> values=new LinkedHashSet<>();
		values.add("Selenium");
		values.add("QTP");
		values.add("1");                            //Sequential index is set against the values for Linkedhashset
		values.add("Java");
		System.out.println("Values are" +values);     
		for(String e:values)
		{
			System.out.println(e);
		}
		ArrayList<String> list1=new ArrayList<>(values);  //converting linkedhashset to arraylist
		System.out.println("Third value is " +list1.get(3));
         
	}

}
