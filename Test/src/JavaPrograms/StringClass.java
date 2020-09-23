package JavaPrograms;

public class StringClass {

	public static void main(String[] args) {
		
		String name="VuntiLPuttiLTultuliLChhanda";
		String []PetName=name.split("L");
		for(int i=0;i<PetName.length;i++)
		{
			System.out.println("Value for "+i+" is " +PetName[i]);
		}
			
	}

}
