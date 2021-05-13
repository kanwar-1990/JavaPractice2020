package interviewquestion;

public class mainmethodoverloading extends folder{

	public static void main(String[] args) 
	{

		System.out.println("i am the main method");
		main(10);// its a static method hence seperate memory would have been created so  no object creation
    folder.main(args);

	}

	/*
	 * public static void main(String[] args)// duplicate method or main method is
	 * not possible
	 * 
	 * {
	 * 
	 * }
	 */

	public static void main(int a) {
		System.out.println("i am method overloading main method");

	}
	
}


class folder
{
	public static void main(String[] args) 
	
	{
		System.out.println("different class i am method overloading main method");

	}

}