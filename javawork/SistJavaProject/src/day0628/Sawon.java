package day0628;
/*
 이름   급여    가족수    초과시간 : 입력
 
 이름   급여    가족수    초과시간    가족수당    시간수당   총급여   : 최종 출력
 */

public class Sawon {
	
	private String sawonName;
	private int pay;
	private int famsu;
	private int timesu;
	
	public String getSawonName() {
		return sawonName;
	}
	public void setSawonName(String sawonName) {
		this.sawonName = sawonName;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getFamsu() {
		return famsu;
	}
	public void setFamsu(int famsu) {
		this.famsu = famsu;
	}
	public int getTimesu() {
		return timesu;
	}
	public void setTimesu(int timesu) {
		this.timesu = timesu;
	}
	
	//가족수당 ..가족당 5만원(4명이 넘더라도 최대 20만원)
	public int getFamilySudang() {
		int n=0;
		
		if(famsu>=4) {
			n=200000;
		}
		else
			n=famsu*50000;
		
		return n;
	}
	//시간외수당... 시간당 30000원(10시간 이상이더라도 최대 30만원)
	public int getTimeSudang() {
		int n=0;
		
		if(timesu>=10) {
			n=300000;
		}
		else
			n=30000*timesu;
		
		return n;
	}
	
	//총급여
	public int getTotalPay() {
			int s=pay+getFamilySudang()+getTimeSudang();
			
			return s;
	}
	
	//제목
	public static void getTitle() {
		System.out.println("***우리회사 직원 급여현황***");
		System.out.println();
		System.out.println("사원명\t급여\t가족수\t초과시간\t가족수당\t시간외수당\t총급여");
		System.out.println("=====================================================");
	}
	
}
