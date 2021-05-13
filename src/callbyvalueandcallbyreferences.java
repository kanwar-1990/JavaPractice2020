
public class callbyvalueandcallbyreferences {


    int y;
	 int x;

	public static void main(String[] args) {
 
	
		callbyvalueandcallbyreferences obj=new callbyvalueandcallbyreferences();
		int x=40;
		int y=50;
		System.out.println(obj.sum(x, y));//call by value or pass by value
	obj.x=40;
	obj.y=50;
    obj.swap(obj);
    System.out.println(obj.x);
	System.out.println(obj.y);
	
	}

	 public int sum(int a,int b)
	
	{
	
		int c=a+b;
		
		return c;
		
	}
	
	 public void swap(callbyvalueandcallbyreferences t) //calling by reference ---a method can be called by reference and call by value
	 
	 {
		 int temp;
		temp=t.x;//temp=40
		t.x=t.y;//t.x=50
		t.y=temp;//t.y=40
	 }
}
