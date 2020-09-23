package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class List1demo {

	public static void main(String[] args) {
      ArrayList obj1=new ArrayList();
      obj1.add(52.34);
      obj1.add('S');
      obj1.add("Selenium Learning");
      obj1.add(55);
      //System.out.println(obj1);
      //System.out.println(obj1.get(2));
     int mylistsize=obj1.size();
     System.out.println("ListSize is "+mylistsize);
     for(int i=0;i<mylistsize;i++)
     {
    	 System.out.println(obj1.get(i));
     }
     for (Object abc:obj1)       //Enahnced For loop where object will be created
     {
    	 System.out.println("Values are " +abc);
     }
     Iterator itr=obj1.iterator();
     while (itr.hasNext())
     {
    	Object value=itr.next();
    	System.out.println("Values are "+value);
    	}
     ArrayList<String> obj2=new ArrayList<String>();   //<defines generic> for a certain data type to restrict data inside a list
     obj2.add("Swarup");
     obj2.add("WR");
     obj2.add("Tantubay");
     System.out.println(obj2);
      
	}
}
