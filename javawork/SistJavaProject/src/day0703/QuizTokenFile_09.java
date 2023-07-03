package day0703;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class QuizTokenFile_09 {
	
	public static void fruitRead() {
		String fileName ="C:\\Sist0615\\file\\fruit.txt";
		FileReader fr=null;
		BufferedReader br=null;
			try {
				fr=new FileReader(fileName);
				br=new BufferedReader(fr);
				
				System.out.println("***과일목록***");
				System.out.println("상품\t수량\t단가\t총금액");
				System.out.println("---------------------------");
				
				while(true) {
					String s =br.readLine();
					String price = null;
					String su = null;
					
					if(s==null) {
						break;
					}
					
					StringTokenizer st=new StringTokenizer(s,",");
					//배열개수만큼 반복 출력 (이렇게 출력해도 됨)
					String sang=st.nextToken();
					int su1=Integer.parseInt(st.nextToken());
					int dan=Integer.parseInt(st.nextToken());
					
					System.out.println(sang+"\t"+su1+"개\t"+dan+"원\t"+su1*dan+"원\t");
					
					/*System.out.println(st.nextToken()+"\t"+(su=st.nextToken())+"\t"+(price=st.nextToken())+"\t"
					+(Integer.parseInt(price)*Integer.parseInt(su))+"원");*/
					
					
					/*String data[] = s.split(",");
					System.out.println(data[0]+"\t"+data[1]+"\t"+data[2]+"\t"
					+(Integer.parseInt(data[1])*Integer.parseInt(data[2]))+"원");*/
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				
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
		/*
		 ***과일목록***
		 상품   수량   단가   총금액
		 ---------------------------
		 바나나 10    5000  50000원
		 */
		fruitRead();

	}

}
