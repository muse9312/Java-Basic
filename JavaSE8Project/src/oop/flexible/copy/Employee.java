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
		System.out.println("Employee ������ ȣ���");
	}
	
	

	public String getName() {
	    return this.name;
	}

	public double getSalary() {
	    return this.salary;
	}
	
	protected String getInfo() {
		return "Name : " +  name + "�޿� : " + salary;
	}
	
	// �߻� �޼���
	public abstract void manageSalary(double rate);
	
	Employee emp2 = new Manager(getName(), getSalary());
	Employee emp3 = new Manager(name, salary);

	public String getDeptName() {
		// TODO Auto-generated method stub
		return null;
	}

}