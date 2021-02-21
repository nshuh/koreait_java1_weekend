package com.kita.first.level2;

public class Calc {
//	public static (리턴타입  or void) 메소드명동사형 (매개변수){
//		실행코드
//		return 리턴타입 값;
//	}
	public static void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	

	// int값을 2개 받아서 둘을 더한 값을 돌려주는 메소드 (double도 유사한 방식)
	public static int sum(int n1, int n2){
//		int result = n1 + n2;
//		return result; 아래식이 더욱 간단함
		return n1 + n2;	
	}
	
	//매개변수가 달라지면 (개수, 타입, 등....) : sum을 또 쓰고싶을때... 오버로딩이라고 함
	public static double sum(double n1, double n2){
		return n1 + n2;	
	}
	
	public static int sum(int n1, int n2, int n3){
		return n1 + n2 + n3;	
	}
	
	public static int sum(int... arr) {
		// int[] arr = {1,2,3,4,5,6,7,8,9} 가 만들어진다고 생각하면 됨
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	
	
	//전원 끄는 메소드
	public static void powerOff() {
		System.out.println("전원을 끕니다.");
	}
		
	//int값을 2개 받아서 둘을 뺀 깞을 돌려주는 메소드
	//단, 두 값 중에 큰수에서 작은수를 빼서
	//결과가 무조건 양수 또는 0으로 나오게 만드시오
	

	public static int minus(int n1, int n2){
		int result; //int result의 위치가 중요함 범위의 구조를 잘이해야함
		
		if(n1 > n2) {
			result = n1 - n2;
		} else {
			result = n2 - n1;
		}
		
		return result;
	}
	
	//int값을 2개 받아서 둘을 곱한 값을 돌려주는 메소드
	public static int multiply(int n1, int n2){
		return n1 * n2;
	}
	
	//int값을 2개 받아서 둘을 나눈 값(실수)을 돌려주는 메소드
	public static double divide(int n1, int n2){
		double result = (double)n1 / n2; //둘중에 하나를 강제 형변환해야함
		return result;
	}
	
	
	
}
