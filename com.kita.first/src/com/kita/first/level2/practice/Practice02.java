package com.kita.first.level2.practice;

public class Practice02 {
	public static void main(String[] args) {
//		*****
//		*****
//		*****
//		*****
//		*****
		
		for(int i=0; i<5; i++) {
			System.out.println("*****");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int i=0; i<5; i++) { //몇줄할건지
			for(int z=1; z<6; z++) { //별갯수
				System.out.print("*");
			}
			System.out.println(); //개행
		}
	}

}
