
public class localandglobalvariable {

	String s="kanwar"; //global variable
    int i=10; //global variable --- they can we accessed from other method by creating an object
	
	public static void main(String[] args) {

		int i=10;// Local variable--this variable can be used with in this method only
		char k='a'; // Local variable
	System.out.println(i);
	System.out.println(k);
	//to call global variable we need to create an object 
	//new localandglobalvariable();--- new operator is used to create object
	localandglobalvariable obj= new localandglobalvariable();
	System.out.println(obj.s);
	System.out.println(obj.i);
		
	}

	static void newy()
	{
		int i=10; //local variable --this variable can be used with in this method only
		int j=20; //local variable
	}
	
}
