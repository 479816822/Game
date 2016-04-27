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
	
	//游戏开始，并公布游戏的规则
	public void startGame(){
		System.out.println("*********************");
		System.out.println("*****猜拳开始*********");
		System.out.println("**********************");
		System.out.println();
		System.out.println("出拳规则： 1.剪刀,2.石头,3.布(请出相应的数字)");
		System.out.println("");
	}
	
	//确定双方的角色姓名
	public void askName(Computer computer,Person person){
		
		System.out.print("请选择对方角色：(1.刘备,2.孙权3.曹操)");
		
		computer.inputName();
		System.out.print("请输入你的名字：");
		person.inputName();
		
	System.out.println(computer.getPlayName()+"    VS    "+person.getPlayName()+"    对战");
	}

	//游戏进行
	public String playGame(Computer computer,Person person){
		while(true){
		String yn=null;
		System.out.println();
		System.out.print("开始吗？(y/n) ");
		
		 yn=input.next();
		 System.out.println();
		if(yn.equals("y"))
			break;
		else
			System.out.println("等待准备！");
		
		}
		total++;
		System.out.print("请出拳 ：( 1.剪刀,2.石头,3.布(请出相应的数字))");
		int n=person.myFist();
		if(n==1){
			System.out.println(" 你出拳: 剪刀");
		}else if(n==2){
			System.out.println(" 你出拳: 石头");
		}else if(n==3){
			System.out.println(" 你出拳：布");
		}
		
		int m=computer.myFist();
		System.out.print(computer.getPlayName()+"出拳： ");
		if(m==1){
			System.out.println("  剪刀");
		}else if(m==2){
			System.out.println("  石头");
		}else if(m==3){
			System.out.println(" 布");
		}
		
		if(((n==1)&&(m==3))||((n==2)&&(m==1))||((n==3)&&(m==2))){
			person.setWinningTimes(1);
			System.out.println("结果：恭喜你！这局你赢了！");
		}else if(((n==1)&&(m==1))||((n==2)&&(m==2))||((n==3)&&(m==3))){
			System.out.println("结果：这局平局！");
		}else if(((m==1)&&(n==3))||((m==2)&&(n==1))||((m==3)&&(n==2)))
		{
			computer.setWinningTimes(1);
			System.out.println("结果：^_^ 你输了 笨笨！");
			computer.setWinningTimes(1);
		}
		System.out.println();
		System.out.print("是否开始下一轮：(y/n)");
		String yn=input.next();
		
		return yn;
		
		
	}
	
	public void finalResult(Computer computer,Person person){
		System.out.println(computer.getPlayName()+"    对局        "+person.getPlayName());
		System.out.println("对战次数：    "+total);
		System.out.println();
		System.out.println("姓名"+"     "+"得分");
		System.out.println(computer.getPlayName()+"     "+computer.getWinningTimes());
		System.out.println(person.getPlayName()+"     "+person.getWinningTimes());
		System.out.println();
		if(computer.getWinningTimes()>person.getWinningTimes()){
			System.out.println("结果： 呵呵，笨笨，下次加油哦！");
		}else if(computer.getWinningTimes()==person.getWinningTimes()){
			System.out.println("结果： 不输不赢，平局，继续加油！");
			
		}else{
			System.out.println("结果：恭喜你，你战胜了电脑！");
		}
		
		
	}
}
