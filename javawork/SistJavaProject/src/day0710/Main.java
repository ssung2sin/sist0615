package day0710;


import java.util.Scanner;
	
	public class Main {
	
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int revA,revB,revSum,sum;
			
			if(a>=1&&a<10) {
				revA=a;
			}
			else if(a>=10&& a<100) {
				int ten=a/10;
				int one=a%10;
				if(one==0) {
					revA=ten;
				}
				revA=Integer.parseInt(one+""+ten);
			}
			else if(a==1000) {
				revA=1;
			}
			else if(a>99&&a<1000) {
				int hund=a/100;
				int ten=(a/10-hund*10);
				int one=a%10;
				if(one==0) {
					if(ten==0) {
						revA=hund;
					}
					revA=Integer.parseInt(ten+""+hund);
				}
				revA=Integer.parseInt(one+""+ten+""+hund);
			}
			else {
				revA=a;
			}
			
			if(b>=1&&b<10) {
				revB=b;
			}
			else if(b>=10&& b<100) {
				int ten=b/10;
				int one=b%10;
				if(one==0) {
					revB=ten;
				}
				revB=Integer.parseInt(one+""+ten);
			}
			else if(b==1000) {
				revB=1;
			}
			else if(b>99&&b<1000) {
				int hund=b/100;
				int ten=(b/10-hund*10);
				int one=b%10;
				if(one==0) {
					if(ten==0) {
						revB=hund;
					}
					revB=Integer.parseInt(ten+""+hund);
				}
				revB=Integer.parseInt(one+""+ten+""+hund);
			}
			else {
				revB=b;
			}
			revSum=revA+revB;
			if(revSum>1&&revSum<10) {
				sum=revSum;
			}
			else if(revSum>=10&& revSum<100) {
				int ten=revSum/10;
				int one=revSum%10;
				if(one==0) {
					sum=ten;
				}
				sum=Integer.parseInt(one+""+ten);
			}
			else if(revSum==1000) {
				sum=1;
			}
			else if(revSum>99&&revSum<1000) {
				int hund=revSum/100;
				int ten=(revSum/10-hund*10);
				int one=revSum%10;
				if(one==0) {
					if(ten==0) {
						sum=hund;
					}
					sum=Integer.parseInt(ten+""+hund);
				}
				sum=Integer.parseInt(one+""+ten+""+hund);
			}
			else {
				sum=revSum;
			}
			
			System.out.println(sum);
			
	
		}
	
	}
