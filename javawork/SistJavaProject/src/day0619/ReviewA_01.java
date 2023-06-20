package day0619;

public class ReviewA_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 매개변수로 실행시 이름,국영수 3과목을 넘겨서 이름,과목점수,총점,평균까지출력하시오
		
		//변수선언
		String name=args[0];
		int kor=Integer.parseInt(args[1]);
		int eng=Integer.parseInt(args[2]);
		int mat=Integer.parseInt(args[3]);
		
		//계산
		int tot=kor+eng+mat;
		double avg=tot/3.0;
		
		//출력
		System.out.println("****중간고사 시험점수****");
		System.out.println("학생명: "+name);
		System.out.println("국어점수: "+kor);
		System.out.println("영어점수: "+eng);
		System.out.println("수학점수: "+mat);
		System.out.println("============================");
		System.out.println("총점: "+tot);
		System.out.println("평균: "+avg);

	}

}
