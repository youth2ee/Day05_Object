package com.naver.ex1_school;

import java.util.Scanner;

public class StudentView {

	public void viewAll(Student [] student){ //메서드1

		System.out.println("이름\t번호\t국어\t영어\t수학\t합계\t평균\t");
		for(int i=0;i<student.length;i++) {

			this.viewOne(student[i]);
			
			/*
			System.out.print(student[i].name+"\t");
			System.out.print(student[i].num+"\t");
			System.out.print(student[i].kor+"\t");
			System.out.print(student[i].eng+"\t");
			System.out.print(student[i].math+"\t");
			System.out.print(student[i].sum+"\t");
			System.out.println(student[i].avg+"\t");
			*/

		}//for

	}//viewall 메서드 끝

	/*
	public void viewOne(Student [] student, Scanner sc) { //메서드2
		//메인에 있는 스캐너를 사용하겠다.
		//Scanner sc = new Scanner(System.in);

		System.out.println("번호입력");
		int j = sc.nextInt();

		-
		System.out.println("이름 : "+student[j-1].name);
		System.out.println("번호 : "+student[j-1].num);
		System.out.println("국어 : "+student[j-1].kor+"점");
		System.out.println("영어 : "+student[j-1].eng+"점");
		System.out.println("수학 : "+student[j-1].math+"점");
		System.out.println("합계 : "+student[j-1].sum+"점");
		System.out.println("평균 : "+student[j-1].avg+"점");
		System.out.println("==================");
		 -

		boolean flag = false; //false면 못찾은거 true면 찾은거

		for(int i=0;i<student.length;i++) {
			if(j==student[i].num) {
				//학생정보출력
				System.out.println("이름 : "+student[i].name);
				System.out.println("번호 : "+student[i].num);
				System.out.println("국어 : "+student[i].kor+"점");
				System.out.println("영어 : "+student[i].eng+"점");
				System.out.println("수학 : "+student[i].math+"점");
				System.out.println("합계 : "+student[i].sum+"점");
				System.out.println("평균 : "+student[i].avg+"점");
				System.out.println("==================");

				flag=true;
				break;

			}//if문 끝
		}//for문 끝

		if(!flag) { 
			//flag <-> !flag 
			//()안은 true가 되어야 돈다. ()안이 false면 그냥 종료
			//flag==false 이렇게는 안묻는게 좋음
			System.out.println("해당학생이 없습니다.");
		}//if문 끝
	}//viewOne 메서드 끝

	 */

	public void viewOne (Student studen){

		if(studen!=null) {
			System.out.println("이름 : "+studen.name);
			System.out.println("번호 : "+studen.num);
			System.out.println("국어 : "+studen.kor+"점");
			System.out.println("영어 : "+studen.eng+"점");
			System.out.println("수학 : "+studen.math+"점");
			System.out.println("합계 : "+studen.sum+"점");
			System.out.println("평균 : "+studen.avg+"점");
			System.out.println("==================");
		} else {
			System.out.println("해당학생을 찾을 수 없습니다.");
		}


	}
}


