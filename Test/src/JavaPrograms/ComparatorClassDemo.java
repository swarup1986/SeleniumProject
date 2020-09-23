package JavaPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorClassDemo {

	public static void main(String[] args) {
		List<Integer> values4=new ArrayList<>();
	    values4.add(435);
	    values4.add(128);
	    values4.add(742);
	    values4.add(844);
	    Collections.sort(values4);  //sorts the list of values in ascending order,sort is a method for Collections class
	    System.out.println(values4);
	    Collections.reverse(values4); //sorts the list in descending order
	    System.out.println(values4);  
	    Collections.shuffle(values4);  //sorts the list randomly
	    System.out.println(values4);  
	    //now suppose we want to sort the above numbers based on their last digit i.e we will compare 5,8,2,4, so the list that we are expecting is 742,844,435,128
	    //for that we need to call sort with method in the other way where we will be defining the comparator class
	    Comparator<Integer> c=new Comparator<Integer>(){
	    	public int compare(Integer i,Integer j){
	    		//if(i%10>j%10)
	    			//return 1;
	    		//else 
	    			//return -1;
	    		//or we can use the ternary operator
	    		return i%10>j%10?1:-1;
	    	}
	    	};
	    //As comparator is a functional interface we can use lambda expression as well like below
	    	Comparator<Integer> c1=(i, j)-> i%10>j%10?1:-1;   //in lamda expression we don't need to declare like Integer i,Integer j
	    	     /*{
		    			return i%10>j%10?1:-1;   //in fact this return statement is also not needed
		    	};*/
		    
	    	
	    //Comparator<Integer> c=new                 //As comparator is an interface we cannot create objects of it. Also no class in Collection API implements this interface,so we need to create our own class which implements this Comparator interface
	    //Or else we can create an anonymous class which implements this interface		
	    Collections.sort(values4, c);  //to define c we need to create an object of comparator interface like above
	    Collections.sort(values4, (i, j)-> i%10>j%10?1:-1); //in place of object of comparator i.e c we can write the actual lamda expression
	    for(Integer o:values4){
	    	System.out.println(o);
	    }

	}

}
