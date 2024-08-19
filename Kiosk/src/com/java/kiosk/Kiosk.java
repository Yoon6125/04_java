package com.java.kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
	void run() {
		Product a= new Product("라면", 1000);
		Product b= new Product("김밥", 2000);
		Product c= new Product("뜨아", 1000);
		Product d= new Product("아아", 2000);
		Product e= new Product("타르트", 1000);
		Product f= new Product("마카롱", 1000);
		
		ArrayList<String> list= new ArrayList<String>();
		ArrayList<Integer> m_list= new ArrayList<Integer>();
		
		
		loop_i: while(true) {
			
			System.out.println("======CatCafe======");
			System.out.println("1.식사  2.음료  3.디저트");
			System.out.println("숫자 선택");
			Scanner sc = new Scanner(System.in);
			
			String choose =sc.next();
			
			switch (choose) {
			case "1": 
				System.out.println("식사를 선택");
				loop_x: while(true) {
					System.out.println("=====================");
					System.out.print("1."); 
					a.info();
					System.out.print("2.");
					b.info();
					String menu =sc.next();
					switch(menu){
					case "1":
						System.out.println("라면이 선택됨");
						list.add(a.name);
						m_list.add(a.price);
						break;
					case "2":
						System.out.println("김밥이 선택됨");
						list.add(b.name);
						m_list.add(b.price);
						break;
					case "x":
						break loop_x;
					}
				}
				
			case "2":
				System.out.println("음료를 선택");
				loop_y:while(true) {
					System.out.println("=====================");
					System.out.print("1."); 
					c.info();
					System.out.print("2.");
					d.info();
					String menu =sc.next();
					switch(menu){
					case "1":
						System.out.println("뜨아 선택됨");
						list.add(c.name);
						m_list.add(c.price);
						break;
					case "2":
						System.out.println("아아 선택됨");
						list.add(d.name);
						m_list.add(d.price);
						break;
					case "x":
						break loop_y;
					}
					
				}
				
			case "3":
				System.out.println("디저트를 선택");
				loop_z:while(true) {
					System.out.println("=====================");
					System.out.print("1."); 
					e.info();
					System.out.print("2.");
					f.info();
					String menu =sc.next();
					switch(menu){
					case "1":
						System.out.println("타르트이 선택됨");
						list.add(e.name);
						m_list.add(e.price);
						break;
					case "2":
						System.out.println("마카롱이 선택됨");
						list.add(f.name);
						m_list.add(f.price);
						break;
					case "x":
						break loop_z;
					}
					
				}
				
			case "x":{
				break loop_i;
			}
			
		}
	}
		//주문개수 및 주문한 물품 가격 연산
		System.out.println("주문 개수:" +list.size());
		System.out.println("====================주문 목록=================");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
			System.out.println("    가격:"+m_list.get(i));
		}
		System.out.println("============================================");
		System.out.println("=====================총 주문 가격================");
		int sum=0;
		for(int i=0;i<m_list.size();i++ ) {
			sum+=m_list.get(i);
		}
		System.out.println(sum+"원");
		System.out.println("==================================================");
		
		System.out.print("결제");
		System.out.print("     결제 취소:x 입력");
		Scanner charge= new Scanner(System.in);
		charge.next();
		if(charge.next()=="x") {
			list.clear();
			m_list.clear();
			System.out.println("주문 개수: " +list.size());
		}
}
}
	