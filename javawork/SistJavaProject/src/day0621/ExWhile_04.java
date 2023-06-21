package day0621;

public class ExWhile_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		
		while(i<10) {
			System.out.println("java"+i);
			i++;
		}
		System.out.println("종료");
		
		i=1;
		
		while(true) {
			System.out.println("java"+i);
			i++;
			if(i==11) {
				break;
			}
		}
		System.out.println("종료");
		
	}

}
