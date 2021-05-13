import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {

		
		ArrayList ar=new ArrayList();
		
		ar.add(100);// index=0
		ar.add("kanwar");//1
		ar.add("file");//2
		ar.add(12.22);//3
		ar.add('d');//4
		
		System.out.println(ar.size());
		System.out.println(ar.get(2));
		System.out.println(ar.get(4));
		//System.out.println(ar.get(5)); //java.lang.IndexOutOfBoundsException

		//to get all the method printed we need to use for loop---to print all the arraylist
		
		for(int i=0;i<ar.size();i++)
			
		{
			
			System.out.println(ar.get(i));
		}

		//to have only specific data type in arraylist to be used we need call them
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(15);
		
		ArrayList<String> ar2=new ArrayList<String>();

		ar2.add("hello");
		
	}

}
