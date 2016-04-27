package cn.wdu.qdu.game;

import java.util.Scanner;

public class Judger {
 
	private int total;
	Scanner input=new Scanner(System.in);
	
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	//��Ϸ��ʼ����������Ϸ�Ĺ���
	public void startGame(){
		System.out.println("*********************");
		System.out.println("*****��ȭ��ʼ*********");
		System.out.println("**********************");
		System.out.println();
		System.out.println("��ȭ���� 1.����,2.ʯͷ,3.��(�����Ӧ������)");
		System.out.println("");
	}
	
	//ȷ��˫���Ľ�ɫ����
	public void askName(Computer computer,Person person){
		
		System.out.print("��ѡ��Է���ɫ��(1.����,2.��Ȩ3.�ܲ�)");
		
		computer.inputName();
		System.out.print("������������֣�");
		person.inputName();
		
	System.out.println(computer.getPlayName()+"    VS    "+person.getPlayName()+"    ��ս");
	}

	//��Ϸ����
	public String playGame(Computer computer,Person person){
		while(true){
		String yn=null;
		System.out.println();
		System.out.print("��ʼ��(y/n) ");
		
		 yn=input.next();
		 System.out.println();
		if(yn.equals("y"))
			break;
		else
			System.out.println("�ȴ�׼����");
		
		}
		total++;
		System.out.print("���ȭ ��( 1.����,2.ʯͷ,3.��(�����Ӧ������))");
		int n=person.myFist();
		if(n==1){
			System.out.println(" ���ȭ: ����");
		}else if(n==2){
			System.out.println(" ���ȭ: ʯͷ");
		}else if(n==3){
			System.out.println(" ���ȭ����");
		}
		
		int m=computer.myFist();
		System.out.print(computer.getPlayName()+"��ȭ�� ");
		if(m==1){
			System.out.println("  ����");
		}else if(m==2){
			System.out.println("  ʯͷ");
		}else if(m==3){
			System.out.println(" ��");
		}
		
		if(((n==1)&&(m==3))||((n==2)&&(m==1))||((n==3)&&(m==2))){
			person.setWinningTimes(1);
			System.out.println("�������ϲ�㣡�����Ӯ�ˣ�");
		}else if(((n==1)&&(m==1))||((n==2)&&(m==2))||((n==3)&&(m==3))){
			System.out.println("��������ƽ�֣�");
		}else if(((m==1)&&(n==3))||((m==2)&&(n==1))||((m==3)&&(n==2)))
		{
			computer.setWinningTimes(1);
			System.out.println("�����^_^ ������ ������");
			computer.setWinningTimes(1);
		}
		System.out.println();
		System.out.print("�Ƿ�ʼ��һ�֣�(y/n)");
		String yn=input.next();
		
		return yn;
		
		
	}
	
	public void finalResult(Computer computer,Person person){
		System.out.println(computer.getPlayName()+"    �Ծ�        "+person.getPlayName());
		System.out.println("��ս������    "+total);
		System.out.println();
		System.out.println("����"+"     "+"�÷�");
		System.out.println(computer.getPlayName()+"     "+computer.getWinningTimes());
		System.out.println(person.getPlayName()+"     "+person.getWinningTimes());
		System.out.println();
		if(computer.getWinningTimes()>person.getWinningTimes()){
			System.out.println("����� �Ǻǣ��������´μ���Ŷ��");
		}else if(computer.getWinningTimes()==person.getWinningTimes()){
			System.out.println("����� ���䲻Ӯ��ƽ�֣��������ͣ�");
			
		}else{
			System.out.println("�������ϲ�㣬��սʤ�˵��ԣ�");
		}
		
		
	}
}
