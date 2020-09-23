package JavaPrograms;
class Hi extends Thread{ //to include multi-threading our class has to extend the class Thread
	//public void show()
	public void run(){
		for(int i=0;i<5;i++){
		System.out.println("Hi");
		try{Thread.sleep(500); //This will add a delay of 0.5 sec while printing Hi. Main is the single thread of execution in Java which calls this method
		}
		catch(Exception e){}
		}
	}
}
class Hello extends Thread{
	//public void show()
	public void run(){  //As the methods are independent we can utilise the milti-threading capability of our multi-processor
		for(int i=0;i<5;i++){    //So while we can run obj2.run parallely to obj.run, so Hi and Hello is printed parallely instead of printing Hi and then printing Hello after that
		System.out.println("Hello");
		try{Thread.sleep(500);
		}
		catch(Exception e){}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		Hi obj1=new Hi();
		Hello obj2=new Hello();
		obj1.start(); //when our class extends Thread they implicitly calls start method
		try{Thread.sleep(500);  //Now scheduler randomly picks up any thread for execution so we can get Hello two times in betw
		}     //So add any sequence so that Hi is always printed above Hello we can add a delay between the two threads being called
		catch(Exception e){}  //so we can add a thread.sleep between calling of these two thread so as to bring some ordering between execution
		
		obj2.start(); //And when we call start method it internally calls the run() method,so we need to rename the show method as run
		//obj1.show();
		//obj2.show();
		

	}

}
