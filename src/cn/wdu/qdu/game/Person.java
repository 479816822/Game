package cn.wdu.qdu.game;

import java.util.Scanner;

public class Person extends Player {

	Scanner input = new Scanner(System.in);

	public Person(String name) {
		// TODO Auto-generated constructor stub
		super(name);
}

	// �������
	public void inputName() {
		
		String name=null;
		 name=input.next();
		setPlayName(name);
		System.out.println(name);
	}

	// ��ȭ
	public int myFist() {
		int num = input.nextInt();
		return num;
	}

}
