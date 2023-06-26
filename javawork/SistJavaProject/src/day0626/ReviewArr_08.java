package day0626;

public class ReviewArr_08 {

	public static void main(String[] args) {
		// 해당 배열을 for문을 이용하여출력
		//1.ex>0번지: 영환이
		String[] names= {"영환이","쑤환이","동환이","성환이"};
		for(int i=0;i<names.length;i++) {
			System.out.printf("%d번지: %s\n",i,names[i]);
		}
		System.out.println();
		
		//2.해당배열을 가로로 출력
		int [] nums= {2,4,5,7,8};
		for(int i=0;i<nums.length;i++) {
			System.out.printf("%d번지: %d\t",i,nums[i]);
		}
		
		
		//flowers
		String[][] flowers = {
				{"장미","벚꽃",},
				{"코스모스","매화","아카시아"}
				};

		System.out.println();
		for(int i=0;i<flowers.length;i++) {
			for(int j=0;j<flowers[i].length;j++) {
				System.out.printf("%s\t",flowers[i][j]);
			}
		
			System.out.println();
		}
		
		
	}

}
