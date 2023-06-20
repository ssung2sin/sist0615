package day0620;

import java.util.Scanner;

import javax.swing.text.html.CSS;

public class StringEqual_07 {

	public static void main(String[] args) {
		// 문자열 비교는 관계연산자 이용x 
		//equals라는 메소드 사용해서 비교
		
		Scanner sc=new Scanner(System.in);
		
		String word;
		System.out.println("영어단어 입력하시오");
		System.out.println("입력에)happy,angel,rose,cat,food");
		word=sc.nextLine();
		
		System.out.println("입력한 문자열: "+word);
		
		if(word.equals("angel"))
			System.out.println("**천사**");
		else if(word.equalsIgnoreCase("happy"))
			System.out.println("**행복하다**");
		else if(word.equals("rose"))
			System.out.println("**장미**");
		else if(word.equals("cat"))
			System.out.println("**고양이**");
		else if(word.equals("food"))
			System.out.println("**음식**");
		else
			System.out.println("한글 단어가 입력되지 않았습니다.");
		

	}

}
