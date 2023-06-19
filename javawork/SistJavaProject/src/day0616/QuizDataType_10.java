package day0616;

public class QuizDataType_10 {

	public static void main(String[] args) {
		
		/*매개변수(args)를 이횽하여 출력해보세요
		 * [시험결과]
		 * Java=88,Jsp=77,Spring=99
		 * 총점: 264 점
		 * 평균: 88.00 점
		 * */
		
		System.out.println("[시험결과]");
		int javaScore = Integer.parseInt(args[0]);
		int jspScore = Integer.parseInt(args[1]);
		int springScore = Integer.parseInt(args[2]);
		
		System.out.println("Java="+javaScore+",Jsp="+jspScore+"Spring="+springScore);
		
		int totScore = javaScore+jspScore+springScore;
		System.out.println("총점: "+totScore);
		
		double evgScore = totScore/3;
		System.out.printf("평균: %.2f 점",evgScore);
		
	}
}