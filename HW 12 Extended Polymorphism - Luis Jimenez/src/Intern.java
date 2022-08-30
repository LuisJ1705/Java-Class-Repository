
public class Intern extends Employee {
	//Extends Employee
	
	String duty; //string duty to set the duty for interns
	
	public void personData() {//personData method expanded to include the intern's duty
		System.out.println("This intern's name is: " + name + "\nTheir age is: " + age + "\nTheir duty is: " + duty);
		
	}
	
	public void employeeData() {
		System.out.println("\nThey work for the company: " + getComp());
	}
	
	public void setComp(String comp) {
		this.comp = comp;
	}
	
	public void setName(String name) {
		this.name = name;
}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setDuty(String duty) {//setDuty method to set the intern's duty
		
		this.duty = duty;
	}

}
