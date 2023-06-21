package day0621;

import java.util.Scanner;

public class ForSum_08 {
	
	public static void main(String[] args) {
	
		//for문으로 합계구하기
		//1~10까지 합계
		int sum=0;//합계구하는 변수
		
		for(int i=1;i<=10;i++) {
			sum+=i;//sum=sum+i 합계변수에 i를 누적시킨다
		}
		System.out.println("1부터 10까지의 합은 "+sum+" 입니다.");
		
		//while문으로 합계구해보기
		int tot =0;
		int i = 1;
		while(i<=10) {
			tot += i;
			i++;
		}
		System.out.println("1부터 "+(i-1)+ "까지의 합은 "+tot+" 입니다.");
		
		Scanner sc = new Scanner(System.in);
		int n;
		int total=0;
		
		System.out.println("1부터 n까지의 합을 구하는 n값을 입력하시오");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			total+=i;
		}
		System.out.println("1부터 "+n+"까지의 합은 "+total+"입니다.");
	}

}
