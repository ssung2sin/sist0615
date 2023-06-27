package day0627;

class ObTestA{
	
	private int x=0;
	private static int y=0;
	
	//x
	public void setX(int xx) {
		//this.x=xx; 이름이 동일할 경우 this 붙이기
		x+=xx; //이름이 다를때는 this 생략 가능
	}
	
	//x
	public void getX() {
		System.out.println("x="+x);
	}
	
	public static void setY(int yy) {
		//this.y=yy; static변수는 this를 가지고 있지 않다.
		//일반멤버변수 호출못함.. static변수만 호출가능
		ObTestA.y+=yy; //ObTestA 생략가능 why? 같은 클래스니까!
	}
	
	//x
	public static void getY() {
		System.out.println("y="+ObTestA.y);
	}
}
public class ExObTest_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//x는 생성...private 붙이는 순간 에러... 메서드로 접근해야
		/*ObTestA oa1 = new ObTestA();
		System.out.println(oa1.x);
		System.out.println(ObTestA.y);*/
		//y는 클래스 명으로 호출
		
		//private 변수이므로 메서드 만들어서 호출 가능..변수에 직접 접근 불가능
		ObTestA oa1 = new ObTestA();
		oa1.setX(7);
		oa1.getX();
		
		ObTestA oa2 = new ObTestA();
		
		oa2.setX(200);
		oa2.getX();
		
		ObTestA.setY(7);
		ObTestA.getY();
		
		ObTestA.setY(200);
		ObTestA.getY();

	}

}
