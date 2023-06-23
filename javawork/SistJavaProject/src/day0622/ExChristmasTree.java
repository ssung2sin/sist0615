package day0622;

import java.util.Scanner;

public class ExChristmasTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,star,space,stair;
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("만들고 싶은 크리스마스 트리 층수를 입력하세요 : (0 출력시 종료)");
			stair=sc.nextInt();
			if(stair==0) {
				System.out.println("종료합니다.");
				System.out.println();
				break;
			}
			for(i=1;i<=stair;i++) {
				
				for(space=1;space<=stair-i;space++) {
						System.out.print(" ");
					}
				
				for(star=1;star<=(2*i-1);star++) {
					System.out.print("*");
					}
				
				System.out.println();
			}
		}

	}

}
