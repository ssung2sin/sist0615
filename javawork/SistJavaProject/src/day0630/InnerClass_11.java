package day0630;

//내부 클래스 - 틍정클래스 내에 또다른 클래스가 정의됨
//하나의 멤버처럼 사용가능(외부의 모든멤버들을 자신의 멤버처럼 사용가능)
//상속이 하나의 단점을 어느정도 보완해줌

class OuterObj{
	
	class InnerObj{
		
		public void write() {
			System.out.println("내부클래스의 메소드");
		}
	}
	public void showMsg() {
		System.out.println("외부클래스의 메소드");
		System.out.println("외부클래스에서 내부클래스 메서드 호출");
		
		InnerObj inO = new InnerObj();
		inO.write();
	}
}
public class InnerClass_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterObj outO = new OuterObj();
		outO.showMsg();
		System.out.println();
		//내부클래스의 메서드 선언..외부통해서만 가능
		//방법1
		System.out.print("방법 1 ");
		OuterObj.InnerObj obj=new OuterObj().new InnerObj();
		obj.write();
		//방법2
		System.out.print("방법 2 ");
		OuterObj.InnerObj obj1=outO.new InnerObj();
		obj1.write();

	}

}
