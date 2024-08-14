package com.test.pj;

public class Cat {
//	int Cat_age;
//	String name;
//	
//	void info() {
//		String s = "고양이 이름은 " + name + "이고 나이는 " + Cat_age + " 살 이다";
//		System.out.println(s);
//	}
	public Cat() {
		System.out.println("오버로딩 테스트");
	}
	public Cat(int a , String b) {
		System.out.println("오버로딩 테스트1");
	}
	public Cat(int a, String b, int c) {
		System.out.println("오버로딩 테스트2");
	}

}
