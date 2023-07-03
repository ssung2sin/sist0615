package day0703;

import java.io.IOException;
import java.io.InputStream;

public class FileExeption_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream is=System.in;//int밖에 입력아 안됨
		int a=0;
		
		System.out.println("한글자 입력: ");
		try {
			a=is.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("오류: "+e.getMessage());
		}
		System.out.println("***3초 뒤 출력***");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("입력값: "+(char)a);

	}

}
