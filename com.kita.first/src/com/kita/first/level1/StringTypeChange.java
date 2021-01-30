package com.kita.first.level1;

public class StringTypeChange { //문자열 형변환
	public static void main(String[] args) {
		int num = 3;
		String str = "안녕";
		
		String result1 = num + str;
		System.out.println(result1); // 3안녕 3은 문자로 변환됨
		
		String str2 = "123"; // 문자123을 정수로 형변활 하려면??
		//int result2 = (int)str2; // <-문자열에는 이방식이 안된다... 아래형태로 변환해야 함
		int result2 = Integer.parseInt(str2); // <-이렇게 해야....;;;;
		
		String str3 = "2.3";
		double result3 = Double.parseDouble(str3); //result3 = Double.parseDouble("2.3")와 동일함
		
	}

}
