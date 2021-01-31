package com.kita.first.level2.practice;

public class Practice01 {
	public static void main(String[] args) {
		// 구구단 2단 찍기
		// 2*1=2
		// 2*2=4
		// ...
		// 2*9=18
		
//		int n=2;
//		for(int i=1; i<10; i++) {
//			 System.out.println(n+"*"+i+"="+n*i);	 
//		 }
		
		for(int i=1; i<10; i++) {
//			System.out.println(2+"*"+i+"="+2*i);
//			System.out.printf("2*%d=%d\n",i,(2*i)); // f사용하여 프린트 
			System.out.printf("2*%d=%2d\n",i,(2*i)); //2는 칸정렬을 위해 입력됨
		}

	
	}


}
