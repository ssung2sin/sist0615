package day0628;

import java.util.Scanner;

public class SawonMain {
	
	public static void getSawon(Sawon[] sawon) {
		//제목
		Sawon.getTitle();
		
		for(Sawon s:sawon) {
			System.out.println(s.getSawonName()+"\t"+s.getPay()+"\t"+s.getFamsu()
			+"\t"+s.getTimesu()+"\t"+s.getFamilySudang()+"\t"+s.getTimeSudang()+"\t"+s.getTotalPay());
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int sawonSu;
		
		Sawon [] sawon;
		System.out.print("사원수를 입력하세요. ");
		sawonSu=Integer.parseInt(sc.nextLine());
		sawon=new Sawon[sawonSu];
		for(int i=0;i<sawon.length;i++) {
			//sawon 생성
			sawon[i]=new Sawon();
			System.out.println("사원 이름: ");
			sawon[i].setSawonName(sc.nextLine());
			System.out.println("급여: ");
			sawon[i].setPay(Integer.parseInt(sc.nextLine()));
			System.out.println("가족수: ");
			sawon[i].setFamsu(Integer.parseInt(sc.nextLine()));
			System.out.println("초과시간: ");
			sawon[i].setTimesu(Integer.parseInt(sc.nextLine()));
		}
		
		//출력
		getSawon(sawon);
		
	}
}
