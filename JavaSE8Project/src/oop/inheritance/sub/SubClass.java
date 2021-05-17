package oop.inheritance.sub;

import oop.inheritance.BassClass;

public class SubClass extends BassClass {

//	String s; // 필드

	public SubClass(String st) {
		super(st);
		System.out.println(super.s);
	}
//	public SubClass() {
//		System.out.println("나는 자식입니다");
//	}

}
