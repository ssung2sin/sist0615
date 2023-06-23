package day0623;

import java.util.Scanner;

public class QuizArrFind_13 {

	public static void main(String[] args) {
		// 이름을 입력해서 없으면 없다고
		//있으면 몇번째 있는지 알려주기
		
		Scanner sc = new Scanner(System.in);
		String [] stuNames = {"이성신","이민규","박병주","최성현","김영준","강연주","최진평","고은비","송주영"};
		String inputName;
		boolean flag;
		System.out.println("총 "+stuNames.length+"명");
		
		while (true) {
			System.out.println("이름을 입력하시오 (끝 입력시 종료)");
			inputName = sc.nextLine();
			if(inputName.equalsIgnoreCase("끝")) {
				System.out.println("종료");
				break;
			}
			flag =false;
			for(int i =0;i<stuNames.length;i++) {
				if(inputName.equals(stuNames[i])) {
					flag=true;
					System.out.println(inputName+"은(는) "+(i+1)+"번째에 있습니다.");
					System.out.println();
				}	
			}
			if(!flag) {
				System.out.println(inputName+"은 저장값에 없습니다.");
				System.out.println();
			}
		}
		
	}

}
