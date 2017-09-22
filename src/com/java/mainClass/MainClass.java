package com.java.mainClass;
public class MainClass {

	public static void main(String[] args) {
		//클래스 선언
		Sum sum = new Sum();
		Sum sum1 = new Sum(1,2,0);
		//선언된 클래스의 메서드 사용
		System.out.println("SumNumber메서드호출 : "+sum.SumNumber(1, 2));
		System.out.print("Print메서드 호출 : ");
		sum.Print(2, 4);
		sum1.getResult();
	}
}
