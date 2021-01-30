package com.kita.first.level1;

public class Print2 {
	public static void main(String[] args) {
		String name = "허남섭";
		int age = 345;
		
		// 제 이름은 허남섭이고 나이는 345세입니다.
		System.out.println("제 이름은" + name + "이고 나이는" + age + "세 입니다");
		
//		System.out.printf("문자열 형식", 변수1, 변수2, ...);
		System.out.printf("제 이름은 %s이고 나이는 %5d세입니다.\n", name, age); //문자는s, 정수는d,  %5d : 5칸으로 하겠다는 뜻, \n은 개행(칸띄우기)
		
		double grade = 3.333333;
		System.out.printf("제 학점은 평균 %.2f입니다.", grade); //실수는 f..,  %.2f : 4.33까지 소수점 2자리까지 만 표현함 (%.4f : 소수점 4자리수까지)	
	}

}
