package cn.wdu.qdu.game;

import java.util.Scanner;

public class Person extends Player{

	Scanner input=new Scanner(System.in);
	public Person(String name) {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
	
	//�������
		public void  inputName(){
			System.out.println();
		}
		//��ȭ
		public  int myFist(){
			int num=input.nextInt();
			return num;
		}


}
