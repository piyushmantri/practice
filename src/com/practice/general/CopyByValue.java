package com.practice.general;

public class CopyByValue {
	public static void main(String[] args){
		//testArray();
		testPrimitive();
	}
	static void testArray(){
		int[] a={1,2,3,4,5};
		int[] b = a;
		
		b[2] = 10;
		System.out.println(a[2]+ "  "+b[2]);
	}
	
	static void testPrimitive(){
		int a=10;
		int b=a;
		b = 15;
		System.out.println(a+"  "+b);
	}
}
