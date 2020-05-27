package com.jh.example.practice2.model.vo;

public class Product {
	//필드 문제
	private String pName;
	private int price;
	private String brand;
	
	public Product() {
		
	}
	
	public void information() {
		System.out.println("제품명 : " + pName +"	가격 : " + price + " 브랜드 : " + brand);
	}
}
