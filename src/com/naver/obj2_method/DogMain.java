package com.naver.obj2_method;

import java.util.Scanner;

public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog bb = new Dog();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("강아지 크기");
		int s = sc.nextInt();
		
		System.out.println("횟수");
		int c = sc.nextInt();
		
		bb.bark(s,c); //()안의 값은 '인자값(argument)'이라고 한다.
		//()안에 int 타입인  값을 넣어줘
		//매개변수에 필요한 값을 넣어줘
		//여기서는 선언할 필요없다. 
		//클래스 안과 같은 이름일 필요는 없다.
		//그럼 dog 클래스 안에가서 내가 그 값을 size에 넣어서 답을 줄게
		
	}

}
