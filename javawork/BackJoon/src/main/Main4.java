package main;

import java.util.Scanner;

public class Main4 {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int k=sc.nextInt();
		int n=sc.nextInt();
		int arr[]=new int[k];
		long sum=0;
		long max=0;
		long div_num=0;
		long div_min=1;
		long div_max=0;
		long tmp;
		boolean flag1=false,flag2=false;
		long last_tmp=0;
		for(int i=0;i<k;i++) {
			arr[i]=sc.nextInt();
			if(max<arr[i]) {
				max=arr[i];
			}
			sum+=arr[i];
		}
		div_max=sum/n;
		while(true) {
			int cnt=0;
			tmp=(div_max+div_min)/2;
			for(int i=0;i<k;i++) {
				cnt+=arr[i]/tmp;
			}
			if(cnt==n) {
				flag2=true;
				if(flag1!=flag2&&last_tmp-tmp==1) {
					System.out.println(tmp);
					break;
				}
				else {
					div_min=tmp;
					flag1=true;
					last_tmp=tmp;
				}
			}else if(flag1!=flag2&&tmp-last_tmp==1) {
				System.out.println(last_tmp);
				break;
			}else if(cnt>n) {
				div_min=tmp;
				flag1=true;
				last_tmp=tmp;
			}
			else {
				div_max=tmp;
				flag1=false;
				last_tmp=tmp;
			}
		}
	}

}
