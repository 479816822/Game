package cn.wdu.qdu.game;

public abstract class Player {
	private String playName;
	private int winningTimes;
	
	public void Player(String name){
		playName=name;
	}
	//�������
	public abstract void  inputName();
	//��ȭ
	public abstract int myFist();

}
