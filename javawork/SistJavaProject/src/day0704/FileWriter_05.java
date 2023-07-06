package day0704;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileWriter_05 {
	
	public static void fileWrite() { //스태틱이 아니면 같은 파일 안이여도 바로 호출이 안됨
		
		FileWriter fw=null; //클래스에서는 생성해도 초기값 지정하지 않아도 되지만, 메서드에서는 무조건 지정해둬야함.
		String fileName = "C:\\Sist0615\\file\\filetest1.txt";
		
		try {
			fw=new FileWriter(fileName); //파일 새로 생성(같은 이름이 있어도 새로 생성)
			
			//파일에 내용 추가
			fw.write("Have a nice day!!!\n"); //메모장 줄넘김
			fw.write(new Date().toString()); //데이트를 스트링 형식으로
			System.out.println("***파일 저장 성공!!***");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void fileWrite2() {
		
		FileWriter fw=null;
		String fileName = "C:\\Sist0615\\file\\fileTest2.txt";
		
		try {
			fw=new FileWriter(fileName,true);//추가모드로 바뀜
			
			fw.write("내이름은 홍길동\n");
			fw.write("=====================\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fileWrite();
		fileWrite2();

		
	}

}
