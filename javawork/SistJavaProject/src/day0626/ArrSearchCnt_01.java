package day0626;

import java.util.Scanner;

public class ArrSearchCnt_01 {

	public static void main(String[] args) {
		/*
		 성을 입력시 그 성씨를 가진 사람과 총 인원수 출력..종료 라고하면 프로그램 종료 
		 */
	
		String names[] = {"김선호","나나","이효리","엄정화","김완선","보아","유재석","하하","전소미","김연진","이진"};
		String firstName;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int cnt=0;
			System.out.println("검색할 성씨를 입력하시오 ");
			firstName = sc.nextLine();
			
			if(firstName.equals("종료")) {
				System.out.println("종료합니다.");
				break;
			}
			for(int i=0;i<names.length;i++) {
				
				if(names[i].startsWith(firstName)) {
					cnt++;
					System.out.print(names[i]+" ");
				}
			}
			if(cnt==0) {
				System.out.println("한명도 일치하는 성이 없습니다.\n");
				continue;
			}
			
			System.out.println("총 "+cnt+"명 입니다.\n");
			
		}

	}

}
