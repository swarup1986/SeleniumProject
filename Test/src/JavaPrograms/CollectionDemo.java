package JavaPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		Collection values=new ArrayList();  //Collection is an interface, List is an interface which extends Collection
        values.add(10);   //ArrayList is a class which implements List,so ArrayList indirectly implements Collection
        values.add(20); //if we define an array like int Arr[]=new int[5], the size is fixed, but with collection we can add or remove values dynamically	
	//If we know the size we should use array, if we don't know the size we should use Collection as Arrays are faster than Collection
    //in case of Collection the type of values is object instead of int,string for Arrays,so we can add anything in collection like below	
	    values.add("Swarup");
	    //Now to restrict a collection to add a particular data type like say integer we use generics which is implemented below
	    Collection<Integer> values2=new ArrayList<>(); //previous java version we had to write like new ArrayList<Integer>()
	    values2.add(12);
	    //values2.add("Vunti"); this will give error as we are trying to add string to a collection of genrics integer
	    //We can use List also instead of Collection to add values when we want to work with indexes like we want to add a value at a particular position
	    List<Integer> values3=new ArrayList<>();  //List always prints the number in sequence the way it is added in the List
	    values3.add(14);  //List works with objects i.e this 14 is not typical 14 it is wrapper class of Integer, Integer v=new Integer(14)
	    values3.add(0, 2); //we added value of 2 in the 0th index i.e before 14
	    
	    //we can also work with Set interface to get a list of values but the diff with List interface is Set does not allow duplicate values whereas List allows duplicate values
	    Set<Integer> numbers=new HashSet<>(); //HashSet is the class that implements Set
	    numbers.add(10); //Set gives the list of numbers in random order i.e if we print numbers the values will be printed in random order on every print which is not the case with List
	    //we can also use TreeSet instead of HashSet,advantage being TreeSet always prints the numbers in ascending order input:4,7,2,1,output:1,2,4,7
	    Set<Integer> numbers2=new TreeSet<>();
	    numbers2.add(20);
	    numbers2.add(14);
	    System.out.println(numbers2);
	    //Then we have Map which works with Key value pair
	    Map<String,String> m=new HashMap<>(); //HashMap is the class which implements Map
	    m.put("Name","Swarup");  //put instead of add,key=name,value=Swarup
	    m.put("FavActor", "Brad");  //HashMap also uses hashcode like HashSet to store values,so the ordering of values fetched will be random
	    m.put("Name", "Baban");  //HashMap also does not allow duplicate keys, so this value of Name key will replace the earlier Name value i.e Swarup. It allows duplicate values.
	    System.out.println(m);
	    Set<String> keys=m.keySet();   //keyset is a method which can store all keys from a Map
	    for(String key:keys){         //Any key if not present and we try to print the value of that key it returns null
	    System.out.println(key + "  " +m.get(key));  //.get(key) is a method to get the value for the key
	    }
	    Map<Integer,String> m1=new Hashtable<>();  //HashTable is another class which implements Map, it is synchronized, it is thread safe,does not allow null key or value
	    
	    System.out.println(values);
	    System.out.println(values3);
	    //As Collection does not support index we can utilize a class called Iterator which provides utility to print individual values from collection
	    Iterator it=values.iterator();  //iterator is a method which fetches values from values and stores in 'it' variable
	    //System.out.println(it.next());  //it just prints next values one by one
	    //System.out.println(it.next());  //This will print 10 and 20, to have better control we can use a while loop here
	    
	    while(it.hasNext()){      //hasNext method checks whether any next value is present or not
	    	System.out.println(it.next());
	    }
	    //As List supports index we can use a usual for loop to get the values
	    for(int i=0;i<values3.size();i++){
	    	System.out.println(values3.get(i));
	    }
	    //we can also use enhanced for loop to get values from List , List uses Objects
	    for(Object o:values3){
	    	System.out.println(o);
	    }
	               
	    }

}
