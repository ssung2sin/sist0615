package day0704;

import java.util.ArrayList;

public class ArrayList_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] flowers= {"장미","프리지아","튤립","개나리","수국"};
		
		ArrayList<String> list=new ArrayList<String>();
		
		for(String f:flowers) {
			list.add(f); // 삽입
		}
		System.out.println("size: "+list.size());
		
		System.out.println("#출력1_for~each");
		
		for(String f1:list) {
			System.out.println(f1);
		}
		System.out.println("#출력2_for");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(i+": "+list.get(i));
		}

	}

}
