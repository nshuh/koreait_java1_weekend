package com.kita.first.level2;

public class For2 {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {  //큰틀이 먼저오고
			for(int z=0; z<2; z++) { // 큰틀안에 작은 틀..
				for(int k=0; k<4; k++) { //작은 틀안에 작은틀들....
					System.out.printf("i:%d, z:%d, k:%d\n", i, z, k);
				}
			}
		}
	}

}
