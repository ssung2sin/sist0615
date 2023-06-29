package day0629;

public class Manager_04 extends Employee_04{
	
	String buseo;
	public Manager_04(String name1, int sal1,String bu) {
		super(name1, sal1); //부모생성자 무조건 첫줄
		this.buseo=bu; //초기화
	}

	//하위 클래스에서 부모클래스의 메서드를 수정해서 사용하는것: 오버라이딩
	//1.전제조건: 상속  2.메서드이름 동일 3. 리턴타입도 동일 4.
	@Override
	public String getEmp() { //부모의 메서드를 가져와 오버라이딩을 한다.
		// TODO Auto-generated method stub
		return super.getEmp()+","+buseo;
	}
	
	
}