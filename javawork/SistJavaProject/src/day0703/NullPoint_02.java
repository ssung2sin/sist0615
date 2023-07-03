package day0703;

import java.sql.Date;


public class NullPoint_02 {
	
	Date date;
	
	public void writeday() {
		
		int y,m,d;
		try {
		y=date.getYear()-1900;
		m=date.getMonth()+1;
		d=date.getDate();
		
		System.out.println(y+"년 "+m+"월 "+d+"일입니다.");
		}catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("객체생성을 안했어요."+e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullPoint_02 np=new NullPoint_02();
		np.writeday();
		System.out.println("정상종료");

	}

}
