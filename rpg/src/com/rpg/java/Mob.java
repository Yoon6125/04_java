package com.rpg.java;

public class Mob {
	String name;
	int hp;
	int attack_point;

	public Mob(String name, int hp , int attack_point) {
		this.name = name;
//		int y= 100;
//		int z=100;
		
		System.out.println("이름:" +name);
		System.out.println("체력:" +hp);
		System.out.println("타점:" +attack_point);
		
	}
	
	void use() {
		System.out.println(name+"이 출현");
	}

}