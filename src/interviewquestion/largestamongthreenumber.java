package interviewquestion;

public class largestamongthreenumber {

	public static void main(String[] args) {

		int i=500;
		int y=200;
		int z=600;
		
		if(i>y && i>z )
		{
			System.out.println("i is the greatest");
			
		}else if(i>z)
		{
			System.out.println("y is the greatest");
		} else
		System.out.println("z is the greatest");
		
	}

}

