package day0628;

class MyInfo{
	
	private String name;
	private int age;
	private String hp;
	public static String ADDR="Seoul";
	
	//각각의 setter, getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	//3개의 멤버를 한번에 변경할 메서드
	public void setData(String name,int age, String hp) {
		this.name=name;
		this.age=age;
		this.hp=hp;
	}
	//3개의 멤버를 한번에 출력할 메서드
	public void getData() {
		System.out.println("이름: "+name+", 나이: "+age+", 휴대폰 번호: "+hp);
	}
	
}


public class ExObject_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//생성1
		MyInfo in1=new MyInfo();
		//setter
		in1.setName("이성신");
		in1.setAge(26);
		in1.setHp("01023115322");
		//getter
		String name=in1.getName();
		int age=in1.getAge();
		String hp=in1.getHp();
		//출력
		System.out.println("사는 지역: "+MyInfo.ADDR);
		System.out.println("이름: "+name+", 나이: "+age+", 폰번: "+hp);
		
		//생성2
		MyInfo in2=new MyInfo();
		
		//setData
		in2.setData("이지은", 30, "01012453123");
		in2.getData();
	}

}
