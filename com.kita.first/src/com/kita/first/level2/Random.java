package com.kita.first.level2;

public class Random {
	public static void main(String[] args) {
		double n = Math.random(); // 0~0.99999
		               // 0 <= n < 1 사이의 랜덤값 (n = 0~0.99999)
		System.out.println("n: " + n);
		
		// 0~9
		int n22 = (int)(Math.random()*10); // 0 <= n22 < 1 9를 곱한다 --> 0*9 <= n22*9 < 1*9 ==> 0 <= n22*9(8.99999) < 9, n22는 8이됨 9가되려면 10을 곱해줘야 함 (소숫점 이하는 int 임으로 정수변환됨)
		System.out.println("n22: " + n22);
		
		// 1~10사이의 숫자를 뽑고싶을때
		int n2 = (int)(Math.random()*10 + 1); // 강제로 형변환되며 소숫점이하는 떼버림
		System.out.println("n2: " + n2);
		
		// 1~5
		int n3 = (int)(Math.random()*5 + 1);
		System.out.println("n3: " + n3);
		
		//2~13
		int n4 = (int)(Math.random()*13 + 1);
		int n5 = 1;
		System.out.println("2~13 랜덤값 : " + (n4 + n5));
		
		//17~51
		int n6 = (int)(Math.random()*35 + 1);
		int n7 = 17;
		System.out.println("17~51 랜덤값: " + (n6 + n7)); 
		
		//17~51(다른방법 -- 간단히 표현한 정답)
		int n8 = (int)(Math.random()*35 + 17);
		System.out.println("17~51 랜덤값 (또다른방법): " + n8);
		
		
		//공식
		int max = 51;
		int min = 17;		
		int rNum = (int)(Math.random() * (max - min + 1) + min);
		
		
		
	}

}
