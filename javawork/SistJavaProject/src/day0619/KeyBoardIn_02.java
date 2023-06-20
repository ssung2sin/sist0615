package day0619;

import java.util.Scanner;

public class KeyBoardIn_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner는 문자열이나 숫자를 모두 키보드로 입력받으려 할때 생성
		Scanner sc=new Scanner(System.in);
		
		//변수
		String name;
		int age;
		String city;
		
		//출력(입력문)
		System.out.print("이름을 입력해 보세여==>");
		name=sc.nextLine();  //한줄을 문자로 읽어온다(공백사용가능)
		
		System.out.print("나이를 입력해 보세요==>");
		//age=sc.nextInt(); //숫자를 읽어온다
		age=Integer.parseInt(sc.nextLine()); //숫자입력과 동시에 라인도 띄어준다
		//숫자입력후 엔터를 누르면 그엔터가 키보드 버퍼로 저장되어서 다음문자열읽을때 먼저읽어버리는 문제발생
		//그래서 다음문자열 읽기전에 sc.nextLine()
		
		
		System.out.print("당신이 사는 지역은?==>");
		city=sc.nextLine();
		
		//최종출력
		System.out.println("내이름은 "+name+"입니다");
		System.out.println("내나이는 "+age+"세입니다");
		System.out.println("내가 사는 지역은 "+city+"입니다");
	}

}
