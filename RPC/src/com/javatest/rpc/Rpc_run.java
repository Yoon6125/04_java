package com.javatest.rpc;

import java.util.Scanner;

public class Rpc_run {
	void run() {
		while(true) {
			
			System.out.println("가위 바위 보 중 하나를 입력하세요:");
			Scanner sc= new Scanner(System.in);
			
			String choose= sc.next();
			System.out.println("당신이 입력한 것:"+choose);
			
			int r=(int) (Math.random()*3+1);
			String com_choose="";
			if(r==1) {
				com_choose="가위";
			}else if(r==2) {
				com_choose="바위";
			}else {
				com_choose="보";
			}
			
			System.out.println("컴퓨터가 낸 것:"+com_choose);
			String result="";
			
			if(choose.equals("가위")) {
				if(com_choose.equals("가위")) {
					System.out.println("비김");
//				result="비김";
				}else if(com_choose.equals("바위")) {
					System.out.println("짐");
				}else {
					System.out.println("이김");
				}
			}else if(choose.equals("바위")) {
				if(com_choose.equals("가위")) {
					System.out.println("이김");
				}else if(com_choose.equals("바위")) {
					System.out.println("비김");
				}else {
					System.out.println("짐");
				}
			}else if(choose.equals("보")) {
				if(com_choose.equals("가위")) {
					System.out.println("짐");
				}else if(com_choose.equals("바위")) {
					System.out.println("이김");
				}else {
					System.out.println("비김");
				}
			}else if(choose.equals("x")) {
				System.out.println("게임을 종료한다");
				break;
			}
			else {
				System.out.println("사용자가 이상한 값을 넣었다");
				break;
			}
			
		}
		
		
	}
}
