
public class encapsulation {

	//implementing encapsalution ----its also called as data hiding
	//implement encaps---accessed modifer should be private in nature, and getter and setter method is used to make it publicily avaiable 
	//advantages---it improves the maintaince of the code,felixbilty, reusability 
	//to provide high level data security we use encapsulation
	//to access private variables we use setter and getter which are public method 
	//private data variable ---so that these variables cannot be accesed from outside the class
	
	private String empname;
	private int ssn;
	private int emp_age;

//getter and setter methods--to set and get values of the feilds.
	
	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public int getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}

	public static void main(String[] args) {
		
		encapsulation e1=new encapsulation();
		e1.setEmpname("kanwar");
		e1.setEmp_age(31);
		e1.setSsn(12345);

		System.out.println("employee name is "+e1.getEmpname());
		System.out.println("employee age is "+e1.getEmp_age());
		System.out.println("employee ssn number is "+e1.getSsn());
		System.out.println("class name is :"+e1.getClass());

	}

}
