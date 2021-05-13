package interviewquestion;

import org.omg.CORBA.SystemException;

public class reversestring {

	public static void main(String[] args) {

		
		/*reverse string can be done by 2 method
		for loop and stringbuffer */
	
	String s="fuck you";
	
	
	
	/*
	int len =s.length();
	String rev=" ";
	
	for(int i=len-1;i>=0;i--) // 7;7>=0;6
		
		
	{
	rev=rev+s.charAt(i); //give me the char of index hence--charat is used 
	//rev=blank+u=u
	//rev=u+o=uo
	
	}
		
	System.out.println(rev);
		
	}*/

	StringBuffer b1=new StringBuffer(s);
	
	System.out.println(b1.reverse());
	}
}
