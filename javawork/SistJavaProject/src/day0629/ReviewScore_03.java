package day0629;

public class ReviewScore_03 {

	private String name;
	private int java;
	private int oracle;
	private static String schoolName;
	
	public static String getSchoolName() {
		return schoolName;
	}
	public static void setSchoolName(String schoolName) {
		ReviewScore_03.schoolName = schoolName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	public static void title() {
		System.out.println("***결과출력***");
		System.out.println("학생명\t|Java\t|Oracle\t|총점\t|평균\t|평가");
		System.out.println("-------------------------------------------------");
	}
	
	public int getTot() {
		int tot = java+oracle;
		return tot;
	}
	
	public double getAvg() {
		double avg = getTot()/2.0;
		return avg;
	}
	
	public String getGrade() {
		if(getAvg()>60) {
			return "합격";
		}
		else
			return "불합격";
	}
}
