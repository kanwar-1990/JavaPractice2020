class jaya {
	jaya() {
		System.out.println("print leo");
	}
}

class reena extends jaya {
	reena() {
      super();
		System.out.println("print nardo");
	}
}

class fena extends reena {
	fena() {
           super();
		System.out.println("print chotu");
	}
}

public class superclassmethod extends fena

{
	public static void main(String[] args) {
		new fena();
	}

}
