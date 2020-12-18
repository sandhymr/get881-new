package com.lti.model;

public class Calculator {
	public void add(int num1,int num2) {
		System.out.println("Sum :"+ (num1+num2));
	}
	public void subs(int num1,int num2) {
		System.out.println("Difference :"+ (num1-num2));
	}
	
	public void mul(int num1,int num2) {
		System.out.println("Multiplication :"+ (num1*num2));
	}
	public void div(int num1,int num2) {
		System.out.println("Division :"+ (num1/num2));
	}
	
	public void display() {
		System.out.println();
	}
	
 
}
