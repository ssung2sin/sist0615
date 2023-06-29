package day0629;

//class가 class를 상속 받을때 : extends
//class가 interface를 상속 받을때 : implements
//interface가 interface를 상속 받을때 : extends
//implements는 다중 구현 가능하다.
public class Food_10 implements FoodShop_10 {

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println(SHOPNAME);
		//SHOPNAME="돈까스집";
		System.out.println("음식을 주문합니다.");
	}

	@Override
	public void delivery() {
		// TODO Auto-generated method stub
		System.out.println(SHOPNAME);
		System.out.println("음식을 배달합니다.");

	}

}
