
public class whileloop {

	public static void main(String[] args)

	{

		// while loop

		int i = 1; // intialization

		// dis-advan
		// it will generate infinity loop if incremental and decremental is not part of
		// it
		while (i <= 10) // condition
		{
			System.out.println(i);
			i = i + 1; // incremental or decremental
		}

		System.out.println("*******");

		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
		}

		System.out.println("*********");

		for (int k = 10; k <=-1; k--)

		{
			System.out.println(k);
		}
	}

}
