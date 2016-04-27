package cn.wdu.qdu.game;

public class Computer {

	public Computer(String name) {
		// TODO Auto-generated constructor stub
		super();
	}

	// 输出名字										
	   
	public void inputName(int num){

		if (num == 1) {
			System.out.println("刘备");
		} else if (num == 2) {
			System.out.println("孙权");
		} else
			System.out.println("曹操");
	}

	// 出拳
	public int myFist() {
		int num = ((int) (Math.random() * 10)) % 3 + 1;
		return num;
	}

}
