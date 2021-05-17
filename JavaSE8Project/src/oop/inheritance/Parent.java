package oop.inheritance;

public class Parent {
	
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent 기본생성자 호출됨!");
		
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("중복 정의된 Parent 생성자 호출됨");
	}
	
	

}
