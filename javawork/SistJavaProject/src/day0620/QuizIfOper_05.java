package day0620;

import java.util.Scanner;

public class QuizIfOper_05 {

	public static void main(String[] args) {
		/*
		 상품명? 씽크패드 E14
		 수량? 3
		 가격? 550000
		 ===================
		 씽크패드 E14 3개는 총 1650000 원 입니다.
		 3개이상은 10프로 DC가 됩니다.
		 DC된 총 금액: x원		  
		 */ 
		
		Scanner sc = new Scanner(System.in);
		String name;
		int x,price,dcPrice;
		
		System.out.print("상품명? ");
		name=sc.nextLine();
		System.out.print("수량? ");
		x=sc.nextInt();
		System.out.print("가격? ");
		price=sc.nextInt();
		System.out.println("===================");
		System.out.println(name+" "+x+"개는 총 "+(price*x)+"원 입니다.");
		System.out.println("3개 이상은 10프로 DC가 됩니다.");
		if(x>=3)
			dcPrice = (9*price/10);
		else
			dcPrice = price;
		System.out.println("DC된 총금액: "+(dcPrice*x)+"원");
		
		//삼항연산자 출력
		System.out.println("[삼항연산자 출력]");
		dcPrice = x>=3 ? (9*price/10) : price;
		System.out.println("DC된 총금액: "+(dcPrice*x)+"원");
		
	}

}
