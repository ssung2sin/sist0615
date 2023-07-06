package day0704;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorBoard_02 {
	
	//Vector<Board> list=new Vector<Board>();
	List<Board> list=new Vector<Board>();
	//클래스 타입으로 지정했으므로 데이터를 꺼내고 받을때도 클래스
	
	//입력
	public void inputBoard() {
		Scanner sc=new Scanner(System.in);
		String writer,subject,content;
		
		System.out.println("작성자명?");
		writer=sc.nextLine();
		System.out.println("제목?");
		subject=sc.nextLine();
		System.out.println("내용?");
		content=sc.nextLine();
		
		//Board data=new Board(writer, subject, content);
		Board data = new Board();
		data.setWriter(writer);
		data.setSubject(subject);
		data.setContent(content);
		list.add(data);
		
		System.out.println("현재 데이터 갯수: "+list.size());
		
	}
	
	//출력
	public void writeBoard() {
		System.out.println("***게시판 출력***");
		System.out.println("====================================");
		for(int i=0;i<list.size();i++) {
			Board b=list.get(i); //리스트내에 지정된 위치에 있는 요소값 돌려준다.
			System.out.println("번호: "+(i+1)+"\n작성자: "+b.getWriter());
			System.out.println("제목: "+b.getSubject());
			System.out.println("내용: "+b.getContent());
			System.out.println("-------------------------------------");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VectorBoard_02 vb = new VectorBoard_02();
		
		Scanner sc=new Scanner(System.in);
		int n;
		while(true) {
			System.out.println("1.추가 2.전체출력 9.종료");
			n=Integer.parseInt(sc.nextLine());
			if(n==1) {
				vb.inputBoard();
			}
			else if(n==2) {
				vb.writeBoard();
			}
			else if(n==9) {
				System.out.println("종료합니다.");
				break;
			}
			else {
				System.out.println("잘못 입력하였습니다.");
			}
		}
		
		

	}

}
