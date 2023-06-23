package day0623;

import java.util.Random;

public class Random_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		
		System.out.println("0~9사이의 난수 발생");
		
		for(int i=1 ;i<=5;i++) {
			int n = r.nextInt(10);
			System.out.println(n);
		}
		
		System.out.println();
		System.out.println("주사위 눈금 출력");
		
		for(int i=1 ;i<=5;i++) {
			int n = r.nextInt(10);
			System.out.println((int)(n/1.666)+1);
		}
		

	}

}
