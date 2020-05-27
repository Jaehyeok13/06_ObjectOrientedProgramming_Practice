package com.jh.example.practice4.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public Student() {
		
	}
	
	{
		grade = 3;
		classroom = 8;
		name = "서재혁";
		height = 177.7;
		gender = 'M';
	}
	
	public void information() {
		System.out.println(grade +"학년" + classroom +"반" + name +"키 : " + height + "성별 : " + gender);
	}
}
