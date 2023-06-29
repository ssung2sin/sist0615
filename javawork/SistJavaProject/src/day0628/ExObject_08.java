package day0628;

class Apple{
	
	private String writer;
	private String subject;
	private static String msg="HappyDay!!";
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public static String getMsg() {
		return msg;
	}
	public static void setMsg(String msg) {
		Apple.msg = msg;
	}
	

	
}

////////////////////////////
public class ExObject_08 {
	
	public static void writeApple(Apple apl) { //따로 디폴트 생성자 값 입력할 필요없이 괄호 안에 입력해 가져올 수 있다.
		System.out.println("***Apple 클래스 출력***");
		
		System.out.println("작성자: "+apl.getWriter());
		System.out.println("제목: "+apl.getSubject());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Apple 클래스의 메세지 출력");
		System.out.println(Apple.getMsg());
		Apple a1=new Apple();
		a1.setWriter("김은희");
		a1.setSubject("악귀 재밌더라구요");
		
		Apple a2=new Apple();
		a2.setWriter("김동수");
		a2.setSubject("초보개발자의하루");
		
		writeApple(a1);
		System.out.println("======================");
		writeApple(a2);

	}

}
