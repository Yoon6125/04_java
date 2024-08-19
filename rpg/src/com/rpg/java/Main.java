package com.rpg.java;



public class Main {

	public static void main(String[] args) {
		Mob a= new Mob("1", 500, 100);
		Character b= new Character("달렉", "기사", 200, 100, 40);
		
		a.use();
		System.out.println("달렉의 공격");
		int Mob_hp_left;
		System.out.print(a.name+"은/는"+b.attack_point+"의 피해를 입었다");
		Mob_hp_left=(a.hp-b.attack_point);
		
		if(Mob_hp_left==0) {
			System.out.println(b.name+"의 승리");
		}else {
			System.out.printf(a.name+"의 남은 체력:"+"%d",Mob_hp_left);
		}
	}

}
