package com.wxy.exercise;

public class Recursion {

	public static int Fibonaci(int n){
		if(n==1)
			return 1;
		return Fibonaci(n-1)+n;
	}
	
	public static void main(String[] args) {
		System.out.println(Fibonaci(100));
	}
}
