
public class methodoverloading // developing multiple method having different argument list

{
	
	int i=10;// method,variable are stored in stack memory
	static int age =10;//static variable method are stored in meta space hence we donot call by object for static method
	
	// main method can be overloaded
	//you cannot create a method inside a method
	//duplicate metho--same method with same number of arguments are not allowed 
	//method overloading---when the method name is same with different  of arguments or input parameter within the same class

	public static void main(String[] args) {

		methodoverloading(5);
		methodoverloading k1 = new methodoverloading(); //objects are allways stored in heap memory 
		k1.methodoverloading('h');
		k1.methodoverloading(0.01, 'f');
	}

	static void methodoverloading(int a) // we can call static variable by creating a object as well , however this is not a 
	// good practice 
	
	{
		System.out.println("calling static method");
	}

	  void methodoverloading(char b)//non static method can we only called by creating a object
	  {
		System.out.println("calling non static method");

	}

	void methodoverloading(double d, char g) {
		System.out.println("calling non static method");

	}

}

