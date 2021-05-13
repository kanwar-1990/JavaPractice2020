package oopsinterfaceconcept;

public class induslndbank implements usbank

{
	
//	if a class implements an interface it is mandatory to define/override  all the method of interface  
	public void credit()
	{
		System.out.println("induslnd----credit");
	}
	public void debit()
	{
		System.out.println("induslnd----debit");

	}
	public void loan()
	{
		System.out.println("induslnd----loan");

	}
	public void loans()

	{
		System.out.println("induslnd----loans");

	}

 static public void insurance()
 {
	 System.out.println("induslnd----insurance");
 }

public static void main(String[] args) {
	
	
	induslndbank in =new induslndbank();
	in.credit();
	in.debit();
	in.loan();
	in.loans();
	insurance();
	System.out.println(ga);
	
	
}
}

