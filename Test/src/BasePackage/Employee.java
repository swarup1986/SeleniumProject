package BasePackage;

public class Employee {
	public String name="Swarup";

	   // salary  variable is visible in Employee class only.
	   private double salary=10000;
	   
	   public Employee() {
		   
	   }
	   
	   // The name variable is assigned in the constructor.
	   public Employee (String empName) {
	      name = empName;
	   }

	   // The salary variable is assigned a value.
	   public void setSalary(double empSal) {
	      salary = empSal;
	   }

	   // This method prints the employee details.
	   public void printEmp() {
	      System.out.println("name  : " + name );
	      System.out.println("salary :" + salary);
	   }

	   public static void main(String args[]) {
	      Employee empOne = new Employee("Ransika");
	      empOne.setSalary(1000);
	      empOne.printEmp();
	      empOne.parampassing(20);
	      int ReturnValue=empOne.returnvalue();
	      System.out.println("The return value is " +ReturnValue);
	      int[] ArrList=empOne.reverse(new int[] {1,2,3,4,5});
	      for(int element:ArrList)
	      {
	    	  System.out.println("The reverse Array is "+element);
	      }
	   }
	   public void parampassing(int a){
		   int value =a*30;
		   System.out.println("The value after multiplication is " +value);
	   }
	   public int returnvalue(){
		   int a=10;
		   int b=20;
		   int returnV=a*b;
		   return returnV;	   
	   }
	   public void printnameandsal() {
		   Employee empOne = new Employee();
		   System.out.println("name  : " + empOne.name );
		   System.out.println("salary :" + empOne.salary);
		   empOne.printnameandsal();
	   }
	   public static int[] reverse(int[] list) {
		   int[] result = new int[list.length];

		   for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		      result[j] = list[i];
		   }
		   return result;
		}
	   
}
