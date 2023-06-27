package day0627;

public class Quiz_09 {
	
	private static String MART;
	private String sangName;
	private int price;
	
	public Quiz_09() {
		// TODO Auto-generated constructor stub
	}
	
	public static void setMart(String mart) {
		Quiz_09.MART=mart;
	}
	public static String getMart() {
		return MART;
	}
	public void setName(String name) {
		sangName=name;
	}
	public String getName() {
		return sangName;
	}
	public void setPrice(int coast) {
		price=coast;
	}
	public int getPrice() {
		return price;
	}
	
}
