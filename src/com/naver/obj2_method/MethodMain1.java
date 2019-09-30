package com.naver.obj2_method;

public class MethodMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 클래스의 멤버들을 사용하려면 먼저 "객체"를 생성하세요
		
		MethodTest1 m1 = new MethodTest1();
		
		//클래스변수명.메서드명();
		//메서드는 뒤에 소괄호가 붙는다.
		//멤버메서드 중에서 info1을 호출한다.
		m1.info1();
		
		//멤버메서드 중에서 info2를 호출한다.
		m1.info2();
		
	}//메인

}
