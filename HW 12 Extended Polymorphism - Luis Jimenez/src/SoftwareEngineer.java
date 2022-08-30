
class SoftwareEngineer extends Employee {
	//Extends Employee
	int rank; //int rank and programmer to determine the specialty of the programmer and their rank
	int programmer;
	
	public void personData() { //method to obtain SoftwareEngineer's name
		System.out.println("\nThis employee's name is: " + name + "\nTheir age is: " + age);
		
	}
	
	public void setName(String name) {
		this.name = name;
}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setComp(String comp) {
		this.comp = comp;
	}
	
	public void employeeData() { //employeeData method expanded to include if statements to determine the specialty of the engineer and their rank, and output both as well

		if (rank == 1) {
			
			System.out.print("\nThis Software Engineer is a Junior");
			
		}
		if (rank == 2) {
			
			System.out.print("\nThis Software Engineer is a Middle");
		}
		if (rank == 3) {
			
			System.out.print("\nThis Software Engineer is a Senior");
		}
		if (programmer == 1) {
			
			System.out.print("\nThis Software Engineer specializes in C");
		}
		if (programmer == 2) {
			
			System.out.print("\nThis Software Engineer specializes in Java");	
		}
		if (programmer == 3) {
			
			System.out.print("\nThis Software Engineer specializes in both Java and C");
		}
		System.out.println("\nThey work for the company: " + getComp());
	}
//setRank and setProg to set both rank and programming specialty.	

	public void setRank(int rank) {
		this.rank = rank;
	}
	public void setProg(int programmer){
		this.programmer = programmer;
	}
}
