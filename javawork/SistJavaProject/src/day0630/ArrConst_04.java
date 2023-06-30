package day0630;

//추상 클래스!!
abstract class Game{
	
	abstract void play();
	abstract void stop();
}
////////////////////////
class SungHyeon extends Game{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("성현이가 게임을 합니다");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("성현이가 게임을 종료합니다");
	}
	
	
}
//////////////////////////
class SoonYeong extends Game{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("순영이가 게임을 합니다");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("순영이가 게임을 종료합니다");
	}
	
}
/////////////////
class Sunbum extends Game{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("선범이가 게임을 합니다");
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		System.out.println("선범이가 게임을 종료합니다");
	}
	
}

/////////////////////////////////////////
/*
 * 성현이가 게임을 합니다
 * 순영이가 게임을 합니다
 * 선범이가 게임을 합니다
 * ------------------
 * 선범이가 게임을 종료합니다
 * 순영이가 게임을 종료합니다
 * 성현이가 게임을 종료합니다
 */
public class ArrConst_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Game [] game=new Game[3];
		//이 방법이 다형성
		Game a[]=new Game[3];
		a[0]=new SungHyeon();
		a[1]=new SoonYeong();
		a[2]=new Sunbum();
	
		
		
		for(int i=0;i<a.length;i++) {
			a[i].play();
		}
		System.out.println("----------------------------");
		for(int i=a.length-1;i>=0;i--) {
			a[i].stop();
		}

	}

}
