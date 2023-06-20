package day0620;

import java.util.Scanner;

public class QuizOper_06 {

	public static void main(String[] args) {
		/*
		 * 이름을 입력하세요
		 * 이성신
		 * 3과목의 점수를 입력하세요(자바,스프링,자바스크립트)
		 * 39 
		 * 88
		 * 99
		 * ==============================================
		 * 3과목점수: 39,88,99
		 * 평균:x 점
		 * ----------------------------------------------
		 * 합격조건: 평균이 60점 이상이고, 각 과목이 40점이상이면 합격***
		 * ----------------------------------------------
		 * 이성신님은 ㅇㅇ 입니다.
		 * 
		 * */
		
		Scanner sc =new Scanner(System.in);
		String name,result;
		int javSco,sprSco,jsSco;
		double avg;
		
		System.out.println("이름을 입력하세요");
		name = sc.nextLine();
		
		System.out.println("3과목의 점수를 입력하세요 (자바,스프링,자바스크립트)");
		javSco = sc.nextInt();
		sprSco = sc.nextInt();
		jsSco = sc.nextInt();
		System.out.println("==============================================");
		
		avg = (javSco+sprSco+jsSco)/3;
		
		System.out.println("3과목 점수: "+javSco+", "+sprSco+", "+jsSco);
		System.out.printf("평균: %.2f\n",avg);
		
		System.out.println("----------------------------------------------");
		System.out.println("합격조건: 평균이 60점 이상이고, 각 과목이 40점이상이면 합격***");		
		System.out.println("----------------------------------------------");
		
		
		if(javSco>=40 && sprSco>=40 && jsSco>=40) {
			if(avg>=60)
				result = "합격";
			else
				result = "불합격";
		}
		else
			result = "과락과목 존재!";
		
		System.out.println(name+"님은 "+result+"입니다.");
		
		//선생님 풀이
		System.out.println("[선생님풀이]");
		if(javSco>=40 && sprSco>=40 && jsSco>=40 && avg>=60)
			result = "합격";
		else
			result = "불합격";
			
		System.out.println(name+"님은 "+result+"입니다.");
			
		
	}

}
