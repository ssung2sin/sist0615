package day0704;

public class Board {
	
	private String writer;
	private String subject;
	private String content;
	
	public Board(){
		
	}
	
	public Board(String w,String s,String c) {
		this.writer=w;
		this.subject=s;
		this.content=c;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	

}
