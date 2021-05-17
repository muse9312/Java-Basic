package oop.flexible.copy;

/* 관리자 클래스 */
public class Manager extends Employee {
	// 부서명
	private String DeptName;

	public Manager(String name, double salary) {
//        this.name = name;
//        this.salary = salary;
		super(name, salary);
		System.out.println("Manager 생성자 호출됨");
		

	}
	
	public void deptName(String name, double salary, String DetpName) {
		this(name, salary);
		this.DeptName = DetpName;
	}

	public void manageSalary(double rate) {
		salary = salary + salary * (rate / 100);
		salary += 20; // 20만원을 추가로 받는다.
	}

	@Override
	public String getInfo() {
		return super.getInfo() + "부서명 : " + DeptName;
	}
	
	// 부모클래스로 부터 상속받은 메서드가 아니다고, 자식클래스 단독으로 가지고 있는 메서드이다.
	public String getDeptName() {
		return DeptName;
	}
	
	
}
