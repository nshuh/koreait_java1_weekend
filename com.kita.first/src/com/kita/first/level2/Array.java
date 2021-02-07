package com.kita.first.level2;

public class Array { //배열
	public static void main(String[] args) {
		int[] arr1 = new int[5]; //arr1에 정수가 들어갈수 있는 다섯칸이 있고 기본값이 들어가 있다는 뜻
		char[] arr2 =  new char[10];
		double[] arr3 = new double[100];
		// 기본형 변수들의 기본값
		// 숫자형 : 0
		// char: (공란) 숫자로 변환시 0
		System.out.println(arr2[0]);
		// boolean : false
				
		String[] arr4 = new String[100];
		// 참조형 변수의 기본값 : null
		
		arr1[0] = 1; //arr1의 첫번째(인덱스 0번 자리) 자리에 1을 넣겠다는 뜻
		System.out.println("arr1[0]:"+ arr1[0]);
		
		arr1[2] = 5; //arr1의 세번째(인덱스 2번 자리) 자리에 5을 넣겠다는 뜻
		System.out.println("arr1[2]:"+ arr1[2]);
		
		int[] arr7 = {10, 20, 30, 40};
		arr7 = new int[] {10, 20, 30};
		
		int len = arr1.length;
		
		//배열 안에 값 집어넣기
		for(int i=0; i<=arr1.length-1; i++) { // i<arr1.length
			arr1[i] = 3;
		}
		
		// 배열 안의 값 출력하기
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+ ", ");	
		} 
		
	}

}
