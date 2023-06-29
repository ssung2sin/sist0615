package day0628;

public class MethodOb_13 {
	
	public static void hello(int age,double height) {
		System.out.println("안냥");
		System.out.println("제 나이는 "+age+"세 입니다.\n저의 키는 "+height+"cm입니다.");
	}

	public static void main(String[] args) {
		
		System.out.println("메서드 연습시작!!");
		hello(33, 173.8);
		goodbye();
		System.out.println("메서드연습 끝~");

	}
	
	public static void goodbye() {
		System.out.println("담에봬요~~");
		
	}

}
