package day0623;

public class TempNumChange_11 {

	public static void main(String[] args) {
		// 순서 바꾸기
		int tmp;
		int a=10,b=20;
		
		System.out.println("a="+a+", b="+b);
		tmp=a;
		a=b;
		b=tmp;
		System.out.println("a="+a+", b="+b);
		
		int arr1[] = {24,234,54,123,2};
		
		System.out.println("오름차수 정렬");
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length-1;j++) {
				if(arr1[j]>arr1[j+1]) {
					tmp=arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=tmp;			
				}
			}
		}
		
		System.out.println("===============================");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}

	}

}
