package com.java.kiosk;

public class Product {
	String name;
	int price;
	
	Product(int price, String name){
		this.name = name;
		this.price = price;
	}
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	Product(String name){
		this.name = name;
//		this.price = 1000;
	}
	Product(){
		
	}
	
	//함수들
//	public static void main(String[] args) {
//		
//	}
	
	public void info() {
		System.out.println(name+" 가격:"+price+"원");
	}
}
