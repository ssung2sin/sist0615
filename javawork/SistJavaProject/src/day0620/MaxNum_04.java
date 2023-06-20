package day0620;

import java.util.Scanner;

public class MaxNum_04 {

	public static void main(String[] args) {
		/*
		 3개의 수를 입력
		 5
		 7
		 8
		 
		 ***if문
		 ***삼항연산자
		 가장큰수 : 8
		 */
		
		Scanner sc = new Scanner(System.in);
		int x,y,z,max;
		
		System.out.println("3개의 수를 입력");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		
		if(x>y) {
			if(x>z)
				max=x;
			else
				max=z;
		}
		else{
			if(y>z)
				max=y;
			else
				max=z;
		}
		
		System.out.println("가장큰수: "+max);
		
		//옆의 형 풀이
		if(x>y && x>z)
			max = x;
		else if(y>x && y>z)
			max = y;
		else
			max = z;
		System.out.println("가장큰수: "+max);
		
		//삼항연산자
		max = x>y&&x>z ? x : y>x&&y>z ? y : z;
		System.out.println("가장큰수: "+max);
		
	}

}
