
class vold

{
	void fani() {
		System.out.println("super class");
	}
}

class dito extends vold {
	void fani() {
		System.out.println("i am sub class and will override super class if called by creating an object");
	}
}

public class methodoverridding extends dito

{

	public static void main(String[] args)

	{
		dito f1 = new dito();
		f1.fani();

	}
}
