package day0703;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set : 데이터의 중복허용 안됨, 순서를 유지하지 않는 집합
 * List : 데이터의 중복허용 됨, 순서유지
 * Map : Key값을 알면 Value값을 구하기 가능
 */
public class ExHashSet_10 {

	public static void main(String[] args) {
		//컬렉션이 복수의 자료형 저장_안정성이 떨어질 수 있으므로 나온것이 제네릭<>
		//(인터페이스 or 클래스(<데이터형> 객체이름=new 클래스명<데이터형>;
		
		Set<String> set1=new HashSet<String>();
		//Set에 String데이터를 담겠다-Set은 인터페이스 이므로 객체생성이 안된다.

		//추가..배열에 비해 가변적
		
		set1.add("사과");
		set1.add("포도");
		set1.add("사과"); //중복 되었으므로 갯수포함 X
		set1.add("딸기");
		set1.add("거봉");
		set1.add("키위");
		
		
		System.out.println("데이터 갯수: "+set1.size());
		
		System.out.println("출력#1_for~each");
		for(String s1:set1) {
			System.out.println(s1);
		}
		System.out.println("출력#2_Iterator");
		
		Iterator<String> iter=set1.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
		System.out.println("출력#3_for");
		
		Object [] ob1=set1.toArray();
		
		for(int i=0;i<ob1.length;i++) {
			System.out.println(ob1[i]);
		}
		
		//모든 데이터 삭제
		set1.clear(); // 데이터 싹 지우기
		
		if(set1.isEmpty()) { //isEmpty는 boolean 이기 때문에 if에 true false 필요없이 !쓰거나 안쓰거나
			System.out.println("Set타입안에 데이터가 없다.");
		}
		else {
			System.out.println("데이터가 있다.");
		}
		
	}

}
