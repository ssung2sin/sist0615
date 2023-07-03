package day0703;

import java.util.StringTokenizer;

public class StringToken_07 {

	public static void main(String[] args) {
		// 문자열을 특정문자로 분리하는 방법들
		
		String str="rad,magenta,gray,pink,yellow";
		
		System.out.println("String객체의 split을 이용한 분리");
		String []arrColors=str.split(",");
		System.out.println("arrColors의 길이: "+arrColors.length);
		
		for(int i=0;i<arrColors.length;i++) {
			System.out.println(arrColors[i]);
		}
		
		System.out.println("StringTokenizer객체를 이용한 분리");
		StringTokenizer st=new StringTokenizer(str,",");
		System.out.println("총 토큰 수: "+st.countTokens());
		
		while(st.hasMoreTokens()) {//다음 토큰이 있으면 true, 없으면 false
			System.out.println(st.nextToken());
		}
		

	}

}
