package com.naver.ex1_school;

public class Student { //클래스
	//<멤버변수>
	private int num;
	private String name;
	
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}


	//<멤버메서드>
	//공식 : 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]){}
	//접근지정자 : public 
	//[그외지정자] : 모르겠으면 생략
	//리턴타입 : void
	//메서드명 : 개발자가 지정
	//매개변수 : 모르겠으면 쓰지마

	//메서드 선언
	public void info() {
		System.out.println("Info Start");
		System.out.println("Info Finish");
	}

}
