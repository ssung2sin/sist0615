package day0622;

public class ForStar_07 {

	public static void main(String[] args) {
		//중첩(다중)for문으로 별모양 찍기
		
		System.out.println("중첩(다중)for문으로 별모양 찍기");
		int i,j;
		for(i=1;i<=5;i++) {//행 갯수
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(i=1;i<=5;i++) {
			for(j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
