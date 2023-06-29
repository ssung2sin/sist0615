package day0629;

class Person{
	
	String name;
	String buseo;
	
	public void getPerson() {
		System.out.println("***부모변수***");
		System.out.println("이름: "+this.name);
		System.out.println("부서: "+this.buseo);
	}
	
}

class My extends Person{
	
	int age;
	public My(String name,String buseo,int age) {
		this.name=name;
		this.buseo=buseo;
		this.age=age;
		// TODO Auto-generated constructor stub
	}
	
	public void write() {
		System.out.println("my의 메서드");
	}
	@Override
	public void getPerson() {
		// TODO Auto-generated method stub
		super.getPerson();
		System.out.println("나이: "+age);
	}
	
}


public class InHeri_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My my1= new My("이미나", "교육부", 32);
		
		my1.write();
		my1.getPerson();
	}

}
