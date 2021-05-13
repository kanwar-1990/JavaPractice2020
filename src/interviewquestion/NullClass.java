package interviewquestion;

public class NullClass {

	public static void main(String[] args) {

		// null is an keyword

		// 1 Wrapped class
		Integer i = null;
		int j = i;

		String g = null;
		//System.out.println(j);
		System.out.println(i);
		//
		System.out.println(g);

		// 2
		NullClass obj = null;

		try {
			obj.Student(); // non static method cannot be called by references object since the object can
			// only be null in this position
		} catch (Exception e) {
			System.out.println("null pointer exception please continue");
		}

		obj.Stem();// Static memory being in seperate place can be called by variable obj
		// eventhough it has null in it

	}

	public static void Stem() {

		System.out.println("I am the Stem");
	}

	public void Student() {

		System.out.println("I am the Student");

	}
}
