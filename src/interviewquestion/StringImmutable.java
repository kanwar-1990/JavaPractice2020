package interviewquestion;

public class StringImmutable {

	public static void main(String[] args) {

		String s1 = "Hello World";
		String s2 = "Hello World";
		String s3 = "Kanwar";

		//s2="insta hero";
		if (s1.equals(s2)) {

			System.out.println("Its Immutable");
		}else
		{
			System.out.println("i have changed");
		}

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
