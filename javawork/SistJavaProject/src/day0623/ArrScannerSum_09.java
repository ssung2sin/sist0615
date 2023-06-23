package day0623;

import java.util.Scanner;

public class ArrScannerSum_09 {

	public static void main(String[] args) {
		/*
		 0번지 값: 55
		 1번지 값: 77
		 2번지 값: 88
		 3번지 값: 49
		 4번지 값: 29
		 
		 ==============
		 [입력값 확인]
		 1번째값: 55
		 
		 
		 ==============
		 총합계: 
		 
		 */
		
		int[] arr1=new int[5];
		Scanner sc=new Scanner(System.in);
		
		int sum=0;
		for(int i=0;i<arr1.length;i++) {
			System.out.print(i+"번지 값: ");
			arr1[i]=sc.nextInt();
			sum+=arr1[i];
		}
		System.out.println();
		System.out.println("==================");
		System.out.println("[입력값 확인]");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(i+1+"번째값: "+arr1[i]);
		}
		System.out.println("==================");
		System.out.println("총합계: "+sum);

	}

}
