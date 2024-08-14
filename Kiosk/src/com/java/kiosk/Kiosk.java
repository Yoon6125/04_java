package com.java.kiosk;

import java.util.Scanner;

public class Kiosk {
	void run() {
		System.out.println("======CatCafe======");
		System.out.println("1.식사  2.음료  3.디저트");
		System.out.println("숫자 선택");
		Scanner sc = new Scanner(System.in);
		
		int choose =sc.nextInt();
		
		if(choose==1) {
			System.out.println("식사를 선택");
			System.out.println("=====================");
			System.out.println("1.라면  2.김밥");
			int menu =sc.nextInt();
			if(menu== 1) {
				System.out.println("라면을 선택");
			}else if(menu== 2) {
				System.out.println("김밥을 선택");
			}else {
				System.out.println("선택한게 없음");
			}

		}else if(choose==2) {
			System.out.println("음료를 선택");
		}else if(choose==3) {
			System.out.println("디저트를 선택");
		}else {
			System.out.println("선택한게 없음");
		}
		
	}
}
