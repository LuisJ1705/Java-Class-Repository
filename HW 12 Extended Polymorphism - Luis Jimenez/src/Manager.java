
public class Manager extends Employee{
	//Extends Employee
	int specialty; //specialty will be used to check whether the manager is a CEO, Division, or Sales
	
	public void personData() {
		System.out.println("This manager's name is: " + name + "\nTheir age is: " + age);
		
	}
	
	public void employeeData() {
		System.out.println("\nThey work for the company: " + getComp());
		//if statements to check the specialty of the manager
		if(specialty == 1) {
			System.out.print("This manager is a CEO\n");
		}
		if(specialty == 2) {
			System.out.print("This manager specializes in the Division department\n");
		}
		if(specialty == 3) {
			System.out.print("This manager specializes in the Sales department\n");
		}
	}
	
	public void setName(String name) {
		this.name = name;
}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setSpec(int specialty) { //Used to set manager's specialty
		this.specialty = specialty;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
}
