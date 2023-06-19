package day0616;

public class ParseTest_02 {

	public static void main(String[] args) {
		// String 타입을 int 타입으로 변경하려면
		//Integer.parseInt("10"); 문자열 10이 정수 10로 반환
		//Double.parseDouble("12.345"); 문자열 12.345가 실수타입 12.345로 반환
		
		String num1 = "10";
		String num2 = "20";
		
		System.out.println("두 수 더하기 : "+(num1+num2));
	
		//문자열 num1,num2를 정수타입 int로 변환후 계산
		
		int su1 = Integer.parseInt(num1);
		int su2 = Integer.parseInt(num2);
		
		System.out.println("두 수 더하기 : "+(su1+su2));
		System.out.println("두 수 빼기 : "+(su1-su2));
		System.out.println("두 수 나누기(큰 수 앞) : "+(su2/su1));
		System.out.println("두 수 곱하기 : "+(su1*su2) );
		
	}

}
