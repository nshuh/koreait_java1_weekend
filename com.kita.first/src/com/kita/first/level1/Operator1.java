package com.kita.first.level1;

public class Operator1 {
	public static void main(String[] args) {
		int n1 = 2;
		int n2 = 5;
		int result1 = n1 + n2;
		System.out.println(result1); // System.out.println(n1 + n2);와 동일함
		n1 = n1 + 1; // 3
		System.out.println(n1);
		n1 += 1; // 4
		System.out.println(n1);
		n1++; // 5 n1에 ++ 증감연산자를 사용하면 1씩 증가함 n1 = n1 + 1의 효과
		System.out.println(n1);
		n1--; // 4 1씩감소
		System.out.println(n1);
		n1 += 2; // 6 2씩 증가 *=, /= 등등 응용가능
		System.out.println(n1);
		n2 = n1 + 3; // 9
		System.out.println(n2);
				
	}

}
