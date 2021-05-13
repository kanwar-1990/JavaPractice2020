package interviewquestion;

import java.util.Scanner;

public class addingpractice {

	public static void main(String[] args) {

		float a=10.02f;
		float b=30.02f;
		
		Scanner keeper = new Scanner(System.in);

		System.out.println("add input for a: ");
		a = keeper.nextInt();

		System.out.println("add input for b:");
		b = keeper.nextInt();

		float sum = a + b;
		keeper.close();
		System.out.println("sum of a & b is " + sum);
		
		

	}

}
