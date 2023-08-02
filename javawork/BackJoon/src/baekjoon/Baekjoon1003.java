package baekjoon;

import java.util.Scanner;

public class Baekjoon1003 {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int a;
		int cnt1,cnt0;
		
		for(int i=0;i<n;i++) {
			int tmp;
			cnt1=1;
			cnt0=1;
			a=sc.nextInt();
			if(a==0) {
				cnt0=1;
				cnt1=0;
			}
			else if(a==1) {
				cnt1=1;
				cnt0=0;
			}
			else if(a==2) {
				cnt1=1;
				cnt0=1;
			}
			else {
				for(int j=3;j<=a;j++) {
					tmp=cnt0;
					cnt0=cnt1;
					cnt1=cnt1+tmp;
				}
			}
			System.out.println(cnt0+" "+cnt1);
		}
		
	}

}
