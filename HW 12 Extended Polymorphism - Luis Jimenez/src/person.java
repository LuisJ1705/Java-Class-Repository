
abstract class person {
//Person class contains the method personData, it uses the methods setName and setAge to output both with this method
	int age;
	String name;
	public void personData() {
		System.out.println("This employee's name is: " + name + "\nTheir age is: ");
		
	}
	public void setName(String name) {
		this.name = name;
}
	public void setAge(int age) {
		this.age = age;
	}
}
