class Employee {
	String name;
	int age;
	String department;
	
	public void doLogin(){
		this.drawMarker();
		System.out.println("Employee " + this.name + " logged in");
	}
	
	public void doWork(){
		System.out.println("Employee " + this.name + " is at work");
	}

	public void doLogout(){
		System.out.println("Employee " + this.name + " logged out");
	}
	
	public void drawMarker(){
		System.out.println("***************************************");
	}
}


public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.name = "John Doe";
		emp.age = 34;
		emp.department = "Sales";
		
		
		Employee emp1 = new Employee();
		emp1.name = "John Bell";
		emp1.age = 54;
		emp1.department = "shop";
		
		
		emp.doLogin();
		emp.doWork();
		emp.doLogout();

		emp1.doLogin();
		emp1.doWork();
		emp1.doLogout();
	}
}
