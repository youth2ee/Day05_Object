package com.naver.ex1_school;

import java.util.Scanner;

public class SchoolMain {

	public static void main(String[] args) {

		//한명의 학생을 만들어서 데이터를 입력하고 각 정보를 출력하세요
		Scanner sc = new Scanner(System.in);

		Student stu=null;
		Student [] student = new Student [3];
		//배열 / 참조변수를 담는 공간을 만든다. 공간만 만든다. 아직 그안의 내용는 안만들어짐.

		System.out.println(student[0]); //heap에 자동으로 null 초기화된다.

		for(int i=0;i<3;i++) {
			stu = new Student(); //클래스로 객체를 만들겠다.
			student[i] = new Student();

			System.out.println("이름");
			// student[i].name=sc.next(); 
			//★에러 - 아직 student[i] = new Student(); 없으면 여기안에 학생없으므로 오류 
			//그러나 student[i] = new Student();를 위에 넣어주면 이제 가능.
			stu.setName(sc.next());
			System.out.println("국어");
			stu.setKor(sc.nextInt());
			System.out.println("영어");
			stu.setEng(sc.nextInt());
			System.out.println("수학");
			stu.setMath(sc.nextInt());

			stu.setSum(stu.getKor()+stu.getEng()+stu.getMath());
			stu.setAvg(stu.getSum/3);

			student[i] = stu; //주소값을 받는다.

		} //for문 끝
		//이 경우 for문안에서 계속 덧대는 것이므로
		//기억되는 값은 하나뿐이다

		for(int i=0;i<student.length;i++) {
			System.out.println(student[i].name);
			System.out.println(student[i].kor);
			System.out.println(student[i].eng);
			System.out.println(student[i].math);
			System.out.println(student[i].sum);
			System.out.println(student[i].avg);
		}

	}

}
