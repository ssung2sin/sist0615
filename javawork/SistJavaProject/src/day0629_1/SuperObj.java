package day0629_1;
/*붐 클래스가 다른 패키지에 있을경우 protected,public 변수는 접근이 가능하다.
 * 같은패키지인 경우에는 private만 빼고 모두 접근이 가능
 * 퍼블릭 프로텍티드 디폴트 프라이빗 순서!*/
public class SuperObj { //부모클래스!
	
	protected String name;
	protected int age;
	String defName; //이런게 디폴트
	
	public SuperObj(String name,int age) {
		this.name=name;
		this.age=age;
	}

}
