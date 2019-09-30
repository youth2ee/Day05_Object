package com.naver.obj1;

public class ObjectMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums; //변수선언
		//System.out.println(nums); //초기화 안했으므로 에러
		//모든 변수는 사용하려면 초기화를 해야한다 
		//지역변수의 초기화는 개발자가 직접해야한다. 직접 지정해야한다.
		
		nums = new int [3]; //초기화
		System.out.println(nums[0]);
		//heap영역에 만들어지는 변수는 개발자가 초기화하지않으면 
		//초기화가 자동으로 이루어진다.
		
		//초기화
		//정수형은0 실수형은0.0
		//모든 레퍼런스타입(참조변수)의 초기값은 null
		
		String [] names = new String[2];
		System.out.println(names[0]); //자동으로 초기값 null이 나온다.
		
		
		
	}

}
