package day0626;

public class ArrNDi_07 {

	public static void main(String[] args) {
		// 다차원 배열 선언과 동시에 초기값 지정 후 출력
		
		int [][] arr = {
				{21,36},
				{11,32,41},
				{45,10,20,30}
				};
		
		System.out.println("총행갯수: "+arr.length);
		System.out.println("0번행의 열갯수: "+arr[0].length);
		System.out.println("0번행의 열갯수: "+arr[1].length);
		System.out.println("0번행의 열갯수: "+arr[2].length);
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("(%d,%d)=%2d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}

	}

}
