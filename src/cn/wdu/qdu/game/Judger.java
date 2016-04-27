package cn.wdu.qdu.game;

import java.util.Scanner;

public class Judger {
 
	private int total;
	Scanner input=new Scanner(System.in);
	public void startGame(){
		System.out.println("*********************");
		System.out.println("*****猜拳开始*********");
		System.out.println("**********************");
		System.out.println("出拳规则： 1.剪刀,2.石头,3.布(请出相应的数字)");
	}
	public void askName(){
		
		System.out.print("请选择对方角色：(1.刘备,2.孙权3.曹操)");
		int num=input.nextInt();
		//inputName(num);
		System.out.println("请输入你的名字：");
		String name=input.next();
		//
//		System.out.println(name+"VS"++"对战");
	}
	public String playGame(){
		while(true){
			String yn=null;
		System.out.print("开始吗？(y/n) ");
		 yn=input.next();
		if(yn.equals("y"))
			break;
		else
			System.out.println("");
		
		}
		
		System.out.print("请出拳：( 1.剪刀,2.石头,3.布(请出相应的数字))");
		int n=myFist();
		if(n==1){
			System.out.println("你出拳: 剪刀");
		}else if(n==2){
			System.out.println("你出拳: 石头");
		}else{
			System.out.println("你出拳：布");
		}
		
		System.out.print(name+"出拳：");
		if(n==1){
			System.out.println(" 剪刀");
		}else if(n==2){
			System.out.println(" 石头");
		}else{
			System.out.println("布");
		}
		
		System.out.print("是否开始下一轮：(y/n)");
		String yn=input.next();
		
		return yn;
		
		
	}
	
	public void finalResult(){
		System.out.println(name+"对局"+name);
		
	}
}
