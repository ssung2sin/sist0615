package day0628;

class MyDate{
	
	//인스턴스 변수
	private int year;
	private int month;
	private int day;
	
	//디폴트 생성자 숨어있다.
	public MyDate() {
		// TODO Auto-generated constructor stub
	}
	
	//명시적생성자...3개의 인자갑을 수정가 동시에 생성하는
		public MyDate(int year,int month,int day) {
		// TODO Auto-generated constructor stub
		this.year =year;
		this.month=month;
		this.day=day;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
}


public class AutoSetGet_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체생성
		MyDate date = new MyDate();
		
		date.setYear(2023);
		date.setMonth(6);
		date.setDay(28);
		
		System.out.println("오늘은 "+date.getYear()+"년 "+date.getMonth()+"월 "+date.getDay()+"일");
		
		MyDate date1 = new MyDate(2023, 6, 27);
		System.out.println("어제는 "+date1.getYear()+"년 "+date1.getMonth()+"월 "+date1.getDay()+"일");

	}

}
