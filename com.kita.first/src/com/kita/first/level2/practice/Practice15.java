package com.kita.first.level2.practice;

import java.util.Scanner;

public class Practice15 {
	public static void main(String[] args) {
		//숫자야구게임
		//아래는 변수선언
		Scanner sc = new Scanner(System.in);
		final int LEN = 3; //맞춰야 할 숫자 3칸짜리
		int[] rArr = new int[LEN]; //컴퓨터가 뽑는 값 배열
		int[] myArr = new int[LEN]; //내가 입력하 값 배열
		int max = 9;
		int min = 1;
		int strike;
		int ball;
		int out; //LEN - strike - ball
		
		System.out.println("숫자야구게임 시작!");
	    //컴퓨터가 랜덤한 정수값을 뽑아서 rArr에 담기
		for(int i=0; i<LEN; i++) {
			rArr[i] = (int)(Math.random()*(max-min+1) + min);
			//중복 허용안함
			for(int z=0; z<i; z++) {
				if(rArr[i] == rArr[z]) {
					i--;
					break;
				}
			}
		}
		//중복되지 않은 값을 컴이 다뽑은상태임
		
		//strike == LEN일 때까지 반복
		while(true) {
			//정수값 3개 입력받아서 myArr에 넣기
			strike=0;
			ball=0;
			for(int i=0; i<LEN; i++) {
				System.out.printf("값%d: \n",  i+1);
				int myNum = sc.nextInt();
				if(myNum < min || myNum > max ) {
					System.out.println("범위 밖의 숫자입니다.");
					i--;
					continue;
				}
				for(int x=0; z<i; z++) {
					if(rArr[i] == myArr)
				}
			}
			//S와 B과 O 개수 체크
			for(int i=0; i<LEN; i++) {
				if(rArr[i]==myArr) {
					strike++;
					continue;
				}
				for(int z=0; i<LEN; z++) {
					
				}
			}
			if(strike == LEN) {
				break;	
			}
			//S, B, O 개수 출력
		}
		System.out.println("게임 종료!");
	}

}
