package day0628;

class Score{
	
	private String stuName;
	private int java;
	private int oracle;
	private int html;
	
	static final String TITLE="중간고사 시험결과";

	//자동 setter, getter
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}
	
	//합계메서드
	public int getTot() {
		int tot=java+oracle+html;
		return tot;
	}
	
	//평균메서드
	public double getAvg() {
		double avg = getTot()/3.0;
		return avg;
	}
	
}

public class ExObject_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Score sc1=new Score();
		sc1.setStuName("김지윤");
		sc1.setJava(99);
		sc1.setOracle(88);
		sc1.setHtml(56);
		System.out.println("***"+Score.TITLE+"***\n");
		System.out.println("학생명: "+sc1.getStuName());
		System.out.println("자바점수: "+sc1.getJava());
		System.out.println("오라클점수: "+sc1.getOracle());
		System.out.println("HTML점수: "+sc1.getHtml());
		System.out.println("합계: "+sc1.getTot());
		System.out.printf("평균: %.2f\n",sc1.getAvg());
		System.out.println("=========================");
		
		Score sc2=new Score();
		sc2.setStuName("김동현");
		sc2.setJava(79);
		sc2.setOracle(68);
		sc2.setHtml(76);
		System.out.println("학생명: "+sc2.getStuName());
		System.out.println("자바점수: "+sc2.getJava());
		System.out.println("오라클점수: "+sc2.getOracle());
		System.out.println("HTML점수: "+sc2.getHtml());
		System.out.println("합계: "+sc2.getTot());
		System.out.printf("평균: %.2f\n",sc2.getAvg());
		
		}

}
