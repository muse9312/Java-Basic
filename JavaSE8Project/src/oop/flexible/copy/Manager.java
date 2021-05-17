package oop.flexible.copy;

/* ������ Ŭ���� */
public class Manager extends Employee {
	// �μ���
	private String DeptName;

	public Manager(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
		super(name, salary);
		System.out.println("Manager ������ ȣ���");
		

	}
	
	public void deptName(String name, double salary, String DetpName) {
		this(name, salary);
		this.DeptName = DetpName;
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
		salary += 20; // 20������ �߰��� �޴´�.
	}

	@Override
	public String getInfo() {
		return super.getInfo() + "�μ��� : " + DeptName;
	}
	
	// �θ�Ŭ������ ���� ��ӹ��� �޼��尡 �ƴϴٰ�, �ڽ�Ŭ���� �ܵ����� ������ �ִ� �޼����̴�.
	public String getDeptName() {
		return DeptName;
	}
	
	
}
