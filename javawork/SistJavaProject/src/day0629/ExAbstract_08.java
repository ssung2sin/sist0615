package day0629;

/*
 * 추상클래스는 new로 생성못함
 * 추상메서드가 아니라 하나라도 존재하는 클래스를 추상클래스 라고 한다.
 * 추상클래스-일반메서드,추상메서드 둘다 존재가능
 */
abstract class Fruit{
	
	static final String MESSAGE="오늘은 비많이 오는날";
	
	//일반메서드
	public void getTitle() {
		System.out.println("우리는 추상클래스 공부중");
	}
	
	//추상메서드(미완의 메서드..선언문만 있고 구현부인 몸통이 없다.
	abstract public void showMessage(); //추상메서드 만들시 abstract 써야함 그리고 클래스앞에도 abstract 추가
	//오버라이딩 목적!!
}

class Apple extends Fruit{

	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("Apple_Message");
		System.out.println(Fruit.MESSAGE);
	}
	
	

}

class Banana extends Fruit{

	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("Banana_Message");
		
	}

	
}

class Orange extends Fruit{

	@Override
	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("Orange_Message");
		
	}
	
	
}

//////////////////////////////////////
public class ExAbstract_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//일반적인 생성_메서드 호출
		Apple ap1=new Apple();
		ap1.showMessage();
		Banana ba1=new Banana();
		ba1.showMessage();
		Orange or1=new Orange();
		or1.showMessage();
		
		//다형성
		//다형성은 하나의 변수로 여러가지 일을 처리할때 이용
		//부모클래스명 변수명=new 자식클래스명();
		Fruit fruit;
		fruit=new Apple();
		fruit.showMessage();
		
		fruit=new Banana();
		fruit.showMessage();
		
		fruit=new Orange();
		fruit.showMessage();
		fruit.getTitle();
		

	}

}
