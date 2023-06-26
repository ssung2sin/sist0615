package day0626;

import java.util.Arrays;

public class LottoSort_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] lotto = new int[6];
		
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
