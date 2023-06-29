package day0629;

class Shop{

	String sangpum;
	int su;
	
	public Shop(String sp,int su) {
		this.sangpum=sp;
		this.su=su;
		System.out.println("인자있는 생성자");
	}
	
	public void write() {
		System.out.println("상품명: "+sangpum);
		System.out.println("개수: "+su);
	}
	
	
}
//////////////////////////////////////////
class MyCart extends Shop{
	
	int price;
	public MyCart(String sp, int su,int pri) {
		super(sp, su);
		this.price=pri;
	}
	
	@Override
	public void write() {
		// TODO Auto-generated method stub
		super.write();
		System.out.println("개당 가격: "+price/10000.0+"만원");
		System.out.println("총 가격: "+price*su/10000.0+"원");
	}
	
	
}



////////////////////////////////////////
public class Inhero_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCart my1=new MyCart("벽걸이에어컨", 2, 600000);
		
		my1.write();

	}

}
