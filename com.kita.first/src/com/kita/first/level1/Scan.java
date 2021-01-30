package com.kita.first.level1;

import java.util.Scanner; //자바에서 기본적으로 제공하는 메소드

public class Scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //작성 후 ctrl+shift+알파벳O 누르면 3번행 생김 
		
		System.out.print("숫자값을 입력하시오: ");
		int num = scan.nextInt(); //스캐너의 nextInt라는 메소드를 실행할 거..라는 뜻
		System.out.println("num: " + num);
		
		System.out.print("문자값을 입력하시오: ");
		String str = scan.next();
		System.out.println("str: " + str);
		
		scan.close(); //scan을 닫을 수 있고, 메모리를 줄일 수 있음.
	}

}
