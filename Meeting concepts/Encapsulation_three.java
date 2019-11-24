class Employee {
	private String name;
	private int age;
	private String department;
	
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
		emp.setName("John Doe");
		emp.setAge(34);
		emp.setDepartment("Sales");
		
		emp.doLogin();
		emp.doWork();
		emp.doLogout();
	}
}
