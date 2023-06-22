package day0622;

public class ExForGugu_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=2;i<=9;i++) {
			System.out.println("["+i+"단]");
			for(int j=1;j<=9;j++) {
				int mul = i*j;
				System.out.println(i+"X"+j+"="+mul);
			}
		}*/
		
		//반복문 앞에 이름을 붙히고 해당이름을 break 처리하면 두개이상의 반복문을 빠져나가는게 가능하다.
		
		gugu: for(int dan=2;dan<=9;dan++) {
			for(int j =1;j<=9;j++) {
				if(j==5) {
					break gugu;
				}
				System.out.println(dan+"X"+j+"="+dan*j);
			}
			System.out.println();
		}
	}

}
