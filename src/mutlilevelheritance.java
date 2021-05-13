
class hello {
	void helli() 
	{
		System.out.println("i will be called by sub class --google");
	}
}

class google extends hello {
	static void god() 
	{
		System.out.println("i will be called by my sub class--mutlilevelheritance");
	}
}

public class mutlilevelheritance extends google

{
	public static void main(String[] args) 
	{
		god();
		mutlilevelheritance kj = new mutlilevelheritance();
		kj.helli();

	}

}
