
public class paramtrizedcons {

	public static void main(String[] args) {
		
		new paramtrizedcons(6,9);
		new paramtrizedcons(.01,'h');
	}
	paramtrizedcons(int a,int b)
	{
		System.out.println("parameter a & b will be called");
	}
	
	paramtrizedcons(double c,char e)
	
	{
		System.out.println("parameter c & b will be called");
	}	
}
