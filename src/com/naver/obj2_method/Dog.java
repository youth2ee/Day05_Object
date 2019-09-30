package com.naver.obj2_method;

import java.util.Scanner;

public class Dog {

	public void bark(int size, int count) { //어떤개의 소리를 출력 
		//()안은 매개변수를 선언 , 여러개 받을 수도 있다.
		//매개변수는 지역변수 - 이 안에서만 사용가능
		//메인클래스 안에서 size를 주면 dog클래스가 그 값을 받아서 답을 줄게 

		//대형견 - 컹컹 60이상
		//중형견 - 멍멍 30이상 60미만
		//소형견 - 왈왈 30미만

		//size변수는 메인에 있다.

		String sound=null;

		if(size>=60) {
			sound ="컹컹";
		}else if (size>=30) { //60이상은 이미 걸러짐
			sound="멍멍";
		}else if (size>=0 && size<30) {
			sound="왈왈";
		}

		for(int i=0;i<count;i++) {
			System.out.println(sound);
		}

	}



}
