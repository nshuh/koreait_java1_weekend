package com.kita.first.level2.practice;

public class Practice04 {
	public static void main(String[] args) {
		// 삼각형 별찍기
		// *
		// **
		// ***
		// ****
		
		for(int n=1; n<5; n++) {
			for(int i=0; i<n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
