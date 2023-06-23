package day0623;

import java.util.Scanner;

public class ArrayIntFind_12 {

	public static void main(String[] args) {
		// 숫자를 입력해서 그 숫자가 몇번째 있는지 찾기
		
		Scanner sc = new Scanner(System.in);
		int [] data = {5,12,46,99,88,77,32,65,54,110,85,11};
		int num;
		boolean flag;
		
		while(true) {
			System.out.println("숫자를 입력하시오 (0 출력시 종료)");
			num=sc.nextInt();
			if(num==0) {
				System.out.println("종료합니다.");
				break;
			}
			
			//있다 없다 초기값
			flag=false;
			for(int i=0;i<data.length;i++) {
				if(num==data[i]) {
					flag=true;
					System.out.println("그 숫자는 "+(i+1)+"번째에 있습니다.\n");
				}
			}
			if(!flag) {//flag==false / flag = true / !flag = false
				System.out.println(num+"은(는) 데이터에 없습니다.\n");
			}
		}
	}

}
