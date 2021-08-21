package interviewquestion;

public class PartiCharinaString {

	public static void main(String[] args) {

		String s1 = "hello what is there to talk anymore";
		int beforeremoving = s1.length();
		System.out.println(s1.length());

		int AfterRemovingo = s1.replace("o", "").length();

		int count = 0;
		count = beforeremoving - AfterRemovingo;
		System.out.println(count);
		
	}

}
