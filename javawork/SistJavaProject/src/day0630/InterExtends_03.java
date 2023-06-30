package day0630;

interface InterAA{
	public void eat();
	public void go();
	
}
/////////////////////////////////////
interface InterBB extends InterAA{
	public void ride();
	
}
////////다중상속 필요x => InterBB는 AA에 상속되었기때문!!
class InterImpl2 implements InterBB{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("배고프니 밥머금");
	}

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("집가고 싶어요");
	}

	@Override
	public void ride() {
		// TODO Auto-generated method stub
		System.out.println("버스타고 집가요");
		
	}
	
	
}

///////////////////////////////////////
public class InterExtends_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3개모두 호출
		InterImpl2 in1 = new InterImpl2();
		in1.eat();
		in1.go();
		in1.ride();
		
		//부모 변수명=new 상속된 클래스명(?)
		InterBB inA=new InterImpl2();
		inA.eat();
		inA.go();
		inA.ride();

	}

}
