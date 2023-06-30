package day0630;

import day0630.Outer.Inner;

class Outer{
	
	String name="이민규";
	int age=22;
	
	class Inner{
		
		//내부에서는 외부클래스멤버 사용가능
		public void disp() {
			System.out.println("**Inner 내부클래스**");
			System.out.println("이름 : "+name);
			System.out.println("나이 : "+age);
		}
	}
	
	class Inner2{
		
		public void disp2() {
			System.out.println("**Inner2 내부클래스**");
			System.out.println("이름 : "+name);
			System.out.println("나이 : "+age);
		}
		
	}
	//외부 메서드 추가
	public void write() {
		Inner in1=new Inner();
		in1.disp();
		Inner2 in2=new Inner2();
		in2.disp2();
	}
	
	
}




/////////////////////////////
public class InnerClass_12 {
	
	public static void main(String[] args) {
		Outer out1 = new Outer();
		out1.write();
		System.out.println();
		System.out.println("외부에서 내부 메서드 불러오는방법");
		Outer.Inner outer = new Outer().new Inner();
		outer.disp();
		Outer.Inner2 outer1 = out1.new Inner2();
		outer1.disp2();
		
	}
	
}
