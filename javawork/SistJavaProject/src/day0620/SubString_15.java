package day0620;

public class SubString_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="나는 쌍용에서 자바를 공부중입니다";
		
		char ch=str.charAt(3);
		String word1=str.substring(8);
		String word2=str.substring(8, 11);
		int i = str.length();
		
		System.out.println(ch);
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(i);

	}

}
