package com.kita.first.level2;

public class NamedLoop {
	public static void main(String[] args) {
		Parent:
		for(int i=0; i<5; i++) {
			Child:
			for(int z=0; z<3; z++) {
				if(z == 1) {
					continue Parent; //continue Parent, continue Child, break Parent,break Child를 넣은 결과와 비교해보기
				}
				System.out.printf("i: %d, z: %d\n", i, z);
			}
		}
	}

}
