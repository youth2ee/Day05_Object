package com.naver.obj2_method;

import java.util.Scanner;

public class MethodMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\

		MethodTest2 m2 = new MethodTest2();
		
		int [] ar= {1,2,3,4};
		m2.info1 (ar);
		//info1안의 nums 배열과 main의 ar배열은 같은 주소를 가지므로, 한군데가 배열내용 바꾸면 나머지도 바뀜
		
		for(int i =0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}//for문
		
	}//메인

}
