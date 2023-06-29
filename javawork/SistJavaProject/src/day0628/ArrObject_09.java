package day0628;

class Student{
	
	private String sname;
	private String hp;
	private int grade;
	
	//명시적 생성자
	public Student(String StuName, String hp, int grade) {
		this.sname=StuName;
		this.hp=hp;
		this.grade=grade;
	}
	
	//멤버값 출력 데이터
	public void getData() {
		System.out.println("이름: "+sname+"\n연락처: "+hp+"\n학년: "+grade);
	}
}

public class ArrObject_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student [] stu=new Student[3];
		
		stu[0]=new Student("이성신", "010-1234-5678", 3);
		stu[1]=new Student("이민규", "101-2222-3333", 1);
		stu[2]=new Student("임형준", "010-2341-2352", 4);
		
		
		//생성하면서 바로 초기화
		
		Student[] stu1= {new Student("이성신", "010-1234-5678", 3),
				new Student("이민규", "101-2222-3333", 1),
				new Student("임형준", "010-2341-2352", 4)
				
		};
		
		for(int i=0;i<stu.length;i++) {
			stu[i].getData();
			System.out.println("------------------------");
		}
		/*for(Student s1:stu) {
			s1.getData();
			System.out.println("------------------------");
		}*/
		for(int i=0;i<stu1.length;i++) {
			stu[i].getData();
			System.out.println("------------------------");
		}
		
		
	}

}