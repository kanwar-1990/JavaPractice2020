 package interviewquestion;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {

		/*
		 * finding duplicate element in array by brute force and HasSet-->TimeComplexity
		 * 0(n*n)--Worst Solution
		 * 
		 */

		String Name[] = { "java", "javascript", "ubonto", "c#", "c+", "java" };

		// for loop used, to iterate all the string value from
		for (int i = 0; i < Name.length; i++) {
			// inner for loop used. to compare i+1= ex--Java+javascript
			for (int j = i + 1; j < Name.length; j++) {

				// both i and j are compare , if they both are not equal duplicate value will be
				// printed
				if (Name[i].equals(Name[j])) {
					System.out.println("Duplicate String is==>" + Name[i]);
				}
			}
		}

		// HasSet : JavaCollection: It Stores unique value--->Time Complexity"o:(n)
		Set<String> store = new HashSet<String>();
		// hasSet Object is created and Name string is given to name
		for (String name : Name) {

			// if every value stored is not unique ,compiler will come out of the if
			// condtion and duplicate value will be printed
			if (store.add(name) == false) {
				System.out.println("duplicate value==>" + name);
			}
		}

	}
}