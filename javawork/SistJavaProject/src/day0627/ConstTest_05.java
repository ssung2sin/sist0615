package day0627;

class ConstA{
	
	int num=0;
	
	//디포트 생성자...명시적인 생성자를 만들면 디폴트 생성자는 자동생성되지않는다.
	//필요하면 만들어준다.
	public ConstA() {
		num=10;
		System.out.println("디폴트 생성자");
	}
	
	
	//인자있는 생성자
	public ConstA(int num) {
		// TODO Auto-generated constructor stub
		this.num=num; //나 자신을 가리키는 this! => 인스턴스 밖에 못 붙임
		System.out.println("생성자 호출");
	}
	
	//메서드
	public int getNumber() {

		num=50;
		return num;
	}
}

public class ConstTest_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//디폴트 생성자
		ConstA ca1 = new ConstA(30);
		System.out.println(ca1.num);
		
		//명시적생성자(인자값으로 num을 보낸 생성자)
		ConstA ca2 = new ConstA();
		System.out.println(ca2.num);
		
		//메서드 호출
		ConstA ca3 = new ConstA();
		System.out.println(ca3.getNumber());
		

	}

}
