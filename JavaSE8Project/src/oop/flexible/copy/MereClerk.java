package oop.flexible.copy;

/* 평사원 클래스 */
public class MereClerk extends Employee {
    public MereClerk (String name, double salary) {
//        this.name = name;
//        this.salary = salary;
    	super(name,salary);
    	System.out.println("MereClerk 생성자 호출됨");
    	
    }
    
    public void manageSalary(double rate) {
        salary = salary+ salary*(rate/100);
    }
    
}
