package practicing;

public class FindCapsinString {

	public static void main(String[] args) {

		String s1 = "GoogleHelpMe";
		System.out.println(s1.length());

		int count = 0;
		/*
		 * System.out.println(count); count++; System.out.println(count);
		 */
		for (int i = 0; i < s1.length(); i++) {
			// We Need to keep Comparing from 'g' to 'e'

			if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'z') {
				count++;

			}

		}
		System.out.println(count);

	}

}
