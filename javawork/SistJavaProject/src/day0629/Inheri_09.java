package day0629;

class Work{
	
	public void process() {
		System.out.println("작업중!!!");
	}
	
	
}
///////////////////////////
class Food extends Work{
	
	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("***음식을 합니다***");
	}
	
}

////////////////////////////////
class Clean extends Work{
	
	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("***청소를 합니다***");
	}
}

//////////////////////////////////////
class Study extends Work{
	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("***공부를 합니다***");
	}
}

//////////////////////////////////////
public class Inheri_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//일반적인 생성
		Food wo1=new Food();
		wo1.process();
		Clean wo2=new Clean();
		wo2.process();
		Study wo3=new Study();
		wo3.process();
		
		System.out.println("-----------------------------\n다형성출력");
		
		Work work=null;
		work=new Food();
		work.process();
		
		work=new Clean();
		work.process();
		
		work=new Study();
		work.process();

	}

}
