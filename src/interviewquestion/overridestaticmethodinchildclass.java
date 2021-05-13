package interviewquestion;

public class overridestaticmethodinchildclass {
	
	public static void bus() 
	
	{
	System.out.println("bus is not functioning");
		
	}

	public void car()
	{
		System.out.println("car transport is not allowed");
	}
}

class lockdown extends overridestaticmethodinchildclass
{
  public static void bus() 
	
	{
	System.out.println("bus is not functioning");
		
	}

	public void car()
	{
		System.out.println("car transport is not allowed");
	}	
	
}

class nationality 
{
	public static void main(String[] args) {
		
		lockdown l1=new lockdown();
		l1.car();
		l1.bus();
		
	}

	
}