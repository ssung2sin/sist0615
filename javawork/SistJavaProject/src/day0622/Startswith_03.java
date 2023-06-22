package day0622;

import java.util.Scanner;

public class Startswith_03 {

	public static void main(String[] args) {
		// 이름을 반보개서 입력후 이씨가 몇명인지 김씨가 몇명인지 알아보자
		Scanner sc = new Scanner(System.in);
		String name;
		int cnt=0;
		
		while (true) {
			System.out.println("이름을 입력하시오 ('끝' 입력시 종료)");
			name = sc.nextLine();
			if(name.equals("끝")) {
				break;
			}
			if(name.startsWith("이")) {
				cnt++;
			}
		}
		System.out.println("이 씨인 사람의 수는 "+cnt+"명 입니다.");

	}

}
