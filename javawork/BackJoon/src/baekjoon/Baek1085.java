package baekjoon;

import java.util.Scanner;

public class Baek1085 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		int min;
		if(r1>r2) {
			min=r2;
		}
		else {
			min=r1;
		}
		
		if(r1-n1<min) {
			min=r1-n1;
		}
		if(n1-0<min) {
			min=n1;
		}
		if(r2-n2<min) {
			min=r2-n2;
		}
		if(n2-0<min) {
			min=n2;
		}
		int result=min;
		System.out.println(result);
	}


}
