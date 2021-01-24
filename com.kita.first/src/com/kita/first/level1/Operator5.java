package com.kita.first.level1;

public class Operator5 {
	public static void main(String[] args) {
		int n1 = 3;
		int n2 = 4;
		System.out.println(n1 == n2);
		boolean result = (n1 == n2);
		n2 = 3;
		result = n1 == n2;
		System.out.println(result); // result끼리 비교
		System.out.println(!result); //!부정기호 참의 부정은 거짓
		System.out.println(!!result); //!! 부정을 두번하니 참이됨
		
		result = (n1 > n2);
		System.out.println(result);
		
		n2 = 5;
		result = (n1 != n2); // ! = not 이라는 의미 임으로 같지 않다라는 기호임
		System.out.println(result);
	}

}
