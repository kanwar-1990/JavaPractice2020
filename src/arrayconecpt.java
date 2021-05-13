
public class arrayconecpt {

	public static void main(String[] args) {
		
		int i[]=new int[4];
		
		// issue --int i =10;
		
		      //i=20; what happens in this case is 20 will replace 10 ,which we dont want as we want 10.20 to get updated
		//hence,array is used and also for a data type we need to keep on declaring variable to avoid that we need to used array 
		// at a time only one variable can we stored 
		//array is used to store similar data types in a array variable
		
		// dis advantages of array
		// size is fixed---to overcome this challenge ---we use collection--arraylist--hashtable--use dynamic array
		// stores only similar data type--Object array 
		
		// int array
		// lower bound/index =0
		// upper bound/index=n-1(n is the size of array)
		//these are single dimension array
		
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[0]);
		System.out.println(i[1]);
	    //System.out.println(i[4]); //java.lang.ArrayIndexOutOfBoundsException ===error brcz size of array is 4. 
	
		System.out.println(i.length);// length will give you size of array
	
		for(int j=0;j<i.length;j++) // i.length also means size of array or we can use i[4]
			
		{
			System.out.println(i[j]);
			
		}
		//char array
		
		char c[]=new char[4];
	
	 c[0]='c';
	 c[1]=2;
	 c[2]='v';
	 c[3]='g';		
	
	 System.out.println(c[2]);
	 
	// double array
	
	double db[]=new double[3];
	
	db[0]=11.00;
	db[1]=1.00;
	db[2]=2.45;
	System.out.println(db[2]);
	
	// String array
	
	String str[]=new String[3];
	
	str[0]="whats";
	str[1]="up";
	str[2]="30";
	
	System.out.println(str[2]);
	System.out.println(str.length);
	
	for(int k=0;k<str.length;k++) {
		System.out.println(str[k]);
	}
	
	//Object array-- object is a class--which can help store multiple data type rather than creating multiple array to store them
	
	Object oj[]= new Object[3];	
	
	oj[0]="kanwar";
	oj[1]="4/1/1990";
	oj[2]='m';
	//oj[3]="sexy";// arrayindexoutofbounds exception
	
	//System.out.println(oj[3]);
	
	for(int g=0;g<oj.length;g++)
		
	{
		System.out.println(oj[g]);
	}
	}
}
