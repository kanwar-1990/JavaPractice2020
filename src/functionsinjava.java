import java.util.ArrayList;

public class functionsinjava {

	public static void main(String[] args) {

		functionsinjava obj = new functionsinjava();

		obj.withoutreturntype();
		System.out.println(obj.returntype());
		ArrayList<String> ar1 = obj.arraytypereturn();
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));
		}
		int[] obj1=obj.singledimensionarray();
		
		for(int i=0;i<obj1.length;i++)
		{
			System.out.println(obj1[i]);
		}

		System.out.println(obj.divide(10, 30));
		System.out.println(obj.getStatevalue("assam"));
	}

	public void withoutreturntype()

	{
		System.out.println("withoutreturntype");
	}

	public int returntype() {

		System.out.println("with return type");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;

	}

	public ArrayList<String> arraytypereturn() {

		System.out.println("arraylist method");
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("kanwar");
		ar.add("kajol");
		ar.add("corona");
		ar.add("longdistance relationship");
		ar.add("dont know what to do");
		return ar;

	}

	public int[] singledimensionarray() {

		System.out.println("singledimensionarray");
		int a[] = new int[4];

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;

		return a;
	}

	public int divide(int x, int y) {
		System.out.println("divide method");

		int z = y / x;
		return z;

	}

	public String getStatevalue(String CityName) {
		System.out.println("getstatevalue");

		if (CityName.equals("bangalore")) {
			System.out.println("it in india");
		} else if (CityName.equals("london")) {
			System.out.println("its in UK");
		}

		return CityName + " is not in the data yet";

	}

}
