package day0623;

public class ArrStr_07 {

	public static void main(String[] args) {
		// 문자열 배열 str1,str2...선언과 동시에 초기화
		
		String[] str1= {"김밥","짜장면","뼈해장국","순대국","라면","돈까스"};
		String[] str2=new String[6];
		
		str2[0] = "빨강";
		str2[2] = "노랑";
		str2[4] = "파랑";
		
		//str1을 변수i를 이용해 출력
		//음식1: 김밥
		System.out.println("#str1출력1");
		for(int i=0;i<str1.length;i++) {
			System.out.println("음식"+(i+1)+": "+str1[i]);
		}
		
		System.out.println();
		System.out.println("for~each 사용");
		for(String a:str1) {
			System.out.print(a+" ");
		}
		System.out.println("#str2출력1");
		for(int i =0;i<str2.length;i++) {
			System.out.println("색"+(i+1)+": "+str2[i]);
		}
		
		System.out.println();
		System.out.println("#str2출력2");
		for(String c:str2) {
			System.out.print(c+" ");
		}
	}

}
