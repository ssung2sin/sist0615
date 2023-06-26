package day0626;

import java.util.Scanner;

public class QuizFind_05 {

	public static void main(String[] args) {
		/*
		 * 숫자를 입력 받아서 배열의 몇번째에 있는지 출력하고 없을경우 없습니다 라고 출력하세요
		 * (0이면 종료)
		 * 입력값: 11
		 *      11은 2번째에 있어요
		 * 입력값: 100
		 * 		100은 없습니다.
		 * 입력값: 0
		 * 		종료합니다(프로그램종료)
		 */
		Scanner sc = new Scanner(System.in);
		int[] arrNums= {23,11,55,88,99,77,54,21,32,2,6};
		int inputNum;
		
		while (true) {
			System.out.print("입력값: ");
			inputNum=sc.nextInt();
			if(inputNum==0) {
				System.out.println("\t종료합니다(프로그램종료)");
				break;
			}
			boolean flag =false;
			
			for(int i=0;i<arrNums.length;i++) {
				if(inputNum==arrNums[i]) {
					flag=true;
					System.out.printf("\t%d은(는) %d번째에 있어요!\n",inputNum,i+1);
				}
			}
			if(!flag) {
				System.out.printf("\t%d은(는) 없습니다\n",inputNum);
			}
	
		}

	}

}
