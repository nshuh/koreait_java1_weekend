package com.kita.first.level2;

public class Continue {
	public static void main(String[] args) {
		for(int i=0; i<9; i++) {
			if(i == 5) {
				System.out.println("continue를 만납니다.");
				continue;
			}
			System.out.printf("i는 %d입니다\n", i);
		}
		
		for(int i=0; i<4; i++) {
			for(int z=0; z<3; z++) {
				if(i==2) {
//					continue; // break를 넣는게 더 효율적이다... 왜인지 아직 이해안감...
					break;
				}
				System.out.printf("i: %d, z:%d\n", i, z);
			}
		}
	}

}
