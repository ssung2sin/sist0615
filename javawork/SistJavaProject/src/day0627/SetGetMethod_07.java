package day0627;

class Student{
	
	private String name; //null
	private int age; //0
	
	//setter_method
	//인스턴스변수에 저장된 데이터를 수정할 목적(set변수명)
	//저장수정용도이므로 리턴값(결과값)이 없다(void)
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge (int age) {
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//getter_method
	//인스턴스변수에 저장된 데이터를 조회할 목적(get변수명)
	//데이터를 얻는 목적이므로 호출데이터를 넘겨줄필요가 없으므로 인자값(파라메터값)이 없다.
	//실행결과를 돌려주므로 "return 결과값" 으로 지정
	
}

/////////////////////////////////////
public class SetGetMethod_07 {

	public static void main(String[] args) {
		// 1.객체생성
		Student stu1 = new Student();
		
		// 2.참조변수명으로 set 메서드 호출
		stu1.setName("이성신");
		stu1.setAge(28);
		
		// 3.get메서드를 통한 값을 얻기
		String name=stu1.getName();
		int age=stu1.getAge();
		
		// 4.출력
		
		System.out.println(name+" "+age);
		/*System.out.println("내 이름은 "+stu1.getName());
		System.out.println("내 나이는 "+stu1.getAge());*/
		
		Student stu2 = new Student();
		
		stu2.setName("이지은");
		stu2.setAge(31);
		
		String name1 = stu2.getName();
		int age1 = stu2.getAge();
		
		System.out.println(name1+" "+age1);

	}

}
