package day0619;

public class OperTest_06 {

	public static void main(String[] args) {
		// 증감연산자 ++,--
		int a,b;
		a=b=5;
		
		//단항일경우에는 앞에붙히나 뒤에붙히나 같다
		++a;//원래a값에서 1증가
		b++; //b=b+1
		
		System.out.println("a="+a+", b="+b);
		
		//수식에서 사용할때는 전치,후치의 결과값이 틀리다
		int m,n;
		m=n=0;
		a=b=5;
		
		m=a++; //후치일경우 먼저 대입후 증가
		System.out.println("m="+m+" ,a="+a);//m=5,a=6

		n=++b; //전치일경우에는 먼저증가후 대입
		System.out.println("n="+n+", b="+b); //n=6,b=6
	}

}
