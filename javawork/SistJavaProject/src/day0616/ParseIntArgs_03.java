package day0616;

public class ParseIntArgs_03 {

	public static void main(String[] args) {
		/*[결과출력]
		 * 내이름은 김영환
		 * 자바점수는 88
		 * 오라클점수는 77
		 * 두 과목의 합계는 165점 입니다
		 * */
		System.out.println("[결과출력]");
		System.out.println("내이름은 "+args[0]);
		System.out.println("자바점수는 "+args[1]);
		System.out.println("오라클점수는 "+args[2]);
		int num1 = Integer.parseInt(args[1]);
		int num2 = Integer.parseInt(args[2]);
		int result = num1+num2;
		System.out.println("두 과목의 합계는 "+result +"점 입니다");
		
		//선생님 풀이
		
		//변수 선언 (훨씬 깔끔)
		String name=args[0];
		int java=Integer.parseInt(args[1]);
		int oracle=Integer.parseInt(args[2]);
		
		//parseInt(string) = int로변환해준다!
		//출력문
		System.out.println("[결과출력]");
		System.out.println("내이름은 "+name);
		System.out.println("자바점수는 "+java);
		System.out.println("오라클점수는 "+oracle);
		System.out.println("두 과목의 합계는 "+(java+oracle)+"점 입니다");
		
		

	}

}
