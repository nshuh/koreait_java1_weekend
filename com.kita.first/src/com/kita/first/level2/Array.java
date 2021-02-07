package com.kita.first.level2;

public class Array { //배열
	public static void main(String[] args) {
		int[] arr1 = new int[5]; 
		//arr1에 정수가 들어갈수 있는 다섯칸이 있고 기본값이 들어가 있다는 뜻 --> [0] [1] [2] [3] [4]의 인덱스 주소가 배정
		// 출력하면 0,0,0,0,0 으로 출력 0인 이유는 기본값이기때문임 
		char[] arr2 =  new char[10];
		double[] arr3 = new double[100];
		// 기본형 변수들의 기본값
		// 숫자형 : 0
		// char: (공란) 숫자로 변환시 0
		System.out.println(arr2[0]);
		// boolean : false
				
		String[] arr4 = new String[100];
		// 참조형 변수의 기본값 : null
		
		
		// 순서 :    1 2 3 4 5 (5==arr1.length)
		// index : 0 1 2 3 4 (4==arr1.length-1)
		// arr1 : {0,0,0,0,0)
		// arr1.length번만큼 반복 (arr1에서는 5번 반복한다는 뜻)
		arr1[0] = 4; //arr1의 첫번째(인덱스 0번 자리) 자리에 1을 넣겠다는 뜻
		System.out.println("arr1[0]:"+ arr1[0]); // {4,0,0,0,0}
		
		arr1[2] = 5; //arr1의 세번째(인덱스 2번 자리) 자리에 5을 넣겠다는 뜻
		System.out.println("arr1[2]:"+ arr1[2]); // {4,0,5,0,0}
		
		System.out.println();
		
		int[] arr7 = {10, 20, 30, 40};
		arr7 = new int[] {10, 20, 30};
		
		int len = arr1.length;
		
		//int 배열 arr1 안에 값 집어넣기
		//arr1 : {4,0,5,0,0}
		//arr1.length번만큼 반복 (arr1에서는 5번 반복한다는 뜻)	
		arr1[0] = 3;
		arr1[1] = 3;
		arr1[2] = 3;
		arr1[3] = 3;
		arr1[4] = 3;
		//arr1[ ] = 3; 이 공통점임, for반복문에 공통점을 넣어주면 간단하게 코드를 만들수 있음
		
		for(int i=0; i<=arr1.length-1 ; i++) {
			arr1[i]=3;
		}
		
		for(int i=0; i<=arr1.length-1; i++) { // i<arr1.length
			arr1[i] = 3;
		}
		
		// 배열 안의 값 출력하기
		// arr1:{3,3,3,3,3}
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+ ", ");	
		} 
		
	}

}
