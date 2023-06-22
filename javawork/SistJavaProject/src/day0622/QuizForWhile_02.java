package day0622;

import java.util.Scanner;

public class QuizForWhile_02 {

	public static void quiz1() {
		//점수를 입력하면 합계를 구하시오
		//1~100 아니면 제외
		Scanner sc = new Scanner(System.in);
		int tot=0;
		while(true) {
			System.out.println("1~100사이의 점수를 입력하시오 (0입력시 종료)");
			int score = sc.nextInt();
			if (score == 0) {
				System.out.println("출력종료");
				break;
			}
			if (score>100 || score<0) {
				System.out.println("잘못 입력하였습니다.");
				continue;
			}
			tot+=score;
				
		}
		System.out.println("총합 : "+tot);
		
	}
	
	public static void quiz2() {
		//점수 반복해서 입려갛면 합계,평균을 구하시오
		//끝이라고 입력시 프로그램 종료
		
		String score;
		int cnt=0,tot=0;
		double avg;
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.println("점수를 입력하시오 (끝 출력시 종료) ");
			score = sc.nextLine();
			
			if(score.equals("끝")) {
				System.out.println("끝 출력하였습니다. 종료!");
				break;
			}
			cnt++;
			tot+=Integer.parseInt(score);
		}
		avg = (double)tot/cnt;
		System.out.println("총 합계 : "+tot);
		System.out.printf("평균 : %.2f\n",avg);
		
	}
	
	public static void quiz3() {
		//총 5개의 점수를 입력받아 합계를 구하시오
		//만약 1~100점이 아닐경우 다시 입력 받음
		Scanner sc = new Scanner(System.in);
		int score,tot=0,cnt=5;
		
		for(;cnt>0;cnt--) {
			System.out.print((6-cnt)+"번점수 : ");
			score=sc.nextInt();
			if(score<1||score>100) {
				System.out.println("잘못 입력했습니다.");
				cnt++;
				continue;
			}
			tot+=score;
			
		}
		System.out.println("총 합계 : "+tot);
		
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		quiz3();
	}

}
