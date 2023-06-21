package day0621;

import java.util.Scanner;

public class CalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		int sum,mul,sub;
		double div;
		String op;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("[계산기 출력]");
			System.out.println("정수를 입력하시오");
			a = sc.nextInt();
			sc.nextLine();
			System.out.println("수식을 입력하시오(+,-,*,/) ");
			op = sc.nextLine();
			System.out.println("정수를 입력하시오");
			b = sc.nextInt();
			
			if(op.equals("+")) {
				sum = a+b;
				System.out.println(a+" + "+b+" = "+sum);
			}
			else if(op.equals("-")) {
				sub = a-b;
			System.out.println(a+" - "+b+" = "+sub);			
			}
			else if(op.equals("*")){
				mul = a*b;
				System.out.println(a+" * "+b+" = "+mul);
			}
			else if(op.equals("/")) {
				div = (double)a/b;
				System.out.println(a+" / "+b+" = "+div);
			}
			else {
				System.out.println("수식을 잘못 입력하였으니 종료합니다.");
				break;
			}
			
		}

	}

}
