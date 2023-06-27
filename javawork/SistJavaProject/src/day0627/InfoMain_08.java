package day0627;

import java.util.Scanner;

public class InfoMain_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Info_08 in1=new Info_08("이성신", 28, "경기도 시흥시");
		
		//getMethod 변수지정
		String name=in1.getStuName();
		int age=in1.getAge();
		String addr=in1.getAddr();
		
		System.out.printf("이름은 %s이고 나이는 %d세 이며 주소는 %s 입니다\n",name,age,addr);
		/*System.out.println("이름 : "+in1.getStuName());
		System.out.println("나이 : "+in1.getAge());
		System.out.println("주소 : "+in1.getAddr());*/
		
		Info_08 in2 = new Info_08("김영",22,"서울시 은평구");
		System.out.println("이름 : "+in2.getStuName());
		System.out.println("나이 : "+in2.getAge());
		System.out.println("주소 : "+in2.getAddr());
		
		String inputName,inputAddr;
		int inputAge;
		
		System.out.print("이름을 입력하시오 : ");
		inputName = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		inputAge = Integer.parseInt(sc.nextLine());
		System.out.print("주소를 입력하세요 : ");
		inputAddr = sc.nextLine();
		
		Info_08 in3 = new Info_08(inputName, inputAge, inputAddr);
		System.out.println("이름 : "+in3.getStuName());
		System.out.println("나이 : "+in3.getAge());
		System.out.println("주소 : "+in3.getAddr());
		
		//디폴트 생성자로 생성
		System.out.println();
		Info_08 in4=new Info_08();
		System.out.println("이름: "+in4.getStuName()+"\n나이: "+in4.getAge()+"\n주소: "+in4.getAddr());
	}

}
