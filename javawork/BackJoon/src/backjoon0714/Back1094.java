package backjoon0714;

import java.util.Scanner;

public class Back1094 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=64;
		int x=sc.nextInt();
		int tmp=a;
		int tot=x;
		int div[] =new int[7];
		div[0]=64;
		int cnt=0;
		for(int i=1;i<div.length;i++) {
			div[i]=tmp/2;
			tmp=div[i];
		}
		
		while(true) {
			
			for(int i=0;i<div.length;i++) {
				if(tot>=div[i]) {
					tot-=div[i];
					cnt++;
				}
				else if(tot==0) {
					System.out.println(cnt);
					return;
				}
			}
		}
	}

}
