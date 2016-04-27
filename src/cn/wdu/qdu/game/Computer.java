package cn.wdu.qdu.game;

import java.util.Scanner;


public class Computer extends Player{

	Scanner input =new Scanner(System.in);

	public Computer(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	

	// 输出名字										
	   
	public void inputName(){
		int num=input.nextInt();

		if (num == 1) {
			setPlayName("刘备");
		} else if (num == 2) {
			setPlayName("孙权");
		} else
			setPlayName("曹操");
	}

	// 出拳
	public int myFist() {
		int num = ((int) (Math.random() * 10)) % 3 + 1;
		return num;
	}

}
