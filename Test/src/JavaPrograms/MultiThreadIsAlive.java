package JavaPrograms;

public class MultiThreadIsAlive {

	public static void main(String[] args) throws Exception {
		Thread t1=new Thread(()->{
		for(int i=0;i<=5;i++){
			System.out.println("This example shows joining of thread before main thread runs");
			try{Thread.sleep(1000);}
			catch(Exception e){}
		}});
		Thread t2=new Thread(()->{
			for(int i=0;i<=5;i++){
				System.out.println("So if we run without join main thread will execute whatever is pending wihout the thread");
				try{Thread.sleep(500);}
				catch(Exception e){}
			}
		});
		System.out.println(t1.isAlive()); //returns true or false, so before joining like below it will be true
		t1.join(); //t1 joins the main thread
		t2.join();
		System.out.println(t1.isAlive()); //Here it will be false as t1 thread has joined the main method
		System.out.println("If anything is here for execution main thread will execute in between thread execution, so we need to perform the thread joins so that this happens after thread execution");
		
		

	}

}
