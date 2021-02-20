package com.kita.first.level2;

import java.util.Arrays;

public class Array2 { //다차원 배열
	public static void main(String[] args) {
		//{1,2,3,4,5}
		//{{1,2}, {1,2}, {1,2}} 다차원 배열
		int[][] arr = new int[3][2]; //3칸안에 2칸짜리 배열이 들어가 있다는 뜻
		//{{0,0}, {0,0}, {0,0}}
		arr[0][0] = 1; //{{1,0}, {0,0}, {0,0}}
		arr[0][1] = 2; //{{1,2}, {0,0}, {0,0}}
		arr[2][0] = 2; //{{1,2}, {0,0}, {2,0}}
		
		//{{1,1}, {1,1}, {1,1}}
		//{{1,1,1}, {1,1,1,1}, {1,1}}
		for(int i=0; i<arr.length; i++) {
			for(int z=0; z<arr[i].length; z++) {
				arr[i][z] = 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
