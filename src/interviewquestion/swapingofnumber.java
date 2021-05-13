package interviewquestion;

public class swapingofnumber {

	public static void main(String[] args) {

		int i = 10, j = 20;

		System.out.println("before swapping");
		System.out.println("i is equal to " + i);
		System.out.println("j is equal to " + j);

		int temp;
		temp = i;// temp=10 i=j;//j=20 j=temp;//j=10
		i = j;
		j = temp;

		/*
		 * i = j;// 20 j = i;// 20 --bcz of the line by line execution--- i have 20 now
		 * and it will be givem // to j so third variable required
		 */
		System.out.println("after swapping");
		System.out.println("i is equal to " + i);
		System.out.println("j is equal to " + j);

	}

}
