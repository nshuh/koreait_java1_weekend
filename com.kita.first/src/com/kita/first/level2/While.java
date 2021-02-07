package com.kita.first.level2;

public class While {
	public static void main(String[] args) {
//		while(조건식) {
//			실행식
//		}
		
		for(int i=0; i<3; i++) {
			System.out.println(i);
		}
		
// 위 for를 while로 바꾸면 아래같이 된다.		
		
		int i=0;
		while(i<3) {
			i++; //i++위치가 여기랑 아래 프린트 아래에 위치할때랑 값이 다름
			System.out.println(i);
		}
		
//		while(true) {
//			if(조건식) {
//				실행식
//				break;
//			}	
//		}
		
		
	}

}
