package JavaPrograms;

class calculator{
	public int add(int i, int j){
		return i+j;
	}
}
class AdvCalculator extends calculator{   // IS-A Relationship
	public int sub(int i,int j){
		return i-j;
	}
	
}
class AdvCalculator2 extends AdvCalculator{
	public int mult(int i,int j){
		return i*j;
	}
	
}

public class jaggedArray {   //HAS-A relationship where we can create objects through which we can call different methods of classes

	public static void main(String[] args) { 
		
		int d[][]={
				{2,4,5,7},
				{4,5,7,8,10},
				{10,24}
		};
       for (int i=0;i<d.length;i++){
    	   for (int j=0;j<d[i].length;j++){
    		   System.out.print(" "+d[i][j]);  // to print the values in a row--use print and not println
    	   }
    	   System.out.println();    		   
       }
       for (int k[]:d){
    	   for (int l:k){
    		   System.out.print(" "+l);  // to print the values in a row--use print and not println
    	   }
    	   System.out.println();    		   
       }
       AdvCalculator2 obj1=new AdvCalculator2(); //this is multi-level inheritence where AdvCalculator2 extends AdvCalculator
       System.out.println(obj1.add(70, 80));  //which in turn extends calculator, thus through object of AdvCalculator2 we can
       System.out.println(obj1.sub(100, 80)); // call all the methods of both classes
       System.out.println(obj1.mult(70, 80)); //multiple inheritence where a sub class can extend multiple parent classes is not allowed in JAVA
       
	}

}
