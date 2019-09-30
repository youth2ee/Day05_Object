package com.naver.obj1;

import java.util.Scanner;

public class ObjectMain {

	public static void main(String[] args) {
		//객체 (object, Instance) 생성
		Scanner sc;  //변수선언 
		sc = new Scanner(System.in); //객체생성
		//클래스명 변수명; -> 일종의 변수선언
		//클래스명 '참조'변수명 = new 클래스명(); -> 객체생성

		//obj 자체는 reference 타입이면서 지역변수
		ObjectTest1 obj = new ObjectTest1(); //객체생성
		//'참조'변수명.멤버변수명 - 불러오는법
		obj.money=100000; //money는 primitive 타입이면서 멤버변수
		obj.name="이가영"; //name은 reference 타입이면서 멤버변수
		obj.number="12345678";
		//통장을 만들고 데이터를 넣은 것

		System.out.println(obj.name);
		System.out.println(obj.number);
		System.out.println(obj.money);

		//통장1개를 더 만들고 데이터를 입력하고 출력
		ObjectTest1 obj2 = new ObjectTest1();
		obj2.money=200000;
		obj2.name="이지윤";
		obj2.number="87654321";

		System.out.println(obj2.name);
		System.out.println(obj2.number);
		System.out.println(obj2.money);

		System.out.println(obj==obj2); 
		//만약에 obj와 obj2 각자에 같은 값을 넣어도 heap에서의 주소가 다르므로 같지않다.

		System.out.println(obj.name == obj2.name);
		//만약에 obj.name와 obj2.name 각자에 같은 값을 넣어도 이경우는 string이므로
		//reference타입이기때문에 무조건 heap에 넣은 값의 주소만을 담기 때문에
		//heap에서의 주소가 다르므로 같지않다.

		//클래스는 또 다른 의미로 개발자가 만드는 DataType
		//클래스이름 자체가 새로운 데이터타입
		
		obj=obj2;
		//obj2를 obj에 넣었다.
		
		System.out.println(obj.name); //원래 obj의 주소는 소멸되어 이제 못찾는다.
		System.out.println(obj==obj2); //이제는 true다. 주소값이 같아졌으므로
		
		
		obj2.money=10;
		System.out.println(obj.money); //10 주소값이 같아졌으므로
		
	}

}
