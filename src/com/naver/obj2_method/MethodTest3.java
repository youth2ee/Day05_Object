package com.naver.obj2_method;

public class MethodTest3 {

	
	//가변으로 인자값을 받고 싶을 때(타입은 같아야 한다.) 
	public void info(String name, int ... num) { //num의 값을 유동적으로 받겠다.
		//num = int[]과 같아진다.
		//하지만 선언되는 데이터 타입이 int와 int[]은 다르다.
		
		for(int i =0;i<num.length;i++) {
		System.out.println(num[i]);
		}
		
		
	}//info 메서드
	
}
