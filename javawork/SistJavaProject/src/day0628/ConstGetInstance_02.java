package day0628;


//getInstance의 예시

class Test{
	
	public Test() {
		System.out.println("디폴트 생성자");
	}
	
	//생성자 대신 인스턴스를 반환해주는 메서드를 만드는것 ex)calendar
	public static Test getInstance() {
		return new Test();
	}
	
	//일반 메서드
	public void writhMessage() {
		System.out.println("안녕안녕 나는 지수야");
	}
	
}

public class ConstGetInstance_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test();
		t1.writhMessage();
		///////////////////////////////
		Test t2=Test.getInstance();
		t2.writhMessage();

	}

}
