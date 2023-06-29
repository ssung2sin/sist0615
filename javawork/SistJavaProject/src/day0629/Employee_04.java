package day0629;

public class Employee_04 {
	
	String sawonName;
	int salary;
	
	
	 
	public Employee_04(String name,int sal) {
		this.sawonName=name;
		this.salary=sal;
	}
	
	//리턴해주는 메서드
	//추상메서드
	//public String getEmp(); 이게 추상메서드
	public String getEmp() {
		return sawonName+","+salary;
	}

}
