package day0622;

public class GaroGugu_06 {

	public static void main(String[] args) {
		// 가로방향 구구단 출력
		//[2단]  [3단]..
		for(int dan=2;dan<=9;dan++) {
			System.out.printf("[%d단]\t",dan);
		}
		System.out.println();
		for(int j=1;j<=9;j++) {
			for(int dan=2;dan<=9;dan++) {
				System.out.printf("%dX%d=%d\t",dan,j,dan*j);
			}
			System.out.println();
		}

	}

}
