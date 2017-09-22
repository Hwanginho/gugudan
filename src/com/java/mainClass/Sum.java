package com.java.mainClass;

public class Sum {
	
	//인스턴스변수
	private int num1, num2;
	private int result;
	
	//메서드
	public int SumNumber(int a, int b){
		num1 = a;
		num2 = b;
		result = a + b;
		return result;
	}
	
	//생성자
	public Sum(){}
	//객체 자신을 가리킴
	public Sum(int num1, int num2, int result){
		this.num1 = num1;
		this.num2 = num2;
		this.result = result;
	}
	
	//메서드
	public void Print(int num1, int num2){
		System.out.println(SumNumber(num1, num2));
	}
	public void main(String[] args) {
		Print(num1,num2);
		
	}
	
	//GETTER & SETTER
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
}
