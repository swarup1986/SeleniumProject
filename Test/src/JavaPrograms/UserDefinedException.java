package JavaPrograms;

public class UserDefinedException {

	public static void main(String[] args) {
		int i,j,k;
		i=10;
		j=12;
		try{
		k=i/j;
		if(k==0)
			//throw new Exception();  //we can either call the default exception
		    throw new SwarupException("Dividing an int with lesser int will produce 0");  //we can throw our own exception
		System.out.println(k);
		}
		catch(SwarupException e){  //even we can accept our own exception
			System.out.println("Error "+e.getMessage()); 
			//if we don't give any message in our SwarupException class we will get null in e.getMessage()
		}
}

}
