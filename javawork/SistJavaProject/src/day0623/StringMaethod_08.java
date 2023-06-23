package day0623;

public class StringMaethod_08 {

	public static void main(String[] args) {
		
		String str1="Have a Nice Day";
		String str2="    Happy Day    ";
		
		System.out.println("str2의 길이: "+str2.length());
		System.out.println("strdml 앞뒤 공백 제거 후 길이: "+str2.trim().length());
		System.out.println("*"+str2+"*");
		System.out.println("*"+str2.trim()+"*");
		
		//indexof
		System.out.println("str1에서 H의 인덱스: "+str1.indexOf("H")+"번째");
		
		//substring
		System.out.println("str1에서 Nice 출력: "+str1.substring(7, 11));
		
		//replace
		System.out.println("문자열 일부를 변경");
		System.out.println(str1.replace("a", "*"));
		System.out.println(str1.replace("Nice", "Good"));
		
		//숫자를 문자
		String b1=12.5+" ";
		System.out.println(b1);
		
		String b2=100+" ";
		System.out.println(b1+b2);
		
		String b3=String.valueOf(100); //int==>String
		System.out.println(b3+b1);
		
		//문자열 분리하는 method split
		String str3="red,blue,green,purple,skyblue,white";
		System.out.println(str3);
		
		System.out.println(",로 분리하여 출력하기");
		String [] color ;
		
		color = str3.split(",");
		System.out.println("분리된 색상 갯수: "+color.length);
		
		for(String a1:color) {
			System.out.print(a1+" ");
		}
		System.out.println();
		for(int i=0;i<color.length;i++) {
			System.out.print(color[i]+" ");
		}
		
	}

}
