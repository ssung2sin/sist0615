package main;

import java.math.BigInteger;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BigInteger result;
		int n=sc.nextInt();
		int min1,max1,minIndex,maxIndex;
		int dice[] = new int[6];
		for(int i=0;i<dice.length;i++) {
			dice[i]=sc.nextInt();
		}
		min1=dice[0];
		max1=dice[0];
		for(int i=0;i<dice.length-1;i++) {
			if(min1>dice[i+1]) {
				min1=dice[i+1];
				minIndex=i;
			}
			if(max1<dice[i+1]) {
				max1=dice[i+1];
				maxIndex=i;
			}

		}
		int min2=dice[0]+dice[1],max2=dice[0]+dice[1];
		for(int i=1;i<dice.length-1;i++) {
			int tmp=dice[0]+dice[i];
			if(min2>tmp) {
				min2=tmp;
			}
		}
		for(int i=1;i<dice.length-1;i++) {
			int tmp=dice[5]+dice[i];
			if(min2>tmp) {
				min2=tmp;
			}
		}
		if(min2>dice[3]+dice[4]) {
			min2=dice[3]+dice[4];
		}
		else if(min2>dice[1]+dice[4]) {
			min2=dice[1]+dice[4];
		}
		else if(min2>dice[1]+dice[3]) {
			min2=dice[1]+dice[3];
		}
		else if(min2>dice[1]+dice[2]) {
			min2=dice[1]+dice[2];
		}
		
		for(int i=1;i<dice.length-1;i++) {
			int tmp=dice[0]+dice[i];
			if(max2<tmp) {
				max2=tmp;
			}
		}
		for(int i=1;i<dice.length-1;i++) {
			int tmp=dice[5]+dice[i];
			if(max2<tmp) {
				max2=tmp;
			}
		}
		if(max2<dice[3]+dice[4]) {
			max2=dice[3]+dice[4];
		}
		else if(max2<dice[1]+dice[4]) {
			max2=dice[1]+dice[4];
		}
		else if(max2<dice[1]+dice[3]) {
			max2=dice[1]+dice[3];
		}
		else if(max2<dice[1]+dice[2]) {
			max2=dice[1]+dice[2];
		}
		
		int min3=dice[0]+dice[1]+dice[2],max3=dice[0]+dice[1]+dice[2];
		for(int i=1;i<=dice.length-1;i++) {
			
			for(int j=i+1;j<dice.length;j++) {
				int tmp=dice[0]+dice[i]+dice[j];
				if(min3>tmp) {
					min3=tmp;
				}
			}
		}
		for(int i=1;i<=dice.length-1;i++) {
			
			for(int j=i+1;j<dice.length;j++) {
				int tmp=dice[0]+dice[i]+dice[j];
				if(max3<tmp) {
					max3=tmp;
				}
			}
		}
		
        int totNum = n * n * 5;
        BigInteger tot = BigInteger.valueOf(0);
        if (n == 1) {
            for (int i = 0; i < dice.length; i++) {
                tot = tot.add(BigInteger.valueOf(dice[i]));
            }
            tot = tot.subtract(BigInteger.valueOf(max1));
            result = tot;
        } else if (n >= 2) {
            tot = tot.add(BigInteger.valueOf(min3 * 4));
            totNum -= 4 * 3;
            tot = tot.add(BigInteger.valueOf(min2 * (8 * (n - 1) - 4)));
            totNum -= (8 * (n - 1) - 4) * 2;
            tot = tot.add(BigInteger.valueOf(min1 * totNum));
            result = tot;
        } else {
            // 예외 처리 (n이 1 미만인 경우)
            result = BigInteger.ZERO;
        }

        System.out.println(result); // 결과 출력
    }
}


