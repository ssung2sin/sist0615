package day0620;

import java.util.Scanner;

public class LeapYear_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 년도를 입력후 윤년인지 평년인지 출력
		 * 공식
		 * 년도를 4로 나누어서 나머지가 0이고
		 * 년도를 100으로 나눠서 나머지가 0이 아니거나
		 * 년도를 400으로 나눠서 나머지가 0이면 윤년
		 * */
		
		Scanner sc = new Scanner(System.in);
		int year;
		
		System.out.println("년도 입력");
		year = sc.nextInt();
		
		if(year%4==0&&year%100!=0||year%400==0) {
			System.out.println(year+"년은 윤년입니다.");
		}
		else
			System.out.println(year+"년은 평년입니다.");

	}

}
