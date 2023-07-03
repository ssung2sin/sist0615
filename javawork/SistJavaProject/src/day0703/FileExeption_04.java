package day0703;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExeption_04 {
	
	public static void read() {
		String fileName="C:\\Sist0615\\file\\monday.txt"; //역슬래쉬2\\번 슬래쉬 /1번
		BufferedReader br=null;
		FileReader fr=null;
		
		try {
			fr=new FileReader(fileName); //파일리더에는 어떤 파일을 읽을건지 넣고,
			
			System.out.println("파일을 열었어요!");
			br=new BufferedReader(fr); //버퍼리더에는 파일리더 변수를 넣는다!
			
			//여러줄 읽어야 하므로 while문!
			while(true) {
				//메모장에서 내용을 한줄씩 읽어온다.
				String s=br.readLine();
				
				//마지막 줄일경우 null값을 읽어서 null값일 경우 바져나가기
				if(s==null) {
					break;
				}
				
				System.out.println(s);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("파일이 없습니다."+e.getMessage());
		} catch (IOException e) {
			// TODO: handle exception
		}finally {
			//자원은 항상 반대로 반납
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		read();
		System.out.println("**메모 정상종료**");

	}

}
