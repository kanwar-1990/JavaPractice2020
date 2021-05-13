package practicing;

import java.util.HashSet;
import java.util.Set;

public class practise05052021 {

	public static void main(String[] args) {

		String s[] = { "java", "c", "java", "javascript","c","javascript" };

		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					System.out.println(s[i]);
				}
			}
		}

	
	Set<String> store=new HashSet<String>();
	
	for(String name:s)
	{
		if(store.add(name)==false)
		{
			System.out.println(name);
		}
	}
		
	}
}
