package day0616;

import java.util.Calendar;
//import java.util.Date;

public class CarlendarTest_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Date date=new Date();
		
		//System.out.println("지금은 "+(date.getYear()+1900)+"년"+date.getMonth()+"월");

		Calendar cal=Calendar.getInstance();
		System.out.println("지금은 "+cal.get(cal.YEAR)+"년도입니다.");
		System.out.println("지금은 "+(cal.get(cal.MONTH)+1)+"월입니다.");
		System.out.println("지금은 "+cal.get(cal.DATE)+"일 입니다.");
		System.out.println("지금은 "+cal.get(cal.DAY_OF_MONTH)+"일 입니다.");
		
		System.out.println("시간: "+cal.get(cal.HOUR_OF_DAY)+"시 " +cal.get(cal.MINUTE)+"분 "+cal.get(cal.SECOND)+"초 입니다.");
		
	}

}

