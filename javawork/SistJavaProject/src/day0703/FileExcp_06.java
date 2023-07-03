package day0703;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//score.txt를 읽고 몇개인지 구하고 총점,평균까지 구해서 출력
public class FileExcp_06 {
	
	public static void scoreRead() {
		String fileName = "C:\\Sist0615\\file\\score.txt";
		FileReader fr=null;
		BufferedReader br=null;
		int i,tot=0,cnt=0;
		double avg=0;
		
		try {
			fr = new FileReader(fileName);
			System.out.println("파일 읽어옴!");
			br = new BufferedReader(fr);
			
			while(true) {
				String s=br.readLine();
				if(s==null) {
					break;
				}
				i=Integer.parseInt(s);
				System.out.println(s);

				cnt++;
				tot+=i;	
			}
			avg=(double)tot/cnt;
			System.out.println("총 "+cnt+"개\n총점: "+tot+"\n평균: "+avg);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			
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
		scoreRead();
		

	}

}
