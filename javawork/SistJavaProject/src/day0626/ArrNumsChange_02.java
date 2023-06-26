package day0626;

public class ArrNumsChange_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {12,5,7,95,24,64,2,76,32,61};
		
		System.out.println("원래 데이터");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		for(int i=0;i<arr.length/2;i++) {
			int tmp = arr[arr.length-(i+1)];
			arr[arr.length-(i+1)]=arr[i];
			arr[i]=tmp;
		}
		
		System.out.println("바뀐 데이터");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
			
		}
		
		//selection sort(오름차순 정렬)
		//Arrays.sort(arr):배열 arr을 정렬한다.
		//선택정렬: 가장 작은 숫자를 앞으로 보내자.
		
		//기준제이터는 0부터 끝에서 두번째 까지
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i]= arr[j];
					arr[j]=tmp;
				}
			}
		}
		
		System.out.println("선택정렬 오름차순");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
			
		}

	}

}
