package day0703;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileBuffer_05 {
	
	public static void read() {
		String fileName="C:\\Sist0615\\file\\memo.txt";
		FileReader fr=null;
		BufferedReader br=null;
		
		try {
			fr=new FileReader(fileName);
			
			System.out.println("파일을 열었어요.");
			br=new BufferedReader(fr);
			
			while(true) {
				String s = br.readLine();
				if(s==null) {
					break;
				}
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			
		}finally {
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
	}

}
