package oop.flexible.copy;

public class InFlexibleCompanyDemo {
    public static void main(String[] args) {
    	
    	//Employee 타입의 배열을 선언 및 생성하기
    	Employee[] emps = new Employee[3];
    	emps[0] = new MereClerk("철수", 100);
    	emps[1] = new MereClerk("철수", 100);
    	emps[2] = new Manager("홍길동", 200, "개발부");
    	
    	System.out.println("현재 월급입니다");
    	printEmployee(emps);
  
       
        
        System.out.println("올린 후의 월급입니다.");
        
        
        for (Employee emp : emps) {
			emp.manageSalary(10);
		}
        
        printEmployee(emps);
        
//        mereClerk1.manageSalary(10);
//        System.out.println(mereClerk1.getName() + "의 현재 월급은 " + mereClerk1.getSalary() + " 만원 입니다.");
//        
//        mereClerk2.manageSalary(10);
//        System.out.println(mereClerk2.getName() + "의 현재 월급은 " + mereClerk2.getSalary() + " 만원 입니다.");
//        
//        manager.manageSalary(10);
//        System.out.println(manager.getName() + "의 현재 월급은 " + manager.getSalary() + " 만원 입니다.");
        
   }

	private static void printEmployee(Employee[] emps) {
		for (Employee emp : emps) {
    		System.out.println(emp.getName() + "의 현재 월급은 " + emp.getSalary() + " 만원 입니다.");
			
		}
	}
}

