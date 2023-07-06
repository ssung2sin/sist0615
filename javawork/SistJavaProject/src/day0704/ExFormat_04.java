package day0704;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExFormat_04 {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		//날짜 시간을 원하는 양식에 맞게 출력
		//HH: 24시간 MM:월 dd:일
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf1.format(date));
		
		//a: 오전/오후 hh:12시간
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		System.out.println(sdf2.format(date));
		
		//EEE:요일짧게 EEEE:요일길게
		SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd HH:mm EEE");
		System.out.println(sdf3.format(date));
		
		SimpleDateFormat sdf4=new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
		System.out.println(sdf4.format(date));
		
		//숫자,돈 컴마등등
		int money=6785420;
		double num=67.451231;
		
		NumberFormat nf1=NumberFormat.getCurrencyInstance(); //화폐단위 컴마제공
		System.out.println(nf1.format(money));
		
		NumberFormat nf2=NumberFormat.getInstance(); //컴마제공
		System.out.println(nf2.format(num));
		System.out.println(nf2.format(money));
		
	}
}
