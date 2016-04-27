package cn.wdu.qdu.game;

public abstract class Player {
	private String playName;
	private int winningTimes;
	
	public void Player(String name){
		playName=name;
	}
	//Êä³öÃû×Ö
	public abstract void  inputName();
	//³öÈ­
	public abstract int myFist();

}
