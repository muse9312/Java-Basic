package oop.flexible.copy;

import chap03.types.MyDate;

public class TestInheritance {

	public static void main(String[] args) {

		// Manager ��ü����
		Manager mgr = new Manager("������", 100.0);

		System.out.println(mgr.getName());
		System.out.println(mgr.getSalary());

		// MereClerk ��ü����
		MereClerk mereClerk = new MereClerk("�̾�Ĺ", 200.0);

		System.out.println(mereClerk.getName() + " " + mereClerk.getSalary());

		// Employee ��ü����
//		Employee emp = new Employee("�θ�" , 150.0);

//		System.out.println(emp.getName() + " " + emp.getSalary());

//		Manager mgr2 = new Manager("������2", 250.0, "�λ��");
//		MereClerk mereClerk2 = new MereClerk("����", 120.0);
//		System.out.println(mgr2.getInfo());
//		System.out.println(mereClerk2.getInfo());
//		

		// �پ缺 (poly morphism)�� �����ؼ� ��ü�� �����ϱ�
		// One Interface, Mutiple implementation
		// �θ� Ÿ���� ������ �ڽ� ��ü�� �����ؼ� ������ ���ִ�.
		Employee emp1 = new Manager("������", 150.0);
		Manager mgr3 = (Manager)emp1;
		System.out.println(mgr3.getDeptName());
		Employee emp2 = new MereClerk("������", 130.0);

//		Manager emp3 = new Employee(); (X)
		
		
		System.out.println(emp1.getInfo());
		System.out.println(emp2.getInfo());
//		
//		MyDate[] dates = new Mydate[2] - Homogeneous Collection
//		Employee[] emps = new Enployee[2];
//		emps =  new Manager() - Heterogeneous
		
		Employee[] emps = new Employee[2];
		emps[0] = new Manager("������1", 150.0);
		emps[1] = new MereClerk("������2", 130.0);
		
	
		for (Employee emp : emps) {
			// emp ������ Manager ��ü�� ������ �����ΰ� ?
			if (emp instanceof Manager) {
				Manager mgr4 = (Manager)emp;
				System.out.print(mgr4.getDeptName() + " ");
			}
			System.out.println(emp.getName());
		}

	}

}
