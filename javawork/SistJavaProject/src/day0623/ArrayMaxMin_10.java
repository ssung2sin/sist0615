package day0623;

public class ArrayMaxMin_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data = {79,51,96,5,42,31,64,31,90,23};
		int min=data[0],max=data[0];//첫번째 값을 최댓,최솟값에 저장
		
		System.out.println("data의 길이 : "+data.length);
		System.out.println();
		System.out.println("[최솟값비교]");
		for(int i =1;i<data.length;i++) {
			if(min>data[i]) {
				min=data[i];
			}
		}
		System.out.println("최솟값 : "+min);
		
		for(int i =1;i<data.length;i++) {
			if(max<data[i]) {
				max=data[i];
			}
		}
		System.out.println("최댓값 : "+max);
	}

}
