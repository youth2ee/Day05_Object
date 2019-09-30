package com.naver.ex1_school;

import java.util.Scanner;

public class SchoolMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 성적입력
		//2. 전체조회
		//3. 학생을 검색
		//4. 학생삭제
		//5. 종료
		//5번 누를때까지 한다.
		//과목은 국어영어수학
		// 인원은 N명
		//1번누르면 학생의 인원수묻고 
		//인원수만큼 이름, 국어, 영어, 수학 점수를 차례대로 묻는다.
		//2번누르면 전체학생의 이름, 번호, 국어, 영어, 수학, 총점, 평균
		//3번누르면 학생의 번호를 입력하면 그 학생의 정보가 뜬다.

		SchoolMenu sm = new SchoolMenu();
		sm.start();

	} //메인

}
