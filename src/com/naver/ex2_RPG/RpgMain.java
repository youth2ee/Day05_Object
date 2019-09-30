package com.naver.ex2_RPG;

public class RpgMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체생성
		
		/*
		Sword s1 = new Sword();
		s1.name="단검";
		s1.power=10;
		s1.level=1;
	*/

		Knight s2 = new Knight();
		s2.name="영";
		s2.hp=0;
		s2.level=1;
		
		s2.sword = new Sword();
		s2.sword.name = "단검";
		s2.sword.power=10;
		s2.sword.level=1;

		System.out.println(s2.sword.name);

	}

}
