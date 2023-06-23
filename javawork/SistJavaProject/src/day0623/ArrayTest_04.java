package day0623;

import java.util.Scanner;

public class ArrayTest_04 {

	public static void main(String[] args) {
		//기본형 배열은 객체로 인식
		
		Scanner sc= new Scanner(System.in);
		int [] arr1,arr2; //배열로 선언
		arr1=new int[3]; //메모리할당 new + class명 or 객체명(?)
		arr2=new int[5]; //할당만 되도 값은 0으로 초기화
		
		//int [] arr1=new int[3];
		//int arr2 []=new int[5];
		
		arr1[0]=10;
		arr1[1]=5;
		arr1[2]=20;
		
		//배열의갯수
		
		System.out.println(arr1.length);
		System.out.println(arr2.length);
		System.out.println("arr1 출력");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		System.out.println();
		/*System.out.println("arr2 값입력");
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2["+i+"]값 입력");
			arr2[i]=sc.nextInt();
			System.out.println("arr2["+i+"]= "+arr2[i]+"\n");
			
		}*/
		
		//for~each문
		
		for(int a1:arr1) {
			System.out.println(a1);
		}

	}

}
