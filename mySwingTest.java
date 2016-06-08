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
	 * ��������������
	 */
	public mySwingTest(){
		//��һ��
		JPanel p1 =new JPanel();
		p1.setLayout(new FlowLayout());
		p1.add(new JLabel("��  �ţ�"));
		p1.add(new JTextField("",8));
		p1.add(new JLabel("�������ڣ�"));
		p1.add(new JTextField("",8));
		p1.add(new JLabel("ȫ��Ͷע����"));
		p1.add(new JTextField("",12));
		
		//�ڶ���
		JPanel p2 =new JPanel();
		p2.setLayout(new FlowLayout());
		
		for(int i=1;i<=7;i++){
			p2.add(new JTextField("",2));
		}
		
		//�ܵ��ϲ����
		JPanel p3=new JPanel();
		p3.setLayout(new GridLayout(2,6));
		p3.add(p1);
		p3.add(p2);
		add(p3,BorderLayout.NORTH);
		
		//�в����
		JPanel p4=new JPanel();
		p4.setLayout(new GridLayout(7,4));
		
		//�����в���һ���ı�λ��
		JLabel jlabAward=new JLabel("��  ��");
		jlabAward.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabNumOfWins=new JLabel("�н�ע��");
		jlabNumOfWins.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabPrize=new JLabel("��ע����");
		jlabPrize.setHorizontalAlignment(SwingConstants.CENTER);
		
		//�����н��ȼ��ı�λ��
		JLabel jlabTheFirstPrize=new JLabel("һ�Ƚ�");
		jlabTheFirstPrize.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabTheSecondPrize=new JLabel("���Ƚ�");
		jlabTheSecondPrize.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabTheThirdPrize=new JLabel("���Ƚ�");
		jlabTheThirdPrize.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabTheFouthPrize=new JLabel("�ĵȽ�");
		jlabTheFouthPrize.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabTheFifthPrize=new JLabel("��Ƚ�");
		jlabTheFifthPrize.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabTheSixthPrize=new JLabel("���Ƚ�");
		jlabTheSixthPrize.setHorizontalAlignment(SwingConstants.CENTER);
		
		//�����н������ı�λ��
		JLabel jlabPrize3 =new JLabel("3000Ԫ");
		jlabPrize3.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabPrize4 =new JLabel("200Ԫ");
		jlabPrize4.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabPrize5 =new JLabel("10Ԫ");
		jlabPrize5.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlabPrize6 =new JLabel("5Ԫ");
		jlabPrize6.setHorizontalAlignment(SwingConstants.CENTER);
		
		//�����н������ı�λ��
		JLabel jlabWinCondition=new JLabel("�н�����");
		jlabWinCondition.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlab1=new JLabel("6+1");
		jlab1.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlab2=new JLabel("6+0");
		jlab2.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlab3=new JLabel("5+1");
		jlab3.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlab4=new JLabel("5+0��4+1");
		jlab4.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlab5=new JLabel("4+0��3+1");
		jlab5.setHorizontalAlignment(SwingConstants.CENTER);
		JLabel jlab6=new JLabel("2+1��1+1��0+1");
		jlab6.setHorizontalAlignment(SwingConstants.CENTER);
		
		//�ָ���
		
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
		//�ײ����
		JPanel p6=new JPanel();
		p6.add(new JLabel("��ǰ�����ʽ�"));
		p6.add(new JTextField("",16));
		add(p6,BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mySwingTest frame = new mySwingTest();
		frame.setTitle("����˫ɫ��¼�봰��");
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
