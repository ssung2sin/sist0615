package day0704;
/*
 * 1.상품입고 2.상품재고 9.종료
 * 1
 * 상품명? 바나나
 * 수량? 10
 * 가격? 1000
 * 2
 * 번호		상품명	수량		가격		총가격
 * 1
 */

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class ShopMain_03 {
	
	List<Shop> list = new Vector<Shop>();
	
	public void inputShop() {
		Scanner sc= new Scanner(System.in);
		String name;
		int num,price;
		System.out.print("상품명? ");
		name=sc.nextLine();
		System.out.print("수량? ");
		num=Integer.parseInt(sc.nextLine());
		System.out.print("가격? ");
		price=Integer.parseInt(sc.nextLine());
		
		Shop shop= new Shop(name, num, price);
		
		list.add(shop);
		System.out.println("데이터 입력개수 : "+list.size());
		
	}
	
	public void outputShop() {
		System.out.println("번호\t|상품명\t|수량\t|가격\t|총가격");
		System.out.println("-----------------------------------------");
		
		for(int i=0;i<list.size();i++) {
			Shop s=list.get(i);
			System.out.println((i+1)+"\t|"+s.getSangName()+"\t|"+s.getSu()+"개\t|"+s.getDan()
			+"원\t|"+s.getDan()*s.getSu()+"원");
			if(i<list.size()-1) {
				System.out.println("-----------------------------------------");
			}
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShopMain_03 sm =new ShopMain_03();
		Scanner sc = new Scanner(System.in);
		int i;
		
		while(true) {
			System.out.println("1.상품입고\t2.상품재고\t9.종료");
			i=Integer.parseInt(sc.nextLine());
			
			if(i==1) {
				sm.inputShop();
			}
			else if(i==2) {
				sm.outputShop();
			}
			else if(i==9) {
				System.out.println("종료합니다.");
				break;
			}
			else {
				System.out.println("잘못 입력했습니다.");
			}
		}
		
		

	}

}
