package baekjoon;

import java.util.Scanner;

public class Baek1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int result=0;
		int hund,ten,one;
		if (n==1000) {
			n=999;
		}
		if(n<100) {
			result=n;
		}
		else if(n<1000) {
			result=99;
			for(int i=100;i<=n;i++) {
			hund=i/100;
			ten=(i/10-hund*10);
			one=i%10;
				if(hund==ten&&ten==one) {
					result++;
				}
				else if(hund-ten>0) {
					if((hund-ten)==(ten-one)) {
						result++;
					}
				}
				else if(hund-ten<0) {
					if((ten-hund)==(one-ten)) {
						result++;
					}
				}
				else
					continue;
			}
		}
		System.out.println(result);

	}

}
