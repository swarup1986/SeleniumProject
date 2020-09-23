package JavaPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1>{   //This comparable interface has only one method called compareTo,meaning this is a functional interface
	int rollno,marks;
	String name;
	public Student1(int rollno, int marks, String name) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student1 o) { //we have to implement the unimplemented method compareTo from Comparable interface in our class
		
		return marks>o.marks?1:-1;
	}
	//or we can compare name length and sort based on that too like below:
	/* 
	 public int compareTo(Student1 o){
	 return name.length()>o.name.length()?1:-1;
	 }
	 */
	
}
public class ComparatorInterfaceDemo {

	public static void main(String[] args) {
		List<Student1> student1=new ArrayList<>();
		student1.add(new Student1(1,55,"Vunti"));
		student1.add(new Student1(2,70,"Khunti"));
		student1.add(new Student1(3,75,"Mukhu"));
		student1.add(new Student1(4,80,"Tultuli"));
		
		Collections.sort(student1);  //if we need to apply sorting to our own class objects we need to implement the Comparable interface
		//Collections.sort(student1,(i,j)->i.rollno>j.rollno?1:-1); --we can write like this as well which will overwrite our logic from comparable class,this comparator method will overwrite comparable class logic
        //So this will sort based on their id and not based on their marks  		
		for(Student1 s:student1){
			System.out.println(s);
		}
          
	}

}
