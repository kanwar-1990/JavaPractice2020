package practicing;

public class reversestring
{
	public static void main(String[] args) {
		
		//reverse string based on indexes
		
		String g="i am so lonely";
		int len=g.length();
		System.out.println(len);
		String str =" ";
		
		for(int i=g.length()-1;i>-1;i--)
			
		{
			str=str+g.charAt(i);

		}
			
		System.out.println(str);

		
	}
}