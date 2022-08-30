
public class administrator extends Employee{
//Extends Employee
	int type;//Variable to determine the administrator's position
	
	public void personData() {
		System.out.println("This administrator's name is: " + name + "\nTheir age is: " + age);
			
	}
	public void employeeData() {
		System.out.println("\nThey work for the company: " + getComp());
		//if statements from 1 to 4 to check the type of administrator
		if(type == 1) {
			System.out.print("\nThis administrator works for HR");
		}
		if(type == 2) {
			System.out.print("\nThis administrator is a recruiter");
		}
		if(type == 3) {
			System.out.print("\nThis administrator is a secretary");
		}
		if(type == 4) {
			System.out.print("\nThis administrator is a Legal type");
		}
		}
	
	public void setComp(String comp) {
		this.comp = comp;
	}
	public void setType(int type) {//method to set the type of the administrator
		this.type = type;
	}
	
	public void setName(String name) {
		this.name = name;
}
	public void setAge(int age) {
		this.age = age;
	}
	
}