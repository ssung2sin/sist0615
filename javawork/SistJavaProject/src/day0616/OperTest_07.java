package day0616;

public class OperTest_07 {

	public static void main(String[] args) {
		//기본자료형_8개
		//1. 논리형_true,false => boolean
		boolean b=false;
		
		//2. 문자형 char
		//반드시 1개의 문자 16bit 유니코드값
		//자바에서 char 문자하나 2bite
		//기본적으로는 정수형,아스키코드 변환
		char ch='가';
		int cha = '가';
		
		//3. 정수형
		byte a=127; //1바이트 -128~127까지 가능
		short s=32000; //16bit 2비트
		int c=2523525; //32bit 4비트
		long l=242432420L; //64bit 8비트,뒤에L,l붙여야 long
		
		//4. 실수형
		float f=5.24243f; //32bit 4비트,소수점, 뒤에F,f붙여야 float
		double d=254535.25436; //64bit 8비트,소수점
		
		//int,float은 똑같이 32bit 사용하지만 기본적으로 실수형이 정수형보다 큰 타입으로 처리
		
		//출력
		System.out.println("bool = "+b);
		System.out.println("not bool = "+(!b));
		System.out.printf("ch는 %c 고, ch의 정수 값은 %d다.\n",ch,cha);
		System.out.println("ch = "+(char)(ch+1));
		System.out.println("ch = "+(int)(ch+1));
		System.out.println("d = "+d);
		System.out.println("f = "+f);
		//전체자리수 10자리 소숫점 2자리
		System.out.printf("d = %10.2f\n",d);
		//소숫점1자리
		System.out.printf("d = %.1f\n",d);
		
	}
}
