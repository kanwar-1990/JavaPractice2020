package practicing;

public class swapingwithoutthirdvariable {

	public static void main(String[] args) {

		String s1 = "hello";
		String s2 = "world";

		System.out.println("before swapping");
		System.out.println(s1);
		System.out.println(s2);

		s1 = s1 + s2;
		System.out.println(s1);

		s2 = s1.substring(0, 5);
		s1 = s1.substring(5, 10);

		System.out.println("after swapping");
		System.out.println(s1);
		System.out.println(s2);

	}

}
