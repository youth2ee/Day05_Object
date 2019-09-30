package com.naver.ex1_school;

import java.util.Scanner;

public class StudentInput {

	public Student fineByNum (Student [] student) {
		//번호를 스캐너로 입력받아서
		//학생들 중에 한명 찾아서 출력한다.
		//출력은 view에 있고 
		//메인에서 3번을 눌렀을 때 

		Scanner sc = new Scanner(System.in);

		System.out.println("번호입력");
		int num = sc.nextInt();

		Student studen =null;
		for(int i=0;i<student.length;i++) {
			if(num==student[i].num) {
				studen = student[i];
				break;
			}//if
		}//for

		return studen;

		/*
		int i=0;
		for(i=0;i<student.length;i++) {
			if(num==student[i].num) {
				break;
			}//if
		}//for
		return i;
		 */

	}

	public Student[] makeStudent() {

		Scanner sc = new Scanner(System.in);
		System.out.println("인원수");
		int count = sc.nextInt();

		Student [] student = new Student [count]; //★★★
		//받은 count 수만큼 heap에 student배열의 공간을 만들어준다.
		//이 공간은 한번만 만들어줘도 된다.

		for(int i=0;i<student.length;i++) {

			Student stu = new Student(); //★★★
			//이게 3번 돌아야 값을 받고 계속 새로 만든다.
			//한명만들고 새로운 주소만들어서 집어넣고 그러는것
			//stu는 여기서만 쓰니까 선언도 여기서 해도 된다.

			stu.num = i+1;
			System.out.println("이름");
			stu.name =sc.next();
			System.out.println("국어");
			stu.kor =sc.nextInt();
			System.out.println("영어");
			stu.eng =sc.nextInt();
			System.out.println("수학");
			stu.math =sc.nextInt();
			stu.sum = stu.kor+stu.eng+stu.math;
			stu.avg = stu.sum/3;
			System.out.println("=============");

			student[i] = stu; //★
			//stu에 입력받은 값들의 '주소값'을 student[]에 넣어준다.
			//'주소값'을 넣어주는 것
			//stu와 student[]에는 주소값이 있고
			//stu.name과 student[].name에 실제값이 존재
		}//for

		return student;
	}
	
	public Student[] deleteStudent(Student [] student){
		
		System.out.println("삭제할 학생의 번호");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		Student [] student2 = new Student[student.length-1];
		int index=0;
		int i=0;
		
		for(;i<student.length;i++) {
			if(count==student[i].num) {
				break;
			}//if
		}//for1
			
		for(int j=0;j<student.length;j++) {
			if(i==j) {
				continue;
			}//if
			student2[index] = student[j];
			index++;
		}//for2
		
		System.out.println("이름\t번호\t국어\t영어\t수학\t합계\t평균\t");
		for(int i2=0;i2<student2.length;i2++) {

			System.out.print(student2[i2].name+"\t");
			System.out.print(student2[i2].num+"\t");
			System.out.print(student2[i2].kor+"\t");
			System.out.print(student2[i2].eng+"\t");
			System.out.print(student2[i2].math+"\t");
			System.out.print(student2[i2].sum+"\t");
			System.out.println(student2[i2].avg+"\t");

		}//for
			return student2;

	}//deleteStudent

}
