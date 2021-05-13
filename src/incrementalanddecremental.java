
public class incrementalanddecremental {

	public static void main(String[] args) {

		int a=1;
		int b=a++;
	    		// post increment-- a value is given first to b and then b is incremented  
		System.out.println(a); //2---
	 System.out.println(b); //1--give a value to b and increament a,hence a output will be 2
	
		int i=1; 
		int j=++i; // pre increment-- mean i will be incremented and then given to j
		System.out.println(i); //2--
        System.out.println(j);	//2--increment the value of i ,hence j will be 2 and i wil be 2
	
        int h=1;
        int g=h--; //post decrement-- first h value is given to g and decremented by 1
        System.out.println(h); //0--give h value to g and it will bcm 1 and decrement h so h value will be 0
        System.out.println(g);//1
        
        int f=1;
        int s=--f;// pre decrement-- decrease the value of f and give it to s 
        
        System.out.println(f); //0--
        System.out.println(s);//0--decrement value of f and give to s which is o. and f value after decrement will also become 0 
      
        
        
	 
	 
	 
	}

	
}
