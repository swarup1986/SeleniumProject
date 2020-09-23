package JavaPrograms;

import java.io.BufferedReader;  //these are resources,so after using it we should close the same
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {

	public static void main(String[] args) throws Exception { //These are checked exception which the compiler handles
		int n=0;
		System.out.println("enter a no.");
		BufferedReader br=null;
		try
		{
		br=new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		System.out.println(n);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		finally
		{
			br.close();  //Ideally all open resources should be clsoed under the finally block as in case of some exception aslo it will execute and thus close the resources
		}
		
		System.out.println("After finally block we try to print something");
        try(BufferedReader br1=new BufferedReader(new InputStreamReader(System.in))) //this is called try block with resource where we don't need catch or finally block
        {                                              //in the above try block we are defining the resource in try itself,hence no need to close it with any finally block,if the resource goes out of scope it will close automatically
    		System.out.println("In try block with resource");
        	int n1=Integer.parseInt(br1.readLine());  
	
		}
        }

}
