package oop.inheritance.sub;

import oop.inheritance.BassClass;

public class SubClass extends BassClass {

//	String s; // �ʵ�

	public SubClass(String st) {
		super(st);
		System.out.println(super.s);
	}
//	public SubClass() {
//		System.out.println("���� �ڽ��Դϴ�");
//	}

}
