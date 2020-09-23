package JavaPrograms;
class Hi1 implements Runnable{ //we can implement the Runnable interface to achieve multi-threading
	
	public void run(){
		for(int i=0;i<5;i++){
		System.out.println("Hi");
		try{Thread.sleep(500);
		}
		catch(Exception e){}
		}
	}
}
class Hello1 implements Runnable{
	
	public void run(){  
		for(int i=0;i<5;i++){    
			System.out.println("Hello");
		try{Thread.sleep(500);
		}
		catch(Exception e){}
		}
	}
}
public class MultithreadWithInterface { //while doing multi-threading we can take help of interface in situations when our class wants to extend another class
                                        // As jave does not support multiple inheritence,we cannot say like class A extends Thread,A
	public static void main(String[] args) {  //In situation like above Runnable interface helps in achieving multi-threading as well as multi-inheritence
		Hi obj1=new Hi();
		// Runnable obj1=new Hi(); //We can write like this also to create the objects
		//Now the Hi class only implements Runnable and does nothing else,so we can use anonymous class
		// With the anonymous class we can reduce the no. of code and simultaneously execution time
		// we can comment out the original Hi class, Also for obj4 we are utilizing lambda expression as Runnable is a functional interface which has only one method
		Runnable obj3=new Runnable(){
			public void run(){
		
			for(int i=0;i<5;i++){
				System.out.println("AnonymousClass3"+Thread.currentThread().getPriority()); //with currentthread method we can get property of current thread, in this case priority of the thread
				try{Thread.sleep(500);
				}
				catch(Exception e){}
				}
			}
	};
		Hello obj2=new Hello();
		Runnable obj4=()->
			{
				for(int i=0;i<=5;i++){
					System.out.println("LambdaExpression");
					try{Thread.sleep(500);}
					catch(Exception e){}
				}
			};
			
		Thread t1=new Thread(obj1); //We need to pass the objects of Runnable interface to the Thread Constructor to run the start method
		
		Thread t2=new Thread(obj2);
		Thread t3=new Thread(obj3);
		Thread t4=new Thread(obj4);
		Thread t5=new Thread(()->{
			for(int i=0;i<=5;i++){
				System.out.println("LambdaExpression which can be called in the object creation stage itself");
				System.out.println("We can do it the object created is used only once so we can pste the lamda expressi");
				try{Thread.sleep(500);}
				catch(Exception e){}
			}
		},"Fifth Thread");
		t1.setName("FIrstThread");
		t2.setName("Second Thread");
		System.out.println(t1.getName()); //If we don't set the thread name it will print as Thread-0,Thread-1....
		System.out.println(t2.getName());
		System.out.println(t5.getName());  //We can define the thread name in the object creation stage also
		
		t1.setPriority(1); //we can define priority with numbers which is 1 which denotes least priority
		t2.setPriority(10); //10 defines max priority
		t5.setPriority(Thread.MIN_PRIORITY);  //we can define priirity with this thread property as well instead of numbers
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority()); //By default the priority of threads is 5 which is normal priority
	
		t1.start(); //This time we need to execute the start methods with objects of Thread Class
		try{Thread.sleep(500);  
		}     
		catch(Exception e){}  
		
		t2.start();
		t3.start();
		t4.start();
	}

}
