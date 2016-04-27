package cn.wdu.qdu.game;

import java.util.Scanner;

public class Person extends Player{

	Scanner input=new Scanner(System.in);
	public Person(String name) {
		// TODO Auto-generated constructor stub
		super();
	}
	
	
	
	//Êä³öÃû×Ö
		public void  inputName(){
			System.out.println();
		}
		//³öÈ­
		public  int myFist(){
			int num=input.nextInt();
			return num;
		}


}
