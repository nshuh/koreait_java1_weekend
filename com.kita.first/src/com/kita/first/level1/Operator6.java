package com.kita.first.level1;

public class Operator6 {
	public static void main(String[] args) {
		 int n1 = 3;
		 int n2 = 3;
		 int n3 = 4;
		 
		 boolean result;
		 result = (n1==n2 && n2==n3 && n1==n3); // and 연산자 : 안에 있는 결과값이 모두 같으면 참, 하나라도 다르면 거짓
		 System.out.println(result);
		 result = (n1==n2 || n2==n3 || n1==n3); // 역슬러쉬 로 표현
		 System.out.println(result); // or 연산자 : 안에 있는 결과값중 하나라도 참이 있으면 참
	}

}
