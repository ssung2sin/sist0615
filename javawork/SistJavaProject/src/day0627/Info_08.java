package day0627;

public class Info_08 {
	
	String stuName;
	int age;
	String addr;
	
	//생성자
	
	//생성자
	public Info_08(String name,int age,String addr) {
		stuName = name;
		this.age=age;
		this.addr=addr;
		
	}
	public Info_08() {
		// TODO Auto-generated constructor stub
	}

	//getter method
	public String getStuName() {
		return stuName;
	}
	public int getAge() {
		return age;
	}
	public String getAddr() {
		return addr;
	}
}
