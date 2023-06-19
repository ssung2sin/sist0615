package day0616;

public class DataType_08 {
	
	public static void main(String[] args) {
		
		byte a = 127; //-128~127
		byte b = (byte)128; // 더 작은 자료형으로의 변환(디모션_값손실)
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		int x=7;
		int y=4;
		
		System.out.println("x/y ="+(double)x/y); //계산시 x를 double로 변환해서 계산:결과는 double
		System.out.println("x/y ="+x/(double)y);
		System.out.println("x/y ="+(double)(x/y));
		
		//강제형변환 
		
		double d = 100.0;
		int i = 100;
		int result = (int)d+i;
		double result2 = d+i; //or d+(double)i
		System.out.println("d = "+d+"이고 i = "+i+"이다. 둘 합 result = "+result2);
		
	}
}
