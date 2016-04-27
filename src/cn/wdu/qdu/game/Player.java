package cn.wdu.qdu.game;

public abstract class Player {
	private String playName;
	private int winningTimes=0;
	
	
	public Player(String name){
		playName=name;
	}
	//�������
	public abstract void  inputName();
	//��ȭ
	public abstract int myFist();
	
	public String getPlayName() {
		return playName;
	}
	public void setPlayName(String playName) {
		this.playName = playName;
	}
	public int getWinningTimes() {
		return winningTimes;
	}
	public void setWinningTimes(int winningTimes) {
		this.winningTimes = this.winningTimes+winningTimes;
	}

}
