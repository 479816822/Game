package cn.wdu.qdu.game;

public class GameTest {
	
	public static void main(String[] args) {
		Computer computer=new Computer("");
		Person person=new Person("люд╥");
		Judger judger=new Judger();
		
		while(true){
			judger.startGame();
			judger.askName(computer, person);
			String yn=judger.playGame(computer, person);
			
			if(yn.equals("n")){
				judger.finalResult(computer, person);
				break;
			}

		}
		
	}

}
