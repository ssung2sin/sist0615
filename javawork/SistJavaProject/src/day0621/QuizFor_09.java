package day0621;

public class QuizFor_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q.1 2 4 5 7 8 10 _continue 이용 출력
		
		for(int i=1;i<=10;i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println("홀수값: "+i);
		}
		
		System.out.println();
		int osum=0,esum=0;
		
		for(int i =1;i<=100;i++) {
			if(i%2==0) {
				esum+=i;
				continue;
			}
			osum+=i;
		}
			System.out.println("짝수의 합 : "+esum);
			System.out.println("홀수의 합 : "+osum);
		
			System.out.println();
			System.out.println("whlie(true)문 작성");
			int i=1;
			osum=0;
			esum=0;
		while(true) {
			
			if(i%2==1) {
				osum+=i;
			}
			else {
				esum+=i;
			}
			i++;
			if(i>100) {
				break;
			}
			

		}
		System.out.println("짝수의 합 : "+esum);
		System.out.println("홀수의 합 : "+osum);
	}
}

