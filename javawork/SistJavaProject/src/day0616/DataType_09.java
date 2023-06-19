package day0616;

public class DataType_09 {

	public static void main(String[] args) {
		// 묵시적 형변환 : 자동 결정나는 type
		//String+int=String
		//double+int=double
		//long+short=long
		//char+int=int
		//char는 기본이 정수형
		
		char a='a';
		System.out.println(a);
		System.out.println(a+2);
		System.out.println((char)(a+2));
		
		System.out.println("Happy"+5+6);
		System.out.println("Happy"+(5+6));
		System.out.println('A'+3);
		System.out.println(2+'b');
		System.out.println('a'+'b');
	}
}
