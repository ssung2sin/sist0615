package day0623;

public class ArrInt_06 {

	public static void main(String[] args) {
		// 선언하면서 초기값들을 동시에 저장할 수 있다
		
		int [] arr= {5,6,7,8,9,10,20,30,40};
		
		//System.out.println("개수 : "+arr.length);
		
		System.out.println("출력 1 ex) 1==> 5");
		for(int i=0;i<arr.length;i++) {
			System.out.println((i+1)+" ==> "+arr[i]);
		}
		
		System.out.println();
		System.out.println("출력_2");
		
		for(int a1:arr) {
			System.out.println(a1);
		}
		

	}

}
