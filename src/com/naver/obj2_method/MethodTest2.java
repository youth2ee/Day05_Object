package com.naver.obj2_method;

public class MethodTest2 {

	
	public void info1(int [] nums) {
		//n개의 정수를 받아
		//합계 평균 출력
		
		int sum=0; //합계를 담으려고 하는 변수
		double avg=0.0; //평균을 담으려고 하는 변수
		
		for(int i=0;i<nums.length;i++) {
			sum = sum + nums[i];
		}
		
		avg = (double)sum/nums.length;
		
		System.out.println(sum);
		System.out.println(avg);
		
		nums[0]=51;
		nums[1]=52;
		
		nums = new int[2]; //heap에 새로운 공간이 생김. 주소도 달라짐
		nums[0]=100; 
		nums[1]=200;
		// 여기서 값을 수정해도 main에서는 원래 nums 주소만을 가지고 있을 뿐 
		
	}
}
