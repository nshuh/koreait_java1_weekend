package com.kita.first.level2.practice;

public class Practice03 {
	public static void main(String[] args) {
		// 2~9단 찍기
		// 2 * 1 = 2
		// ...
		// 9 * 9 = 81
		
//		for(int i=2; i<10; i++) {
//			for(int z=1; z<10; z++) {
//				System.out.print(i+"*"+z+"="+i*z+"\t");
//			}
//			System.out.println();
		
//		for(int dan=2; dan<10; dan++) {
//			for(int i=1; i<10; i++) {
//				System.out.printf("%d*%d=%d\n", dan, i, (dan*i));				
//			}
//			System.out.println();
//		}	
		
		for(int dan=2; dan<10; dan++) {
			for(int i=1; i<10; i++) {
				System.out.printf("%d*%d=%d\t", dan, i, (dan*i));	
			}
			System.out.println();
		}
	}
}


