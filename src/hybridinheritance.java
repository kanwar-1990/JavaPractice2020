class leo {
	void googi() {
		System.out.println("print me i am not static");
	}
}

class nardo extends leo // having same super class leo
{
	void goagi() {
		System.out.println("print me i am not static");
	}
}

class chotu extends leo // having same super class leo
{
	static void gaagi() {
		System.out.println("print me i am static");
	}
}

public class hybridinheritance extends chotu

{

	public static void main(String[] args)

	{
		gaagi();
		chotu t1 = new chotu();
		t1.googi();
		nardo k1 = new nardo();
		k1.goagi();
	}

}
