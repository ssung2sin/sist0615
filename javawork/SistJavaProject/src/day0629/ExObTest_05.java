package day0629;

class Point{
	int x;
	int y;
	
	//디폴트 생성자
	public Point() {
		System.out.println("Super_디폴트 생성자");
	}
	
	
	//명시적 생성자
	public Point(int x,int y) {
		System.out.println("Super_인자있는(명시적) 생성자");
		this.x=x;
		this.y=y;
	}
	
	//메서드
	public void write() {
		System.out.println("X좌표="+x+", y좌표="+y);
	}
	
}

/////////////////////////////////

class SubPoint extends Point{
	String msg;
	public SubPoint(int x, int y,String msg) {
		super(x, y);
		//Point p1 = new Point(x, y); //=>super하고 비슷한 느낌!
		this.msg=msg;
	}
	
	public SubPoint() {
		//super(); 써도 되고 안써도 되고
		System.out.println("sub_디폴트생성자"); //super 안넣어줘도 생략되어있다!
	}
	@Override
	public void write() {
		// TODO Auto-generated method stub
		super.write();
		System.out.println("메세지: "+msg);
	}

	
	
	
}

///////////////////////////////////
public class ExObTest_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubPoint sp=new SubPoint();
		sp.write();
		
		SubPoint sp1=new SubPoint(3, 4, "좌표설정완료");
		sp1.write();

	}

}
