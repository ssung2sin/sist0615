package day0627;

public class QuizMain_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String shop = "롯데마트";
		Quiz_10.setShop(shop);
		Quiz_10 sang1 = new Quiz_10();
		Quiz_10 sang2 = new Quiz_10();
		Quiz_10 sang3 = new Quiz_10();
		String sang;
		int price,su;
		
		System.out.println("\t**상품입고**");
		System.out.println("---------------------");
		System.out.println("입고된 상점: "+Quiz_10.getShop());
		System.out.println("---------------------");
		sang1.setSang("딸기");
		sang1.setDan(10000);
		sang1.setSu(5);
		System.out.printf("상품명: %s\n가격: %d원\n수량: %d상자\n",sang1.getSang(),sang1.getDan(),sang1.getSu());
		System.out.println("---------------------");
		sang2.setSang("쵸코파이");
		sang2.setDan(5000);
		sang2.setSu(10);
		System.out.printf("상품명: %s\n가격: %d원\n수량: %d상자\n",sang2.getSang(),sang2.getDan(),sang2.getSu());
		System.out.println("---------------------");
		sang3.setSang("요거트");
		sang3.setDan(2500);
		sang3.setSu(100);
		System.out.printf("상품명: %s\n가격: %d원\n수량: %d상자\n",sang3.getSang(),sang3.getDan(),sang3.getSu());
		
		
		
	}

}
