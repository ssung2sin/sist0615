package day0621;

import java.util.Scanner;

public class ScannerForWhile_11 {
	
	public static void quizFact() {
		
		int i=1,num,mul=1;
		Scanner sc =new Scanner(System.in);
		
		System.out.print("팩토리얼 구할 값을 쓰시오 : ");
		num= sc.nextInt();
		for(;i<=num;i++) {
			mul*=i;
		}
		System.out.println(num+"!="+mul);
		
	}
	
	public static void factorialTest() {
		
		int mul=1;
		for(int i =1;i<=10;i++) {
			mul*=i;
		}
		System.out.println("10!의 값은 "+mul);
	}
	
	public static void numSum() {
		//합계를 구할 숫자는? 
		//1부터 100까지의 합은 5050 입니다.
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int num;
		System.out.print("합계를 구할 숫자는? ");
		num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
		System.out.println("1부터 "+num+"까지의 합은 "+sum+"입니다.");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//numSum();
		//factorialTest();
		quizFact();

	}

}
