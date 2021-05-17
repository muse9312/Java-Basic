package oop.flexible.copy;

import chap03.types.MyDate;

public class TestInheritance {

	public static void main(String[] args) {

		// Manager 객체생성
		Manager mgr = new Manager("관리자", 100.0);

		System.out.println(mgr.getName());
		System.out.println(mgr.getSalary());

		// MereClerk 객체생성
		MereClerk mereClerk = new MereClerk("미어캣", 200.0);

		System.out.println(mereClerk.getName() + " " + mereClerk.getSalary());

		// Employee 객체생성
//		Employee emp = new Employee("부모" , 150.0);

//		System.out.println(emp.getName() + " " + emp.getSalary());

//		Manager mgr2 = new Manager("관리자2", 250.0, "인사부");
//		MereClerk mereClerk2 = new MereClerk("평사원", 120.0);
//		System.out.println(mgr2.getInfo());
//		System.out.println(mereClerk2.getInfo());
//		

		// 다양성 (poly morphism)을 적용해서 객체를 생성하기
		// One Interface, Mutiple implementation
		// 부모 타입의 변수에 자식 객체를 생성해서 대입할 수있다.
		Employee emp1 = new Manager("다형성", 150.0);
		Manager mgr3 = (Manager)emp1;
		System.out.println(mgr3.getDeptName());
		Employee emp2 = new MereClerk("다형성", 130.0);

//		Manager emp3 = new Employee(); (X)
		
		
		System.out.println(emp1.getInfo());
		System.out.println(emp2.getInfo());
//		
//		MyDate[] dates = new Mydate[2] - Homogeneous Collection
//		Employee[] emps = new Enployee[2];
//		emps =  new Manager() - Heterogeneous
		
		Employee[] emps = new Employee[2];
		emps[0] = new Manager("다형성1", 150.0);
		emps[1] = new MereClerk("다형성2", 130.0);
		
	
		for (Employee emp : emps) {
			// emp 변수가 Manager 객체를 생성한 변수인가 ?
			if (emp instanceof Manager) {
				Manager mgr4 = (Manager)emp;
				System.out.print(mgr4.getDeptName() + " ");
			}
			System.out.println(emp.getName());
		}

	}

}
