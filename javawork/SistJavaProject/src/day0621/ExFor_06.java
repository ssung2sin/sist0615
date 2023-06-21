package day0621;

public class ExFor_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for 문
		//1~10까지 가로로 출력
		for(int i=0;i<10;i++) {
			System.out.print((i+1)+" ");
		}
		
		System.out.println();
		//10~1 가로로 출력
		
		for(int i=10;i>0;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//1~50까지 출력 3씩증가
		for(int i=1;i<50;i+=3) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		for(int i=1;i<18;i++) {
			System.out.print((3*i-2)+" ");
		}
		System.out.println();
		
		//continue
		//1~20까지 출력하는데 1 2 3 4 6 7 8 9 11 ..
		
		for(int i=0;i<=20;i++) {
			if(i%5==0) {
				continue; //i++로 이동
			}
			System.out.printf(i+" ");
		}
	}

}
