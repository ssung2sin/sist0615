package day0622;

import java.util.Scanner;

public class QuizForWhile_08 {

	public static void quiz1() {
	
		/*
		 * 나이를 반복해서 입력받는다.
		 * 0이되면 빠져나와서 출력
		 * 나이가 50이상일경우 a변수 증감
		 * 나이가 30이상일경우 b변수 증가
		 * 그 나머지는 c변수 증가
		 * ============================
		 * 50세이상: 3명
		 * 30세이상 50세 미만: 2명
		 * 그의외: 1명
		 * */
		
		int age;
		int fifty=0,thirty=0,etc=0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("나이를 입력하시오(0입력시 출력)");
			age=sc.nextInt();
			if(age>=50) {
				fifty +=1;
			}
			else if(age>=30) {
				thirty+=1;
			}
			else if(age>0){
				etc+=1;
			}
			else if(age==0) {
				System.out.println("출력을 종료합니다.");
				break;
			}
			else {
				System.out.println("다시 입력하시오.");
				System.out.println();
			}
		}
		System.out.printf("50세이상: %d명\n30세이상 50세미만: %d명\n그 외: %d명\n",fifty,thirty,etc);
		
	}
	
	public static void quiz2() {
		
		//Q. 총 10개의 다양한 숫자(양수,음수)를 입력받아 양수의 갯수와 음수의 갯수를 구하시오
		/*
		 * 1: 45
		 * 2: -23
		 * 
		 * ==============
		 * 양수갯수: 6
		 * 음수갯수: 3
		 */
		
		Scanner sc = new Scanner(System.in);
		int a, plus=0 ,minus=0;
		System.out.println("다양한 숫자 10개를 입력하시오.");
		
		for(int i=1;i<=10;i++) {
			System.out.print(i+" : ");
			a=sc.nextInt();
			if(a>0) {
				plus ++;
			}
			else if(a<0) {
				minus++;
			}
		}
		System.out.println();
		System.out.println("==========");
		System.out.println("양수갯수: "+plus);
		System.out.println("음수갯수: "+minus);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quiz2();

	}

}
