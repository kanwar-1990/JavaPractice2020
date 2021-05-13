public class Programs {
	public static void main(String[] args) {

		Programs kj = new Programs();
		kj.hello(); // object is created to call non static method
		fun();// no object is required to be created for calling static method
		
    if(System.out.append("hello world")==null) // to run hello world without ; "==" compare to null
    {
    	
    }
	}

	void hello() {
		System.out.println("non statisc method");

	}

	static void fun() {
		System.out.println("static method ");
	}
 
	
	
	
}
