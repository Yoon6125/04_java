package com.rpg.java;

public class Character {
	String name;
	String job;
	int hp;
	int attack_point;
	int dp;
	
	public Character(String name, String job, int hp , int attack_point, int dp) {
		this.name=name;
		this.job=job;
		this.hp=hp;
		this.attack_point=attack_point;
		this.dp=dp;
		
		System.out.println("이름:" +name);
		System.out.println("직업:" +job);
		System.out.println("체력:" +hp);
		System.out.println("타점:" +attack_point);
		System.out.println("방어도:" +dp);
		
		
	}
}
