package day0621;

public class ExFor_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//초기값이 조건 안맞으면 한번도 반복 안됨
		for(int i=5;i<5;i++) {
			System.out.print(i+" ");
		}
		
		int i;
		for(i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n빠져나온후의 i값: "+i);
		
		int a=10;
		for(;a<=50;a+=5) {
			System.out.print(a+" ");
		}
		System.out.println("\n빠져나온 후의 a값: "+a);
		
		//hello를 가로로 5번 반복
		for(i=0;i<5;i++) {
			System.out.print("hello  ");
		}
		
		System.out.println("1부터 10까지 숫자중 짝수만 가로로 출력");
		System.out.print("출력쪽에 2*i : ");
		for(i=1;i<=5;i++) {
			System.out.print(2*i+" ");
		}
		System.out.print("\n 컨티뉴 작성 : ");
		for(i=1;i<=10;i++) {
			if(i%2==1) {
				continue;
			}
			System.out.print(i+ " ");
		}
		

	}

}
