package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice07 {
	public static void main(String[] args) {
//		랜덤값 10~90을 맞추는 게임
//		UP / DOWN / Great!!
//		
//		Scanner scan = new Scanner(System.in);
//		int rn = (int)(Math.random()*81+10);
//		int n;
//		
//		while(true) {
//			System.out.print("10~90에서 어떤 숫자일까?? : ");
//			n = scan.nextInt();
//			if(rn > n ) {
//				System.out.println("UP");
//				if(rn < n) {
//					System.out.println("DOWN");
//					if(rn == n) {
//						System.out.println("Great");
//						break;						
//					}
//					
//				}
//				
//			}
//			
//			
//		}
		
		int max = 90;
		int min = 10;
		int rn = (int)(Math.random()*(max - min + 1) + min);
		Scanner sc = new Scanner(System.in);
		int myNum;
		
		while(true) {
			System.out.printf("10~90에서 어떤 숫자일까??(%d ~ %d):\n", min, max);
			myNum = sc.nextInt();
			if(myNum > max || myNum < min) {
				System.out.println("잘못 입력했습니다. 다시입력해 주세요.");
				continue;
			}
			if(rn > myNum) {
				System.out.println("UP");
			} else if(rn < myNum) {
				System.out.println("DOWN");
			} else {
				sc.close();
				System.out.println("Great!!");
				break;
		    }
		}
		
	}

}
