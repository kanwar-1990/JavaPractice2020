public class ifelse {

	public static void main(String[] args) {

		if (3 > 1) {
			System.out.println("print me allways");
		} else {
			System.out.println("if not print me");
		}

		if (2 > 1) {
			if (0 > 1) {
				System.out.println("print me i am nested if");
			} else {
				System.out.println("if not print me ");
			}
		} else {
			System.out.println("i am allways right");
		}
	}
	
	 
}
