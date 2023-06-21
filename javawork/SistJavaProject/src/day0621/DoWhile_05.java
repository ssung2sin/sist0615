package day0621;

public class DoWhile_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		
		System.out.println("while문 결과");
		//조건이 선조건 참일동안 반복
		while(i>5) {
			System.out.println(i++);
		}
		i=1;
		
		//조건이 후조건 조건안맞아도 do안에 문장 1번은 무조건 출력
		do {
			System.out.println(i++);
		}while(i>5);

	}

}
