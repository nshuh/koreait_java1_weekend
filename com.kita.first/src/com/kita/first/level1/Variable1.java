package com.kita.first.level1;

public class Variable1 {
	public static void main(String[] args) {  // 아래 8개는 기본형 데이터 변수 (boolean 변수외 7개는 숫자형 변수)
		char v1 = 'A';
		// 정수형 변수 (구글에서 java 자료형 크기 검색하면 차이점을 알 수 있음)
		byte v2;
		short v3;
		v3 = 1;
		v3 = 2;
		int v4 = 6; // 정수형 대표변수
		long v5 = 24654621561151l; // 숫자 마지막에 L 표기안쓰면 int로 인식
		// 실수형 변수
		float v6 = 1.2f; // 숫자 마지막에 f 표기 안쓰면 double로 인식
		double v7 = 2.3; // 실수형 대표변수
		
		boolean v8;
		v8 = true;
		v8 = false;
		//참조변수
		String v9;
		
		final int MY_MAX_HEIGHT; //final을 붙여주면 고정되고 상수가 됨 (상수 표기는 통상 대문자로 표기함)
		final String MY_STRING = "안녕";
		MY_MAX_HEIGHT = 170;
		// MY_MAX_HEIGHT = 171;
		// MY_STRING = "다른값";
	}

}
