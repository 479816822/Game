package cn.wdu.qdu.game;

import java.util.Scanner;

public class Judger {
 
	private int total;
	Scanner input=new Scanner(System.in);
	public void startGame(){
		System.out.println("*********************");
		System.out.println("*****��ȭ��ʼ*********");
		System.out.println("**********************");
		System.out.println("��ȭ���� 1.����,2.ʯͷ,3.��(�����Ӧ������)");
	}
	public void askName(){
		
		System.out.print("��ѡ��Է���ɫ��(1.����,2.��Ȩ3.�ܲ�)");
		int num=input.nextInt();
		//inputName(num);
		System.out.println("������������֣�");
		String name=input.next();
		//
//		System.out.println(name+"VS"++"��ս");
	}
	public String playGame(){
		while(true){
			String yn=null;
		System.out.print("��ʼ��(y/n) ");
		 yn=input.next();
		if(yn.equals("y"))
			break;
		else
			System.out.println("");
		
		}
		
		System.out.print("���ȭ��( 1.����,2.ʯͷ,3.��(�����Ӧ������))");
		int n=myFist();
		if(n==1){
			System.out.println("���ȭ: ����");
		}else if(n==2){
			System.out.println("���ȭ: ʯͷ");
		}else{
			System.out.println("���ȭ����");
		}
		
		System.out.print(name+"��ȭ��");
		if(n==1){
			System.out.println(" ����");
		}else if(n==2){
			System.out.println(" ʯͷ");
		}else{
			System.out.println("��");
		}
		
		System.out.print("�Ƿ�ʼ��һ�֣�(y/n)");
		String yn=input.next();
		
		return yn;
		
		
	}
	
	public void finalResult(){
		System.out.println(name+"�Ծ�"+name);
		
	}
}
