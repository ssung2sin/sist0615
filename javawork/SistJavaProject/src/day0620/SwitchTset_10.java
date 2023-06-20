package day0620;

public class SwitchTset_10 {

	public static void main(String[] args) {

		
		int n=6;
		
		switch(n) {
		case 1:
			System.out.println("n = 1");
			break;
		case 2:
			System.out.println("n = 2");
			break;
		case 3:
			System.out.println("n = 3");
			break;
		case 4:
			System.out.println("n = 4");
			break;
		case 5:
			System.out.println("n = 5");
			break;
		default:
			System.out.println("n > 5");	
			break;
		}
		
		String msg="hello";
		//문자열은 jdk8부터
		switch(msg) {
		case "hello":
			System.out.println("안녕");
			break;
		case "happy":
			System.out.println("행복하다");
			break;
		case "nice":
			System.out.println("나이스");
			break;
		}
		
		int score = 79;
		char grade;
		
		switch(score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
		default:
			grade = 'F';
			break;
		}
		System.out.println("당신의 학점은 "+grade+" 입니다.");

	}

}