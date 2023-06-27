package day0627;

public class Ex2Object_02 {

	//두개의 인스턴스변수, 2개의 static(클래스)변수_4개의 멤버변수
	String kind; //카드의 무늬
	int number; //카드의 숫자
	
	//클래스변수-같은 클래스의 모든 인스턴스들이 공유
	//인스턴스 생성없이 클래스 이름.클래스변수명으로 접근
	//클래스가 로딩이 될때 생성, 종료하면 소멸
	static int width; //카드의 폭
	static int height; //카드의 높이	
}
