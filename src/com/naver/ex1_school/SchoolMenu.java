package com.naver.ex1_school;

import java.util.Scanner;

public class SchoolMenu {
	//메인에 들어갈 코드. 메뉴선택역할

	public void start() {


		Scanner sc = new Scanner(System.in);

		boolean check = true;
		int num=0;
		int count=0;
		Student [] student=null;

		StudentView sv = new StudentView();
		//case2,3에서 필요한 친구. 클래스 StudentView를 불러오기 위함.
		//그러나 객체생성은 한번만 하면 되므로 반복문안에 있을 필요없다.
		
		StudentInput si = new StudentInput(); //객체생성

		
		while(check) {
			
			System.out.println("1. 성적입력");
			System.out.println("2. 전체조회");
			System.out.println("3. 학생검색");
			System.out.println("4. 학생삭제");
			System.out.println("5. 종      료");
			num = sc.nextInt();
			
		
			switch(num) {
			case 1: //성적입력
				student = si.makeStudent();
				break;

			case 2: //전체조회
				//student는 클래스 Student의 배열
				sv.viewAll(student); //메서드를 불러오기로 하자
				//객체생성은 한번만 하면되므로 밖에 있어도 됨. 
				//하지만 메서드는 반복해서 불러와야 하므로 반복문안에 있어야 한다.
				break;

			case 3: //학생검색
				//sv.viewOne(student, sc); //메서드를 불러오기

				Student studen = si.fineByNum(student);
				//student값을 클래스 StudentInput에 넣어주고
				//return받은 값을 새로 선언한 객체 값에 넣어주고
				//그 받은 객체값을 다시 클래스 StudentView에 넣어준다.

				sv.viewOne(studen);
				//클래스 StudentView는 받은 객체값 studen을 클래스 안에서 인출해서 보여준다.
				break;

			case 4: //학생삭제
				student = si.deleteStudent(student);
				break;

			default:
				//check=false;
				check=!check;
			}//switch문 

		}//while문



	}//start



}//SchoolMenu
