package day0703;

import java.util.List;
import java.util.Vector;

//가장많이 사용하는 인터페이스 List
//List인터페이스를 구현한 Vector,ArrayList
//순차적으로 데이터 들어감, 중복데이타 허용
//처음 생성시 일정한 개수로 생성, 그 이상의 데이터를 넣으면 공간이 자동 증가
public class List_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<String> list=new Vector<String>(); 둘다가능
		Vector<String> list=new Vector<String>();
		
		list.add("사과");
		list.add("포도");
		list.add("키위");
		list.add("사과");
		list.add("오렌지");
		list.add("바나나");
		list.add("딸기");
		
		System.out.println("초기할당크기: "+list.capacity());
		System.out.println("초기 데이터 크기: "+list.size());
		
		System.out.println("출력#1");
		
		for(int i=0;i<list.size();i++) {
			String s=list.get(i);
			System.out.println(s);
		}
		System.out.println("출력#2");
		
		for(String i1:list) {
		System.out.println(i1);
		}
		System.out.println("출력#3");
		
		Object [] ob=list.toArray();
		for(int i=0;i<list.size();i++) {
			//Object s=ob[i];
			String s=(String)ob[i];
			System.out.println(s);
		}

		

	}

}
