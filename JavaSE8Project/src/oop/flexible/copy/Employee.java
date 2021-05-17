package oop.flexible.copy;

public abstract class Employee {
	

	protected String name;
	protected double salary;

	public Employee() {
		super();
	}
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
		System.out.println("Employee 생성자 호출됨");
	}
	
	

	public String getName() {
	    return this.name;
	}

	public double getSalary() {
	    return this.salary;
	}
	
	protected String getInfo() {
		return "Name : " +  name + "급여 : " + salary;
	}
	
	// 추상 메서드
	public abstract void manageSalary(double rate);
	
	Employee emp2 = new Manager(getName(), getSalary());
	Employee emp3 = new Manager(name, salary);

	public String getDeptName() {
		// TODO Auto-generated method stub
		return null;
	}

}