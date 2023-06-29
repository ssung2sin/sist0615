package day0628;

class Member{
	
	private String stuName;//학생별
	private String gender;//성별
	private String addr;//주소
	
	static String ban;
	static int cnt=0;//안해줘도 0이다.
	
	//수정용 멤버 메서트
	public void setMembers(String name,String gd,String ad) {
		stuName=name;
		gender=gd;
		addr=ad;
	}
	public void getMembers() {
		cnt++;
		
		System.out.println("***학생"+cnt+"정보***");
		System.out.println("학생명: "+this.stuName);
		System.out.println("소속학급: "+Member.ban);//그냥+ban 해도됨! 같은 클래스 안이기 때문
		System.out.println("성별: "+gender);
		System.out.println("주소: "+this.addr);
	}
	
}
public class ExObject_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1= new Member();
		Member.ban="쌍용 자바 7강의실";
		m1.setMembers("최성현","남자","서울시 강동구");
		m1.getMembers();
		
		Member m2=new Member();
		m2.setMembers("이민규", "남자", "서울시 중랑구");
		m2.getMembers();

	}

}
