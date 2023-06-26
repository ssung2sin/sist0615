package day0626;

import java.util.Scanner;

public class BuyLottos_04 {

	public static void main(String[] args) {
		// 몇장 구이발건지 입력하여 여러개 출력
		
		Scanner sc =new Scanner(System.in);
		int buy;	
		int [] lotto = new int[6];
		
		System.out.println("로또 구입 금액을 입력해주세요");
		buy=sc.nextInt();
		//예외조항
		if(buy<1000) {
			System.out.println("***구입금액이 부족합니다***");
			return; //메인함수 자체를 빠져나감
		}
		for(int n=0;n<buy/1000;n++) {
			
			System.out.printf("\n%d회: ",n+1);
		
			for(int i=0;i<lotto.length;i++) {
				//1~45까지의 랜덤수 발생
				lotto[i]=(int)(Math.random()*45+1);
			
				for(int j=0;j<i;j++) {
					if(lotto[i]==lotto[j]) {
						i--; //같은 번지에 다시 값을 구하기 위해서
						break; //i++로 이동
					}
				}	
			}
		
			//Arrays.sort(lotto);
		
			for(int i=0;i<lotto.length-1;i++) {
			
				for(int j=i;j<lotto.length;j++) {				
					if(lotto[i]>lotto[j]) {
						int tmp = lotto[i];
						lotto[i]=lotto[j];
						lotto[j]=tmp;
					}
				}
			}
			for(int i=0;i<lotto.length;i++) {
				System.out.printf("%d ",lotto[i]);
			}
		}
	}
}
