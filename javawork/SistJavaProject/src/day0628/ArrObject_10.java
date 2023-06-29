package day0628;

class MyPersonInfo{
	
	private String name;
	private String bloodType;
	private String age;
	
	public MyPersonInfo(String name,String bt, String age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.bloodType=bt;
		this.age=age;
	}
	
	//제목
	public static void title() {
		System.out.println("이름\t|혈액형\t|나이\t");
		System.out.println("----------------------");
	}
	
	//출력문
	public void getInfo() {
		System.out.println(name+"\t|"+bloodType+"형\t|"+age+"세\t");
	}
	
}

///////////////////////
public class ArrObject_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPersonInfo.title();
		MyPersonInfo[] info= {new MyPersonInfo("이성신", "AB", "26"),
				new MyPersonInfo("김준현", "B", "25"),
				new MyPersonInfo("강상현", "O", "26")
		};
		for(int i=0;i<info.length;i++) {
			info[i].getInfo();
		}
		System.out.println("for each문");
		for(MyPersonInfo inf:info) {
			inf.getInfo();
		}
	}

}
