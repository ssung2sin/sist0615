package day0619;

import java.util.Scanner;

public class ScannerScore_03 {

	public static void main(String[] args) {
		// 콘솔창에 변수값을 입력받아서 출력할것!!!!
		
		//생성
		Scanner sc=new Scanner(System.in);	
		//변수
		String name;
		int kor,eng,mat;
		int tot;
		double avg;
		
		
		
		//입력
		System.out.println("학생의 이름은?");
		name=sc.nextLine();
		System.out.println("국어점수는?");
		kor=sc.nextInt();
		System.out.println("영어점수는?");
		eng=sc.nextInt();
		System.out.println("수학점수는?");
		mat=sc.nextInt();
		
		
		//계산
		tot=kor+eng+mat;
		avg=tot/3.0;
		
		//최종출력
		System.out.println("===========================");
		System.out.println("학생명: "+name);
		System.out.println("국어점수: "+kor);
		System.out.println("영어점수: "+eng);
		System.out.println("수학점수: "+mat);
		System.out.println("===========================");
		System.out.println("총점: "+tot+"점");
		System.out.println("평균: "+avg+"점");
		

	}

}
