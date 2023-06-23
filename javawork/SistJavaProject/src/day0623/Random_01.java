package day0623;

public class Random_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 자바에서 난수를 구하는 방법 2가지
		 * 1.Math.random() 메서드를 이용하는방법
		 * 2.Random 이라는 클래스를 생성해서 구하는 방법
		 */
		
		//1.Math.random() 사용
		System.out.println("기본 난수 5개 발생");
		
		for(int i =1; i<=5;i++) {
			int a=(int)(10*Math.random()); //0.xxxxx~0.99xxxxx
			System.out.println(a);	
		}
		System.out.println();
		
		System.out.println("1~10사이의 난수5개발생");
		for(int i=1;i<=5;i++) {
			int a=(int)(10*Math.random()+1);
			System.out.println(a);
		}
		System.out.println();
		
		System.out.println("1~100사이의 난수발생 5개");
		for(int i=1;i<=5;i++) {
			int a=(int)(100*Math.random()+1);
			System.out.println(a);
		}
		System.out.println();
		
		System.out.println("주사위 눈금 1~6 5개");
		for(int i=1;i<=5;i++) {
			int a=(int)(10*Math.random()/1.666+1);
			System.out.println(a);
		}
		
	}

}
