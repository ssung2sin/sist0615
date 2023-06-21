package day0621;

import java.util.Scanner;

public class QuizWhileTrue_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 점수를 반복해서 입력하다가 q나 Q를 입력하면
		 * while문을 빠져나온 뒤 총 갯수, 총점, 평균을 입력하시오
		 * */
		
		Scanner sc =new Scanner(System.in);
		int cnt=0,tot=0;
		String su;
		double avg;
		
		while(true) {
			System.out.println("점수를 입력하시오 (q나Q를 입력시 종료)");
			su=sc.nextLine();
			/*if(su.equalsIgnoreCase("q")) {
				break;
			}*/
			if(su.charAt(0)=='q'||su.charAt(0)=='Q') {
				break;
			}
			cnt++;
			tot+=Integer.parseInt(su);
		}
		avg = (double)tot/cnt;
		
		System.out.printf("총 갯수 : %d, 총점 : %d, 평균 : %.1f",cnt,tot,avg);

	}

}
