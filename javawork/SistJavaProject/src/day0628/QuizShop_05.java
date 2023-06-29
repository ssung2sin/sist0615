package day0628;

class MyShop{
	
	private String sangpumName;
	private String ipgoday;
	private String chulgoday;
	
	//3개의 데이터를 한번에 수정할 수 있는 메서트
	public void setShop(String sn,String id,String cd) {
		sangpumName=sn;
		ipgoday=id;
		chulgoday=cd;
	}
	
	//3개의 데이터를 한번에 출력할 수 있게 메서드
	/*public void getData() {
		System.out.printf("품명: %s\n입고일: %s\n출고일: %s\n",sangpumName,ipgoday,chulgoday);
	}*/
	public String getData() {
		String s="상품명: "+sangpumName+"\n입고일: "+ipgoday+"\n출고일: "+chulgoday;
		return s;
	}
	
}

public class QuizShop_05 {

	public static void main(String[] args) {
		System.out.println("***상품입고***");
		MyShop my1=new MyShop();
		my1.setShop("키보드", "2023-06-01", "2023-06-20");
		//my1.getData();
		System.out.println(my1.getData());
		System.out.println("------------------------------------");
		MyShop my2=new MyShop();
		my2.setShop("모니터", "2023-06-04", "2023-06-23");
		System.out.println(my2.getData());
		//my2.getData();

	}

}
