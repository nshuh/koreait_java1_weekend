package com.kita.first.level1.practice;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
        // 스캐너로 정수값 하나 입력 받고
		// 그 값이 홀수면 "홀수입니다."
		// 짝수면 "짝수입니다."
		Scanner scan = new Scanner(System.in);
		System.out.println("정수값을 입력해주세요: ");		
		int num = scan.nextInt();		
		
		if(num % 2 == 1) { //숫자를 2로 나눴을때 1이 되면 홀수
			System.out.println("홀수입니다.");
		} else { //나머지는 짝수
				System.out.println("짝수입니다.");
		scan.close();

		}
	}

}
