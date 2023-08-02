package baekjoon;

import java.util.Scanner;

public class Baek1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int tmp1,tmp2,tmp3,result=0,cnt=0;
		result=x;
		while(true) {
			if(result<10) {
				tmp1=result;
				tmp2=result%10;
				result=Integer.parseInt(tmp1+""+tmp2);
				cnt++;
				if(result==x) {
					break;
				}
			}
			else {
				tmp1=result/10;
				tmp2=result%10;
				tmp3=(tmp1+tmp2)%10;
				result=Integer.parseInt(tmp2+""+tmp3);
				cnt++;
				if(result==x) {
					break;
				}
			}
		}
		System.out.println(cnt);
	}

}
