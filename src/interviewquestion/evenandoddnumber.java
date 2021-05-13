package interviewquestion;

import java.util.Scanner;

public class evenandoddnumber {

	public static void main(String[] args) {

		
		
		int i;
		Scanner keaper=new Scanner(System.in);
		System.out.print("Enter the number: ");
		i=keaper.nextInt();
        keaper.close();
		//any number which is divisble by 2 and  0 are even numbers
		
		if(i % 2 == 0)
		{
			System.out.println("is even number ");
		}
		else
		{
			System.out.println("is odd number ");

		}
	}

}
