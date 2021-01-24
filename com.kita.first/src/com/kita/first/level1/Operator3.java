package com.kita.first.level1;

public class Operator3 {
	public static void main(String[] args) {
		int n1 = 7;
		int n2 = 5;
		System.out.println(n1 + n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2); // 연산의 몫을 출력
		System.out.println(n1 % n2); // 나눗셈을 하고난 후 몫이 아닌 나머지 값을 출력
		double result1 = n1 / n2;
		System.out.println(result1);
		double result2 = (double)n1 / n2; //둘중 하나를 항변환시켜주면 됨
		System.out.println(result2);
	}

}
