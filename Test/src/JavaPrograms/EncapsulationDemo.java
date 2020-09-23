package JavaPrograms;
class Student{
	private int RollNo;  //encapsulation is binding data with methods which we do using setters and getters method
	private String Name;  //Foe encapsulation we can declare data as private so that we can maintain log of access or modification of data 
	public void setRollNo(int roll){  //these are getters and setters method to set the value of member variables and getting the values
		RollNo=roll;           //We genrally avoid setting values after creating objects like obj.RollNo=10
	}     
	public int getRollNo(){
		return RollNo;
	}
	public String getName() {  //One can genrate getter and setter method through right click>Source>Generate getter and setters
		return Name;         //One will get option to select the variable for which we want to generate getter and setter method
	}
	public void setName(String name) {
		Name = name;
	}
	
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Student S1=new Student();
		S1.setRollNo(4);
		System.out.println(S1.getRollNo());
		

	}

}
