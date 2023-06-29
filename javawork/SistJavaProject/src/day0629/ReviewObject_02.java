package day0629;

class Starbucks{
	
	private String menu; //메뉴
	private String store; //지점
	private String goods; //굿즈 텀블러 등등
	
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
}

public class ReviewObject_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Starbucks sb1 = new Starbucks();
		
		sb1.setStore("코엑스");
		sb1.setMenu("아이스 아메리카노");
		sb1.setGoods("우산");
		
		String store=sb1.getStore();
		String menu=sb1.getMenu();
		String goods=sb1.getGoods();
		
		System.out.println("나는 스타벅스 "+store+"매장에 왔습니다.");
		System.out.println(menu+"를 주문합니다.");
		System.out.println(goods+"를 샀어요.");

	}

}
