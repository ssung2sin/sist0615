package day0622;

import java.util.Scanner;

public class ExTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int stair;
		
		while(true) {
			System.out.println("트리 층수를 입력하시오 (0을 입력시 종료)");
			stair = sc.nextInt();
			if(stair==0) {
				System.out.println("출력종료");
				System.out.println();
				break;
			}
			
			for(int i=stair;i>=1;i--) {
				for(int j=1;j<=stair;j++) {
					if(j>=i)
						System.out.print("*");
					System.out.print(" ");
				}
				System.out.println(" ");
			}
		}

	}

}
