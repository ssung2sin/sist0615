package day0629;

import day0629_1.SuperObj;

public class SubObj_03 extends SuperObj{ //extends 다른 클래스를 상속받는것
	String addr;

	public SubObj_03(String name, int age,String addr) {
		super(name, age); //상속 받은게 우선이기 때문에 반드시 첫줄,부모생성자를 호출해줘야함
		this.addr=addr;
		
	}
	
	public void write() {
		System.out.println("이름: "+this.name);//내것이 아니지만, 부모상속자껄 쓸 수 있어서 this 가능
		System.out.println("나이: "+this.age);
		System.out.println("주소: "+this.addr);
		
	}

	
}
