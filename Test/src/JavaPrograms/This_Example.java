package JavaPrograms;

public class This_Example {
	   int num = 10; // Instance variable num
		This_Example() {
	      System.out.println("This is an example on keyword this");	
	   }

	   This_Example(int num) {
		  this(); // Invoking the default constructor
	      this.num = num; // Assigning the local variable num to the instance variable num
	      	   
	   }
	   
	   public void greet() {
	      System.out.println("Hi Welcome to Tutorialspoint");
	   }
	      
	   public void print() {
	      int num = 20; // Local variable num
	      System.out.println("value of local variable num is : "+num);// Printing the local variable
	      System.out.println("value of instance variable num is : "+this.num);// Printing the instance variable
	      this.greet(); // Invoking the greet method of a class    
	   }
	   {this.greet();}
	   
	   public static void main(String[] args) {
	      
	      This_Example obj1 = new This_Example(); // Instantiating the class
	     obj1.print();  // Invoking the print method
		  This_Example obj2 = new This_Example(30);// Passing a new value to the num variable through parametrized constructor
	      obj2.print(); // Invoking the print method again
	      
	   }
	   	   
	}
       class testThisKeyword{
	   public void message(){
		   System.out.println("");
	   }
	   
}


