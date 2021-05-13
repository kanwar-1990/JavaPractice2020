package practicing;

public class child_class extends practicingstaticmethodoverriding{

     public void goat() //cannot override an static method 	, it will allow to execute the program
	{
		System.out.println("whats up goat");
	}
	
	
	
	
	public static void main(String[] args) {

		child_class s1=new child_class();
		s1.help();
		s1.goat();
		
		
	}

}
