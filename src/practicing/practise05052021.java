

package practicing;

import java.util.Random;
import java.util.Scanner;

public class practise05052021 {

	public static void main(String[] args) {

		
		
		String str = "thisIsNaveenAutomationLabstesting";
		 
		  int count = 0;
		  
		  if(Character.isLowerCase(str.charAt(0))) {
		   count++;
		  }
		  for (int i = 0; i < str.length(); i++) {
		   if (str.charAt(i) >= (char) 65 && str.charAt(i) <= (char) 90 ) {
		    count++;
		   }
		  }
		  System.out.println(count);
	}
}


