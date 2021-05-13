
public class twodimensionalarray {

	public static void main(String[] args) {

		int c[][] = new int[3][4];

		// first row
		c[0][0] = 10;
		c[0][1] = 20;
		c[0][2] = 30;
		c[0][3] = 40;

		// second row
		c[1][0] = 50;
		c[1][1] = 60;
		c[1][2] = 70;
		c[1][3] = 80;

		// third row

		c[2][0] = 90;
		c[2][1] = 100;
		c[2][2] = 110;
		c[2][3] = 120;

		System.out.println(c[2][2]);
		System.out.println(c[1][2]);

		// print all the value is for loop
		// row=0,col=0 to 3
		// row=1,col=0 to 3
		// row=2,col=0 to 3
		System.out.println(c.length);// will show the lenght of row
		System.out.println(c[0].length);

		for (int row = 0; row < c.length; row++) {

			for (int col = 0; col < c[0].length; col++) {
				System.out.println(c[row][col]);
			}

		}

	}

}
