package interviewquestion;

public class swappingofnumberwithoutthirdvairable {

	public static void main(String[] args) {

		
		 String a = "Hello";
		  String b = "World";
		   
		  
		  System.out.println("A: "+a);
		  System.out.println("B: "+b);
		  
		  a = a+b;//helloworld
		  b=a.substring(0,5);
		  a=a.substring(5, 10);
		  
		  System.out.println("A after swapped from Hello to: "+a);
		  System.out.println("B after swapped from World to: "+b);
	}

}
