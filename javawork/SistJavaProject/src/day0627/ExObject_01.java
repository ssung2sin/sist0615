package day0627;

public class ExObject_01 {
	
	String name; //인스턴스 변수.. 일반적인 인스턴스 멤버변수는 객체생성 후 각각 다른 값을 가질 수 있다.
	static final String MESSAGE="Happy Day!!!";
	//static 멤버변수는 주로 상수로 선언할때 사용하며 인스턴스 변수없이 클래스명으로 접근 가능하다.
	//여러 객체가 같은 값을 가져야 할 경우 주로 static으로 선언한다
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("static변수는 new로 생성 없이 호출 가능");
		System.out.println(ExObject_01.MESSAGE); //다른 클래스에서는 이렇게 해야되지만
		System.out.println(MESSAGE); // 같은 클래스는 이렇게 해도 가능!
		//MESSAGE="Nice Day!!!"; //final 붙였기 때문에 상수라 고칠 수 없음 / final 없으면 변경 가능
		
		//클래스명 참조변수명=new 클래스명();
		ExObject_01 ex1 = new ExObject_01(); //생성만 시켜줄 
		System.out.println(ex1.name);
		ex1.name ="또치";
		System.out.println(ex1.name);
		
		ExObject_01 ex2=new ExObject_01();
		System.out.println(ex2.name);
		ex2.name="홍길동";
		System.out.println(ex2.name);
		
		/*ExObject_01 ex3=new ExObject_01();
		System.out.println(ex3.name);
		System.out.println(ex2.name);
		System.out.println(ex1.name);
		ex3.name="고길동";
		System.out.println(ex3.name);*/
		
		System.out.println("다 같이 사용하는 메세지: "+MESSAGE);
	}

}
