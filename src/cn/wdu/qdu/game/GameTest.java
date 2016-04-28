package cn.wdu.qdu.game;

public class GameTest {
	
	public static void main(String[] args) {
		Computer computer=new Computer("");
		Person person=new Person("");
		Judger judger=new Judger();                   
		
		judger.startGame();
		judger.askName(computer, person);
		while(true){
			String yn=judger.playGame(computer, person);
			
			if(yn.equals("n")){
				judger.finalResult(computer, person);
				break;
			}

		}
		
	}

}
