package baekjoon;

import java.util.Scanner;

public class Baek1546 {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int []a=new int[n];
		int max=0,sum=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(max<a[i]) {
				max=a[i];
			}
			sum+=a[i];
		}
		double avg=((double)sum/max)*(100.0/n);
		
		System.out.println(avg);
		
	}

}