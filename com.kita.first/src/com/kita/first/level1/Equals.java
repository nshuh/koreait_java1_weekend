package com.kita.first.level1;

public class Equals { //문자열 비교
	public static void main(String[] args) {
		int n1 = 2;
		int n2 = 3;
		int n3 = 3;
		
		boolean result1 = (n1 == n2);
		System.out.println("result1: "+result1);
		
		boolean result2 = (n1 != n2); // 같이 않다라는 뜻
		System.out.println("result2: "+result2);
		// >, <, >=, <=
		
		boolean result3 = ((n1 != n2) && (n2 == n3)); // ||or, &&and
		System.out.println(); // 결과값 띄워주려고 씀
		System.out.println(); // 띄워주려고 씀
		System.out.println(); // 띄워주려고 씀
		
		String str1 = "안녕";
		String str2 = "안녕";
		String str3 = new String("안녕");
		
		boolean result4 = (str1 == str2);
		System.out.println("result4: "+result4); // true
		boolean result5 = (str1 == str3);
		System.out.println("result5: "+result5); 
		// false이유 ?? String은 참조변수 이며, "안녕"의  data를 가지고 있는것이 아니라 "안녕"이라는 주소를 가지고 있음...응?? "안녕"을 비교하는 것이 아니라 주소값이 같아야 참이됨, new를 쓰면 다른 번지기 때문에 false가 됨
		// 그래서 문자열 비교는 아래와 같이 비교함
		
		boolean result6 = ("안녕".equals(str3)); //(str3.equals("안녕")도 똑같은 결과지만 옆에 처럼 써야 에러가 덜난다.
		System.out.println("result6: "+result6); 
		
		boolean result7 = (str2.equals(str3));
		System.out.println("result7: "+result7); 
	}

}
