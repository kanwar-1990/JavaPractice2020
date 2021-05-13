
class gopi
{
	void faltu()
	{
		System.out.println("i am non static method");
	}
}

class kishan extends gopi
{
	void jaguar()
	{
		System.out.println("i am a non static method too");
	}
}


public class hierarchicalinheritance extends kishan

{
	
	
	public static void main(String[] args) 
	{
	
		hierarchicalinheritance j=new hierarchicalinheritance();
		j.jaguar();
		kishan k=new kishan();
		k.faltu();
	}

}
