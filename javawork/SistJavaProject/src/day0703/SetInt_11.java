package day0703;

import java.util.HashSet;

public class SetInt_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set1=new HashSet<Integer>();
		//set과 hashset의 차이는 클래스와 인터페이스 차이
		
		set1.add(11);
		set1.add(4);
		set1.add(13);
		set1.add(25);
		set1.add(4);
		set1.add(3);
		System.out.println("총길이: "+set1.size());
		
		Object [] ob=set1.toArray();
		
		for(int i=0;i<ob.length;i++) {
			System.out.printf("%4d",ob[i]);
		}
		
		
		
		

	}

}
