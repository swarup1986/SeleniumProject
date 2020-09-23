package JavaPrograms;

class outerclass2{
	public outerclass2(){
		}
	
	public void add(int i,int j){
		System.out.println(i+j);
		}
	public void add(int i,int j,int f){
		System.out.println(i+j+f);
		}
	public void add(int i,int j, String Operation){
		System.out.println(i+j);
		System.out.println(Operation);
		}
    public outerclass2(int i){
		
	}
    public outerclass2(int i,float j){
    	
    }
    public outerclass2(int i,String Operation){
    	
    }
	
}
	public class TestJavaPrograms {

	public static void main(String[] args) {
		
		outerclass2 obj1=new outerclass2();
		obj1.add(5,15);
		obj1.add(10, 15, 20);
		obj1.add(47, 78, "Swarup");
	}

}
