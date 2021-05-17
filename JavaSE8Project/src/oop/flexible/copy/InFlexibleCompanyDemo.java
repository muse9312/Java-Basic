package oop.flexible.copy;

public class InFlexibleCompanyDemo {
    public static void main(String[] args) {
    	
    	//Employee Ÿ���� �迭�� ���� �� �����ϱ�
    	Employee[] emps = new Employee[3];
    	emps[0] = new MereClerk("ö��", 100);
    	emps[1] = new MereClerk("ö��", 100);
    	emps[2] = new Manager("ȫ�浿", 200, "���ߺ�");
    	
    	System.out.println("���� �����Դϴ�");
    	printEmployee(emps);
  
       
        
        System.out.println("�ø� ���� �����Դϴ�.");
        
        
        for (Employee emp : emps) {
			emp.manageSalary(10);
		}
        
        printEmployee(emps);
        
//        mereClerk1.manageSalary(10);
//        System.out.println(mereClerk1.getName() + "�� ���� ������ " + mereClerk1.getSalary() + " ���� �Դϴ�.");
//        
//        mereClerk2.manageSalary(10);
//        System.out.println(mereClerk2.getName() + "�� ���� ������ " + mereClerk2.getSalary() + " ���� �Դϴ�.");
//        
//        manager.manageSalary(10);
//        System.out.println(manager.getName() + "�� ���� ������ " + manager.getSalary() + " ���� �Դϴ�.");
        
   }

	private static void printEmployee(Employee[] emps) {
		for (Employee emp : emps) {
    		System.out.println(emp.getName() + "�� ���� ������ " + emp.getSalary() + " ���� �Դϴ�.");
			
		}
	}
}

