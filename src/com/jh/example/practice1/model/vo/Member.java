package com.jh.example.practice1.model.vo;

public class Member {
	// 클래스 다이어그램을 보고 클래스 작성
	// 클래스 실습 예제
	
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() {
		
	}
	
	public void chageName(String name) {
		this.memberName = name;
	}
	public void printName() {
		System.out.println(memberName);
	}
	
}
