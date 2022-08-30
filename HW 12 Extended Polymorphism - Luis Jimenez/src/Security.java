
public class Security extends person {
	//Extends Employee
	String pos;//String used to input the Security position
	String comp;//String used to input the company the Security works for
	public void personData() {//personData method expanded to include position
		System.out.println("\nThis employee's name is: " + name + "\nTheir age is: " + age + "\nTheir position is: " + pos);
		
	}
	
	public void employeeData() {
		System.out.println("\nThey work for the company: " + comp);
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
	
	public void setPos(String position) {//Method to set the Security position.
		
		this.pos = position;	
	}

}
