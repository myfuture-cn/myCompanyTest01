package myTest01;

import java.awt.*;
import javax.swing.*;

public class mySwingTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 * 测试面板如何设置
	 */
	public mySwingTest(){
		//第一行
		JPanel p1 =new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(new JLabel("期  号："));
		p1.add(new JTextField("",8));
		p1.add(new JLabel("开奖日期："));
		p1.add(new JTextField("",8));
		p1.add(new JLabel("全国投注量："));
		p1.add(new JTextField("",12));
		
		//第二行
		JPanel p2 =new JPanel();
		p2.setLayout(new FlowLayout());
		
		for(int i=1;i<=7;i++){
			p2.add(new JTextField("",2));
		}
		
		//总的上部框架
		JPanel p3=new JPanel();
		p3.setLayout(new GridLayout(2,6));
		p3.add(p1);
		p3.add(p2);
		add(p3,BorderLayout.NORTH);
		
		//中部框架
		JPanel p4=new JPanel();
		p4.setLayout(new GridLayout(7,4));
		
		//设置中部第一行文本位置
		JLabel jlabAward=new JLabel("奖  项");
		jlabAward.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabNumOfWins=new JLabel("中奖注数");
		jlabNumOfWins.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabPrize=new JLabel("单注奖金");
		jlabPrize.setHorizontalAlignment(SwingConstants.CENTER);
		
		//设置中奖等级文本位置
		JLabel jlabTheFirstPrize=new JLabel("一等奖");
		jlabTheFirstPrize.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabTheSecondPrize=new JLabel("二等奖");
		jlabTheSecondPrize.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabTheThirdPrize=new JLabel("三等奖");
		jlabTheThirdPrize.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabTheFouthPrize=new JLabel("四等奖");
		jlabTheFouthPrize.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabTheFifthPrize=new JLabel("五等奖");
		jlabTheFifthPrize.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabTheSixthPrize=new JLabel("六等奖");
		jlabTheSixthPrize.setHorizontalAlignment(SwingConstants.CENTER);
		
		//设置中奖奖金文本位置
		JLabel jlabPrize3 =new JLabel("3000元");
		jlabPrize3.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabPrize4 =new JLabel("200元");
		jlabPrize4.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabPrize5 =new JLabel("10元");
		jlabPrize5.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabPrize6 =new JLabel("5元");
		jlabPrize6.setHorizontalAlignment(SwingConstants.CENTER);
		
		//设置中奖条件文本位置
		JLabel jlabWinCondition=new JLabel("中奖条件");
		jlabWinCondition.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlab1=new JLabel("6+1");
		jlab1.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlab2=new JLabel("6+0");
		jlab2.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlab3=new JLabel("5+1");
		jlab3.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlab4=new JLabel("5+0或4+1");
		jlab4.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlab5=new JLabel("4+0或3+1");
		jlab5.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlab6=new JLabel("2+1或1+1或0+1");
		jlab6.setHorizontalAlignment(SwingConstants.CENTER);
		
		//分割线
		
		p4.add(jlabAward);
		p4.add(jlabNumOfWins);
		p4.add(jlabPrize);
		p4.add(jlabWinCondition);
		p4.add(jlabTheFirstPrize);
		p4.add(new JTextField("",12));
		p4.add(new JTextField("",12));
		p4.add(jlab1);
		p4.add(jlabTheSecondPrize);
		p4.add(new JTextField("",12));
		p4.add(new JTextField("",12));
		p4.add(jlab2);
		p4.add(jlabTheThirdPrize);
		p4.add(new JTextField("",12));
		p4.add(jlabPrize3);
		p4.add(jlab3);
		p4.add(jlabTheFouthPrize);
		p4.add(new JTextField("",12));
		p4.add(jlabPrize4);
		p4.add(jlab4);
		p4.add(jlabTheFifthPrize);
		p4.add(new JTextField("",12));
		p4.add(jlabPrize5);
		p4.add(jlab5);
		p4.add(jlabTheSixthPrize);
		p4.add(new JTextField("",12));
		p4.add(jlabPrize6);
		p4.add(jlab6);
		
		
		add(p4,BorderLayout.CENTER);
		//底部框架
		JPanel p6=new JPanel();
		p6.add(new JLabel("当前奖池资金："));
		p6.add(new JTextField("",16));
		add(p6,BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mySwingTest frame = new mySwingTest();
		frame.setTitle("测试双色球录入窗口");
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
