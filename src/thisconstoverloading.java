
public class thisconstoverloading // to avoid multiple objects getting created we use this function, constructor
									// overloading

{

	public static void main(String[] args) {
		new thisconstoverloading(5);

	}

	thisconstoverloading(int a) {
		this(5, 'k');
		System.out.println("third constructor");

	}

	thisconstoverloading(int a, char b) {
		this(0.01, 'h');
		System.out.println("second constructor");
	}

	thisconstoverloading(double c, char b) {

		System.out.println("first constructor");
	}
}
