package day0621;

import java.util.Scanner;

public class WhileTrueCount_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * 임의의 수를 입력해서 합계,평균,갯수 
		 * 단 0을 입력하면 while문을 빠져나가게 하자
		 * */
		Scanner sc =new Scanner(System.in);
		int su,sum=0;
		int cnt=0;
		double avg=0;
		while(true) {
			System.out.println("수를 입력하시오(종료:0)");
			su=sc.nextInt();
			
			
			if(su==0)
				break;
			sum+=su;
			cnt+=1;
		}
		avg = (double)sum/cnt;
		System.out.println("합계 : "+sum+", 평균 : "+avg+", 갯수 : "+cnt);
		
		
		
	}

}
