class Employee {
	protected String name;
	protected int age;
	protected String department;
	
	public void setName(String name){
		if( name == null || name.equals("") ){
			System.out.println("Name cannot be null or empty string");
			return;
		}
		
		this.name = name;
	}
	
	public void setAge(int age){
		if( age < 18 ){
			System.out.println("YOU CANNOT EMPLOY CHILD");
			return;
		}
		this.age = age;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void setDepartment(String department){
		this.department = department;
	}

	public void doLogin(){
		this.drawMarker();
		System.out.println("Employee " + name + " logged in");
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

class Supervisor extends Employee {

	public void doLogin(){
		super.doLogin();
		System.out.println("Check Loggins of employees");
	}

	
	public void doSupervison(){
		System.out.println("Employee " + this.name + " is doing supervison");
	}
}


public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("John Doe");
		emp.setAge(34);
		emp.setDepartment("Sales");
		
		emp.doLogin();
		emp.doWork();
		emp.doLogout();
		emp.toString();
		
		Supervisor sup = new Supervisor();
		sup.setName("John Bell");
		sup.setAge(54);
		sup.setDepartment("Sales");
		
		sup.doLogin();
		sup.doWork();
		sup.doSupervison();
		sup.doLogout();
	}
}
