
abstract class Employee extends person {
//Employee extends person
	protected String comp; //String to put company's name

	public void personData() { //method from person class, uses setName and setAge to get input
		System.out.println("This employee's name is: " + name + "\nTheir age is: " + age);
		
	}
	
	public void employeeData() { //method to output the name of the company user the getter getComp();
		System.out.println("\nThey work for the company: " + getComp());
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setCompany(String comp) {
		this.setComp(comp);
	}

	public String getComp() { //Getter to obtain company name
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	
} 
	
