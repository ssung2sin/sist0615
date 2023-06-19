package day0616;

public class PrintfTest_05 {
	
	public static void main(String[] args) {
	
		//Printf는 문자열 구성하여 출력하는것
		//문자열뒤에 따라오는 데이터(%)를 순서대로 배치
		//%d는 정수 %f는 실수 %s는 문자열 %c는 문자
		
		int num1 = 10,num2 = 20;
		int num3 = num1+num2;
		System.out.printf("num1의 값은 %d고 num2의 값은 %d이다.\n",num1,num2);
		System.out.printf("num3는 num1과 num2의 합이며 %d이다.",num3);
	}
}
