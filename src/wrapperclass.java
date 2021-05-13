
public class wrapperclass {

	public static void main(String[] args)

	{

		String a = "100";
		System.out.println(a + 20);
		// conversion from string to int
		int b = Integer.parseInt(a);
		System.out.println(b + 10);

		// conversion from String to double
		String v = "22.45";
		double n = Double.parseDouble(v);
		System.out.println(n + 20);

		// String to boolean
		String nm = "false";
		boolean cd = Boolean.parseBoolean(nm);
		System.out.println(cd);

		// int to string

		int d = 100;
		String sa = String.valueOf(d);
		System.out.println(sa);

		String u = "1000a"; // numberformatexpection will come
		int af = Integer.parseInt(u);
		System.out.println(af);

	}

}
