package interviewquestion;

public class missingintegernumberinarray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 5 };
		// sum=15---1+2+3+4+5=15
		// if 3 is missing
		// sum is 12--1+2+4+5=12

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("the sum is" + sum);

		int sum1 = 0;

		for (int j = 1; j <= 5; j++) {

			sum1 = sum1 + j;
		}

		System.out.println("the sum is" + sum1);

		System.out.println("missing number is" + (sum1 - sum));

	}

}
