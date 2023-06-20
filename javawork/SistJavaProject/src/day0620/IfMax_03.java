package day0620;

import java.util.Scanner;

public class IfMax_03 {

	public static void main(String[] args) {
		// 2개의 숫자를 입력받았을 때 Max,Min값 구해보기
		
		Scanner sc = new Scanner(System.in);
		
		int x, y,max;
		String size;
		
		System.out.println("두개의 숫자를 입력하시오 ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		System.out.println("입력한 두수: "+x+", "+y);
		
		
		max = x>y ? x : y;
		System.out.println("두수중에서 더 큰 값은 "+max+"입니다");
		
		//삼항연산자를 이용하여 첫번째 수가 더 작다 /더 크다 출력!
		
		//size = x>y ? "크다" : "작다";
		//System.out.println("첫번째 수가 더 "+size);
		
		//선생님풀이
		System.out.println("첫번째 수가 더 "+(x>y ? "크다":"작다"));

	}

}
