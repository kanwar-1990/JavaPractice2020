import java.util.Hashtable;

public class hashtableconcept {

	public static void main(String[] args) {

		Hashtable<String, String> t1=new Hashtable<String, String>();
		
		/*t1.put(1, "kan");
		t1.put('k',"singh");
		t1.put(1, "kan");
		t1.put('j',"pal");
		t1.put('k',"singh");
		
		
		System.out.println(t1.size());

		System.out.println(t1.get('k'));
		System.out.println(t1.get(1));*/
		
		t1.put("abc","123");
		t1.put("xyz","123");
		t1.put("abc","456");
		t1.put("xyz","456");

		System.out.println(t1.get("abc"));
	    System.out.println(t1.get("xyz"));
		System.out.println(t1.size());
		
		
		/*for(int i=0;i<t1.size();i++)
		{
			System.out.println(t1.get(i));
		}
	
		Hashtable<Integer,String> t2=new Hashtable<Integer,String>();
		
		t2.put(1, "abc");
		t2.put(2,"singh");
		
		System.out.println(t2.get(1));*/
	
		
	}

}
