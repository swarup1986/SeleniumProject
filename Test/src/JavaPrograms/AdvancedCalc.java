package JavaPrograms;

public class AdvancedCalc implements calculatorinterface{

	public static void main(String[] args) {
		int x=44;
		
		AdvancedCalc obj1=new AdvancedCalc();       //can allow both parent & child class methods i.e sin & add1
	obj1.sin();
	obj1.add1();
    calculatorinterface obj2=new AdvancedCalc();      //baseclass reference & child class objects
   // obj2.sin();                                   //obj2 cannot access childclass methods
    obj2.add1();
    
   //calculatorinterface obj3=new calculatorinterface();      //java does not allow creation of objects for interface
  //  AdvancedCalc obj3=new calculatorinterface();            //does not allow creation of objects for interface
	}
	public static void sin()
	{
		System.out.println("I am in Advanced Calulator SIn");
	}
	@Override
	public void add1() {
		System.out.println("I am in Inteface method");
		
	}
	
}



