package day0627;

public class Quiz_10 {
	
	//멤버변수 선언
	private String sangpum;//상품명
	int su; //수량
	int dan; //단가
	static String SHOPNAME;
	
	public static void setShop(String shopname) {
		Quiz_10.SHOPNAME=shopname;
	}
	public static String getShop() {
		return SHOPNAME;
	}
	public void setSu(int num) {
		su=num;
	}
	public int getSu() {
		return su;
	}
	public void setDan(int price) {
		dan=price;
	}
	public int getDan() {
		return dan;
	}
	public void setSang(String name) {
		sangpum=name;
	}
	public String getSang() {
		return sangpum;
	}

}
