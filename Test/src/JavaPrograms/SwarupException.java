package JavaPrograms;

import java.util.Scanner;

public class SwarupException extends Exception {
	public SwarupException(String s){  //to pass on any message we need to create constructor with String parameter
		super(s);		//to print any specific message we need to use super class of Exception Class
	}
    
	public static void main(String[] args) {
		System.out.println("Enter a no. ");
		Scanner sc=new Scanner(System.in);  //scanner is an easier class for user input from keyboard or file that inputbufferreader
		int n=sc.nextInt();         //also in scanner we don't need to convert input string to int like bufferreader
		System.out.println(n);
		}
class MyThread extends SwarupException implements Runnable{ //either the new thread extend the Thread class or it can implement the Runnable class to achieve multi-threading

	public MyThread(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

}
