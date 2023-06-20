package day0620;

import java.util.Scanner;

public class Return_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int score;
		
		System.out.println("점수입력(1~100)");
		score=sc.nextInt();
		
		//잘못입력했을때 종료
		if(score>100||score<1) {
			System.out.println("잘못입력했습니다.");
			return;
		}
		else
			System.out.println("점수: "+score);
	}

}
