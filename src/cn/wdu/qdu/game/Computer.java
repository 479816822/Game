package cn.wdu.qdu.game;

public class Computer {

	public Computer(String name) {
		// TODO Auto-generated constructor stub
		super();
	}

	// �������										
	   
	public void inputName(int num){

		if (num == 1) {
			System.out.println("����");
		} else if (num == 2) {
			System.out.println("��Ȩ");
		} else
			System.out.println("�ܲ�");
	}

	// ��ȭ
	public int myFist() {
		int num = ((int) (Math.random() * 10)) % 3 + 1;
		return num;
	}

}
