package day0623;

public class ArrString_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열선언을 문자열로!
		String str[]=new String[4];
		
		//초기화
		str[0]="최진평";
		str[1]="고은비";
		str[2]="김영환";
		str[3]="홍성경";
		
		//출력
		System.out.println("for문 출력");
		
		for(int i=0;i<str.length;i++) {
			System.out.println(1+i+" : "+str[i]);
		}
		System.out.println();
		int b=0;
		System.out.println("for~each문 출력");
		for (String a1:str) {
			b++;
			System.out.println(b+" : "+a1);
		}

	}

}
