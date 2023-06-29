package day0629;

import java.util.Scanner;

class MyTv{
	
	private String ch; //채널
	private String vol; //볼륨
	
	public static void title() {
		System.out.println("**tv시청목록**");
		
	}

	public String getCh() {
		return ch;
	}

	public void setCh(String ch) {
		this.ch = ch;
	}

	public String getVol() {
		return vol;
	}

	public void setVol(String vol) {
		this.vol = vol;
	}
	
	public static void outputTv(MyTv[] my) {
		for(int i=0;i<my.length;i++) {
				System.out.println(my[i].getCh()+"을(를) 시청합니다.");
				System.out.println("볼륨은 "+my[i].getVol()+"데시벨 입니다.");
				if(i<my.length-1) {
					System.out.println("-------------------------");
				}
		}
	}
	
}
////////////////////////////////////////////////////////
public class ReviewObject_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		String name;
		System.out.print("입력하실 tv시청목록의 수 : ");
		i=Integer.parseInt(sc.nextLine());
		MyTv [] my1 = new  MyTv [i];
		
		for(int i1 =0; i1< my1.length;i1++) {
			my1[i1]=new MyTv();
			System.out.print("입력하실 채널 : ");
			my1[i1].setCh(sc.nextLine());
			System.out.print("입력하실 볼륨 : ");
			my1[i1].setVol(sc.nextLine());
		}
		MyTv.outputTv(my1);
		
		//선생님 풀이
		
		MyTv tv=new MyTv();
		
		tv.setCh("ebs");
		tv.setVol("15");
		String c=tv.getCh();
		String v=tv.getVol();
		System.out.println(c+"채널을 시청합니다.");
		System.out.println("볼륨은 "+v+"데시벨 입니다.");
		System.out.println("-----------------------");

	}

}
