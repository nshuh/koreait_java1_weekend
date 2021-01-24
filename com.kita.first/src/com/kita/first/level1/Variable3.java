package com.kita.first.level1;

public class Variable3 {
	public static void main(String[] args){
		//형변환 순서 : int<long<float<double<String
		int v1 = 3;
		int v2 = 5;
		System.out.println(v1 + v2);
		
		int result1 = v1 + v2;
		System.out.println(result1);
		
		double v3 = 2.4;
		double result2 = v1 + v3; // 정수와 실수가 더해지면 변수형태를 실수로 바꿔줘야 함. 정수로 바꿀시 (int)v3로 변환하면됨 int result2 = v1 + (int)v3 ==> 형변환
		System.out.println(result2);
		
		long v4 = 12L;
		double result3 = v4;
		float result4 = v4;
		
		System.out.println("안녕"+"하이");
		
		System.out.println(1+2+3);
		System.out.println(1+2+"3"); //"3"문자임으로 결과물은 33으로 문자화 됨
		System.out.println(1+"2"+3);
		System.out.println("1"+2+3); //뒤에 더하기는 문자화 되어 버림(계산안됨)
		
		String s1 = "123";
		int n4 = Integer.parseInt(s1); //문자열 "123"을 숫자로 변환하고 n4로 명명함
		double n6 = Double.parseDouble(s1); //n6의 경우 잘안쓰이지만 참고만 하면됨
		int n5 = 1; //n5는 1임
		System.out.println(n4+n5);
		
	}

}
