package day0629;

public class FoodDeliveryMain_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food_10 food1 = new Food_10();
		food1.order();
		food1.delivery();
		System.out.println();
		
		Food_10 food2=new Food_10();
		food2.order();
		food2.delivery();
		System.out.println();
		
		FoodShop_10 f1;
		f1=new Food_10();
		f1.delivery();

	}

}
