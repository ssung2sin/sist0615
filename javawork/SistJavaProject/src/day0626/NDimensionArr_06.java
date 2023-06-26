package day0626;

public class NDimensionArr_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr;
		arr=new int[2][3];//2행 3열 할당(row column)
		
		//초기값
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=5;
		arr[1][1]=10;
		arr[1][2]=20;
		
		System.out.println("행의 갯수 : "+arr.length);
		
		//열의갯수
		System.out.println("0행의 열 갯수: "+arr[0].length);
		System.out.println("1행의 열 갯수: "+arr[1].length);
		
		System.out.println("***데이터 출력***");
		
		for(int i =0;i<arr.length;i++) { //행
			
			for(int j=0;j<arr[i].length;j++) { //열
				//System.out.print(arr[i][j]+"\t");
				System.out.printf("(%d,%d)=%2d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
		
		arr[0][1]=100;
		arr[1][0]=200;
		arr[1][2]=300;
		
		System.out.println("**변경 후 다시 출력**");
for(int i =0;i<arr.length;i++) { //행
			
			for(int j=0;j<arr[i].length;j++) { //열
				//System.out.print(arr[i][j]+"\t");
				System.out.printf("(%d,%d)=%2d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
	}

}
