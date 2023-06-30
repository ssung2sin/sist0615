package day0630;

class Market {
	
	private String sangpum;
	private int su;
	
	public Market() {
		sangpum="딸기";
		su=5;
	}
	
	public Market(String sangpum,int su) {
		this.sangpum=sangpum;
		this.su=su;
	}
	public void getMarket() {
		System.out.println("상품명: "+this.sangpum);
		System.out.println("수량: "+this.su);
	}
	
}
///////////////////////////
class MyMarket extends Market{
	private int price;
	
	public MyMarket() {
		//super();
		price=5000;
		// TODO Auto-generated constructor stub
	}
	
	public MyMarket(String sangpum,int su,int price) {
		super(sangpum,su);
		this.price=price;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void getMarket() {
		// TODO Auto-generated method stub
		super.getMarket();
		System.out.println("단가: "+this.price);
	}
	
}
public class RevviewInheri_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMarket m1=new MyMarket();
		m1.getMarket();
		
		MyMarket m2=new MyMarket("사과", 5, 7000);
		m2.getMarket();

	}

}
