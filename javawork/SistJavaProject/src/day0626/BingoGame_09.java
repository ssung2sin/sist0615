package day0626;

import java.util.Scanner;

public class BingoGame_09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int pz[][] = new int [3][3];
		
		int bingo;
		
		while(true) {
			System.out.println("***같은 숫자 나오면 빙고!!(q 입력시 종료)***");
			bingo=0;
			//3행열안에 1~3까지의 난수발생
			for(int i=0;i<pz.length;i++) {
				
				for(int j=0;j<pz[i].length;j++) {
					pz[i][j]=(int)(Math.random()*3)+1;
				}
			}
			for(int i=0;i<pz.length;i++) {
				
				for(int j=0;j<pz[i].length;j++) {
					System.out.printf("%4d",pz[i][j]);
				}
				System.out.println();
			}
			
			//행열 빙고
			for(int i=0;i<pz.length;i++) {
				if(pz[i][0]==pz[i][1]&&pz[i][1]==pz[i][2]){
					bingo++;
				}
				if(pz[0][i]==pz[1][i]&&pz[1][i]==pz[2][i]) {
					bingo++;
				}
			}
			
			//대각선 빙고
			if(pz[0][0]==pz[1][1]&&pz[1][1]==pz[2][2]) {
				bingo++;
			}
			if(pz[0][2]==pz[1][1]&&pz[1][1]==pz[2][0]) {
				bingo++;
			}
			if(bingo==0) {
				System.out.println("\t꽝!");
			}
			else {
			System.out.println("\t"+bingo+"빙고!\n");
			}
			//게임종료
			System.out.println("엔터 누르면 다음 난수가 나옵니다.(q누르면 종료)");
			String ans = sc.nextLine();
			if(ans.equalsIgnoreCase("q")) {
				System.out.println("종료합니다.");
				break;
			}
		}
				
	
	}

}
