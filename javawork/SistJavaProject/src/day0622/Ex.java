package day0622;

import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String menu;
		
		while(true) {
			System.out.println("먹고 싶은 음식의 종류 : (한식,중식,일식,양식 선택 / 종료시 0 입력)");
			menu=sc.nextLine();
			int i ;
			if(menu.equals("한식")) {
				i=1;
			}
			else if(menu.equals("중식")) {
				i=2;
			}
			else if(menu.equals("일식")) {
				i=3;
			}
			else if(menu.equals("양식")) {
				i=4;
			}
			else if(menu.equals("0")) {
				System.out.println("종료합니다.");
				break;
			}
			else {
				System.out.println("왜 다른거 입력하셨나요? 말 안들으시네요. 다시 입력하세요.");
				System.out.println();
				continue;
			}
			if(i==1) {
				System.out.println("당신은 한식을 고르셨습니다.");
				System.out.println("메뉴 추천 : 1.제육 2. 김찌 3. 된찌 4. 삼겹살 등등.");
			}
			else if(i==2) {
				System.out.println("당신은 중식을 고르셨습니다.");
				System.out.println("메뉴 추천 : 1.짜장면 2.짬뽕 3. 탕수육 4. 양장피 5.짬짜면(섞는메뉴) 등등.");
			}
			else if(i==3) {
				System.out.println("당신은 일식을 고르셨습니다.");
				System.out.println("메뉴 추천 : 1.초밥 2.스시 3.연어초밥 4.훈제연어초밥 5.돈카츠 등등.");
			}
			else if(i==4) {
				System.out.println("당신은 양식을 고르셨습니다.");
				System.out.println("메뉴 추천 : 1.스테이크 2.파스타 3.돈까스(?) 4.리조또 5.필라프 등등.");
			}
			System.out.println();
		}
	}
}
