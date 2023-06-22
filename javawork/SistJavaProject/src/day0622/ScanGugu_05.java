package day0622;

import java.util.Scanner;

public class ScanGugu_05 {

	public static void main(String[] args) {
		// 단을 입력해서 해당 단 출력하기
		Scanner sc = new Scanner(System.in);
		int i=1;
		while (true) {
			i=1;
			System.out.println("구구단 출력 단을 입력하세요 (0출력시 종료)");
			int dan = sc.nextInt();
			
			if(dan == 0) {
				System.out.println("종료합니다.");
				break;
			}
			else if(dan<2||dan>9) {
				System.out.println("허용범위를 벗어났습니다.");
				System.out.println();
				continue;
			}
			System.out.println("["+dan+"단]");
			while(true) {
				System.out.println(dan+"X"+i+"="+dan*i);
				if(i==9) {
					break;
				}
				i++;
			}
			System.out.println();
		
		}
	}

}
