package interviewquestion;
import java.util.Scanner;

public class additionoftwonumbers

{
	public static void main(String[] args)
	
	{
	
		int a,b,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FIRST NUMBER ");
		a=sc.nextInt();
		System.out.println("enter second number");  
		b=sc.nextInt();
		sc.close();
		sum=a+b;
		System.out.println("sum of two numbers are "+sum);
	
	}
}