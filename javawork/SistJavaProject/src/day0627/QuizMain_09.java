package day0627;

public class QuizMain_09 {
	
	public static void main(String[] args) {
		
		Quiz_09 sang1 = new Quiz_09();
		Quiz_09 sang2 = new Quiz_09();
		Quiz_09 sang3 = new Quiz_09();
	
		System.out.println("[쇼핑 목록]");
		System.out.println();
		String mart = "이마트";
		Quiz_09.setMart(mart);
		
		
		
		sang1.setName("손선풍기");
		sang1.setPrice(25000);
		sang2.setName("핸드폰충전기");
		sang2.setPrice(30000);
		sang3.setName("이어폰");
		sang3.setPrice(70000);
		
		System.out.println("쇼핑장소: "+Quiz_09.getMart());
		System.out.println("상품명: "+sang1.getName());
		System.out.println("가격: "+sang1.getPrice()+"원");
		
		System.out.println();
		System.out.println("쇼핑장소: "+Quiz_09.getMart());
		System.out.println("상품명: "+sang2.getName());
		System.out.println("가격: "+sang2.getPrice()+"원");
		
		System.out.println();
		System.out.println("쇼핑장소: "+Quiz_09.getMart());
		System.out.println("상품명: "+sang3.getName());
		System.out.println("가격: "+sang3.getPrice()+"원");
	}
	

}
