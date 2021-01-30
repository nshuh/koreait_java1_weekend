package com.kita.first.level1.practice;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
//		수학응시 유형을 입력해 주세요: (가/나)
//		점수를 입력해 주세요:
//			
//	         가형기준 : 60
//		나형기준 : 70
//			
//		"평균 미만입니다."
//		"평균입니다."
//		"평균 초과입니다."
		
		
		//첨에 스캐너로 아래 내용불려옴
		
		Scanner scan = new Scanner(System.in);
		System.out.println("수학응시 유형을 입력해주세요(가/나): ");
		String type = scan.next();
		System.out.println("점수를 입력해주세요: ");
		int score = scan.nextInt();
		
		
		// 두가지 방법이 있음... 아래 보고 연구할 것...ㅠㅠㅠㅠ
		
		int avg = 0;
		
		if("가".equals(type)) {
			avg = 60;
		} else if("나".equals(type)) {
			avg = 70;
		} else {
			System.out.println("잘못 입력했습니다.");	
		}
		
		if(avg == 0) {
			System.out.println("다시 입력해주세요.");	
        } else if(score > avg) {
	        System.out.println("평균 초과입니다.");
	    } else if(score > avg) {
		    System.out.println("평균 미만 입니다.");
	    } else {
		    System.out.println("평균입니다.");
	    }
		
		//아래는 또다른 방법 
		    
		if("가".equals(type)) {
			if(score < 60) {
				System.out.println("평균 미만입니다.");
			} else if(score > 60){
				System.out.println("평균 초과입니다.");
			} else {
				System.out.println("평균입니다.");
			}
		
		} else if("나".equals(type)) {
			if(score < 70) {
				System.out.println("평균 미만입니다.");
			} else if(score > 70){
				System.out.println("평균 초과입니다.");
			} else {
				System.out.println("평균입니다.");
			}
			
		} else {
			System.out.println("잘못 입력했습니다.");
		}

    }

}
