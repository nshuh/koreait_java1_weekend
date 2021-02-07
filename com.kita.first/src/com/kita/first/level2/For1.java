package com.kita.first.level2;

public class For1 {
	public static void main(String[] args) {
//           A      B    C
//		for(초기식; 조건식; 증감식) { //횟수가 정해져 있는 형태에 주로 사용하는 반복문
//           D
//			실행식
//		}
		
		for(int i=0; i<10; i++) {
			System.out.println(i+"입니다.");
		}
		
		// 1에서 5까지 반복문
		// 1회 반복했습니다.
		// 2회 반복했습니다.
		// ...
		// 5회 반복했습니다.
		
		 for(int k=1; k<6; k++) { // k<6을 k<=5로 해도 됨
			 System.out.println(k+"회 반복했습니다.");
			 //System.out.printf("%d회 반복했습니다.\n",k);도 됨
		 }
		
		 
		 
	}

}
