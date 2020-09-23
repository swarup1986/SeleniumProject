package JavaPrograms;

class Counter{
	int count;
	public synchronized void Increment(){ //sometimes what happens is that if multiple threads are accessing the same function
		count++;           //count=count+1               // and they access the same count value and increment to the same value
	}                     //So the count value becomes erroneous like in our case sometimes it displays 1561 or 1570 instead of 2000 after both thread are run
}    //so in these cases we add synchronized keyword so that only one thread accesses the function at a time and the other thread waits for execution completion of previous thread

public class MultiThreadSync {

	public static void main(String[] args) throws Exception {
		Counter obj1=new Counter();
				
		Thread t1=new Thread(new Runnable()
				{
			     public void run(){
			    	 for(int i=1;i<=1000;i++){
			    		obj1.Increment();
			    	 }
			     }
				});
		Thread t2=new Thread(new Runnable()
				{
			      public void run(){
			    	  for(int i=1;i<=1000;i++){
			    		  obj1.Increment();
			    	  }
					}
				}
				);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(obj1.count); //if we don't add the join method main thread will print the value of this print statement before thread t1 increments the count value
	}

}
