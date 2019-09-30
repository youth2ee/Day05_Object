package com.naver.obj2_method;

public class MethodMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodTest4 m4 = new MethodTest4();
		int num = m4.info(10, 20); //정수형의 값이 담아줘라.
		System.out.println(num);
		
		int price=20000;
		price = m4.sale(price); //int형이므로 int형으로 받아준다.
		System.out.println(price);
		
		price = m4.sale(price);
		System.out.println(price);
		
		
	} //메인메서드

}
