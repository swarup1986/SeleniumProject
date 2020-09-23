package JavaPrograms;


public class VarargsDemo {

   public static void main(String args[]) {
      // Call method with variable args, this type variable length arguments might be required when we are not sure of the no. of arguments
	   printMax(34, 3, 3, 2, 56.5);   //as the function is static we can call the same with function name only
      printMax(new double[]{1, 2, 3});
      printMax();
      VarargsDemo obj1=new VarargsDemo();
      obj1.sum(4,5,31231,21313,13123,123,31231,123123,123);// if we work with non-static function then we need to call them with objects
   }

   public static void printMax( double... numbers) {
      if (numbers.length == 0) {
         System.out.println("No argument passed");
         return;
      }

      double result = numbers[0];

      for (int i = 1; i <  numbers.length; i++)
      if (numbers[i] >  result)
      result = numbers[i];
      System.out.println("The max value is " + result);
   }
   public void sum(int ... n){
	   
	   int sum=0;
	   for(int k:n){
		   sum=sum+k;
	   }
	   System.out.println("The addition of the nos. are "+sum);
	   
   }
}

