package practicing;

import java.util.Scanner;

public class addingint {

	public static void main(String[] args) {

     double	a=10.01;
     double b=20.31;
     
     System.out.println("lets print a number in user input");
     
     Scanner keaper=new Scanner(System.in);
     
     System.out.println("enter a number for a: ");
     a=keaper.nextInt();
     System.out.println("enter a number for b: ");
     b=keaper.nextInt();
     keaper.close();

     double sum=a+b;
     
     System.out.println("Sum of two number is: "+sum);
     
	}

}
