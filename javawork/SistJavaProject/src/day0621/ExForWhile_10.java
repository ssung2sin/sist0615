package day0621;

import java.security.PublicKey;
import java.util.Scanner;

public class ExForWhile_10 {

	public static int test1() {
		
		//for문으로 1부터 5까지 구하기
		int sum=0;
		for(int num=1;num<=5;num++) {
			sum+=num;
		}
		return sum;
	}
	
	public static void test2() {
		//1에서 10까지으 홀수 합 for문
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				continue;
			}
			sum +=i;
		}
		System.out.println("1부터 9까지의 홀수의 합 : "+sum);
		
	}
	
	public static void test3() {
		
		//100까지의 합은 5050
		Scanner sc = new Scanner(System.in);
		System.out.print("1부터 x의 합을 구하기위해 x값을 입력하시오 : ");
		int x = sc.nextInt();
		System.out.println();
		int sum=0;
		for(int i=1;i<=x;i++) {
			sum+=i;
		}
		System.out.println("1부터 "+x+"의합은 "+sum+"입니다.");
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1부터 5까지의 합 :"+test1());
		test2();
		test3();
	}

}
	