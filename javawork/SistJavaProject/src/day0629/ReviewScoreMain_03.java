package day0629;

import java.util.Scanner;

/*
 학생명 Java Oracle 총점  평균  평가
 */
public class ReviewScoreMain_03 {
	
	public static void getTotGrade(ReviewScore_03 s[]) {
		for(ReviewScore_03 s1:s) {
		System.out.println(s1.getName()+"\t|"+s1.getJava()+"\t|"+s1.getOracle()+"\t|"+s1.getTot()
		+"\t|"+s1.getAvg()+"\t|"+s1.getGrade());
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int inwon;
		ReviewScore_03 sco[];
		String schoolName;
		
		System.out.print("입력하실 인원수 : ");
		inwon = Integer.parseInt(sc.nextLine());
		
		System.out.print("학교명 :");
		schoolName=sc.nextLine();
		ReviewScore_03.setSchoolName(schoolName);
		
		sco =new ReviewScore_03[inwon];
		
		for(int i=0;i<sco.length;i++) {
			sco[i]=new ReviewScore_03();
			System.out.print((i+1)+"번째 학생 이름: ");
			sco[i].setName(sc.nextLine());
			System.out.print((i+1)+"번째 자바 성적: ");
			sco[i].setJava(Integer.parseInt(sc.nextLine()));
			System.out.print((i+1)+"번째 오라클 성적: ");
			sco[i].setOracle(Integer.parseInt(sc.nextLine()));
		}
		
		//결과출력
		
		ReviewScore_03.title();
		ReviewScore_03.getSchoolName();
		getTotGrade(sco);
		
	}

}
