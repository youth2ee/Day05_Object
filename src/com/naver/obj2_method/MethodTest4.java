package com.naver.obj2_method;

import java.util.Scanner;

public class MethodTest4 {
	
	public int info(int num1, int num2) { 
		//return type : void
		//void : return할게 없다는 의미
		
		int sum = num1 + num2;
		return sum;
		//sum값을 return받고 싶으므로 return type을 sum의 데이터타입으로 바꿔준다.
		
	} //info 메서드
	
	public int sale(int price) {
		int total=0;
		total = (int)(price*0.8);
		return total;
	}// sale 메서드

}
