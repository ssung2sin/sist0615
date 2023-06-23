package day0623;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SuMatch_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//랜덤수를 발생시킨 후 그 숫자를 맞춰보기
		
		//Random r = new Random();
		Scanner sc = new Scanner(System.in);
			
		//1~100사이 랜덤수 발생
		int rnd = (int)(100*Math.random())+1;
		
		int input; //입력할 숫자
		int cnt=0;
		
		while(true) {
			cnt++;
			System.out.print("숫자 "+cnt+"번째 : ");
			input = sc.nextInt();
			
			if (input>rnd) {
				System.out.println(input+"보다 작습니다");
			}
			else if(input<rnd) {
				System.out.println(input+"보다 큽니다");
			}
			else {
				System.out.println("맞았습니다 정답은 "+rnd+"입니다.");
				System.out.println("총 "+cnt+"회 입력");
				System.out.println("게임 종료");
				break;
			}
			
		}
		

	}

}
