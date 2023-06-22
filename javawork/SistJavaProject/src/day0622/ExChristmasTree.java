package day0622;

public class ExChristmasTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=1;i<=5;i++) {
			for(j=1;j<=(2*i-1);j++) {
				for(k=1;k<=5-i;k++) {
					if(j>=2)
						continue;
					System.out.print(" ");
				}
			System.out.print("*");
			}
		System.out.println();
		}

	}

}
