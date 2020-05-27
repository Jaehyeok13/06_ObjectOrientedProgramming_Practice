package com.jh.example.practice3.model.vo;

public class Circle {
	// 필드 문제2
	private static final double PI = 3.14;
	private static int radius = 1;
	
	public Circle() {
		System.out.println(radius);

		System.out.println(radius * radius * PI);

		System.out.println(2 * PI * radius);
	}
	
	public void incremenRadius() {
		System.out.println(++radius);
	}
	
	public void getAreaOfCircle() {
		System.out.println(radius * radius * PI);
	}
	
	public void  getSizeOfCircle() {
		System.out.println(2 * PI * radius);
	}
}
