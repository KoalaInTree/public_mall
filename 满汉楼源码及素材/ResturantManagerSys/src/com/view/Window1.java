/**
 * ������1 
 */
package com.view;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import javax.swing.*;
import com.Tools.*;
import com.model.*;

//���¹�����
public class Window1 extends JFrame implements ActionListener, MouseListener {
	
	//�������
	JMenuBar jmb;
	JToolBar jtb;
	Image jp1_bgimg;
	ImageIcon jtitle;
	JPanel jp1,jp2,jp3,jp4;//��Ƭ������������
	JPanel jbottom;
	JPanel jp3_rs,jp3_login,jp3_dishes,jp3_chart,jp3_cost,jp3_sysrest,jp3_help; //������ҳ��
	JLabel jp1_lab1,jp1_lab2,jp1_lab3,jp1_lab4,jp1_lab5,jp1_lab6,jp1_lab7,jp1_lab8;
	JLabel jp2_lab1,jp2_lab2;
	JMenu jm1,jm2,jm3,jm4,jm5,jm6;
	JMenuItem jmi1,jmi2,jmi3,jmi4,jmi5;
	ImageIcon jmi1_icon,jmi2_icon,jmi3_icon,jmi4_icon,jmi5_icon;//�����˵�ͼ��
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10; //���幤������ť
	JSplitPane jsp1;
	Cursor mycursor;//����ƶ���������ʽ--����
	Image cursorImg;
	
	Vector<JLabel> jp1_labs; //װ��������label
	
	//jp3���ݵĶ���
	CardLayout cl;
	ImagePanel jp3_bg;
	
	
	ShowTime st;
	//���� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Window1 w1=new Window1();
	}
	//��ʼ���˵�
	public void initMenu()
	{
		//��ȡ�����˵���ͼƬ
		jmi1_icon=new ImageIcon("images\\jm1_icon1.jpg");
		jmi2_icon=new ImageIcon("images\\jm1_icon2.jpg");
		jmi3_icon=new ImageIcon("images\\jm1_icon3.png");
		jmi4_icon=new ImageIcon("images\\jm1_icon4.png");
		jmi5_icon=new ImageIcon("images\\jm1_icon5.jpg");
		
		//��ȡ���ڵ�ͼ��
		jtitle=new ImageIcon("images\\title.gif");
		//�������
		jmb=new JMenuBar();
		//һ���˵�
		jm1=new JMenu("ϵͳ����");
		jm1.setFont(Tools.mainFont);
		//�����˵�
		jmi1=new JMenuItem("�л��û�",jmi1_icon);
		jmi2=new JMenuItem("�л����տ����",jmi2_icon);
		jmi3=new JMenuItem("����ϵͳ",jmi3_icon);
		jmi4=new JMenuItem("������",jmi4_icon);
		jmi5=new JMenuItem("�˳�",jmi5_icon);
		
		jmi1.addActionListener(this);
		jmi2.addActionListener(this);
		jmi3.addActionListener(this);
		jmi4.addActionListener(this);
		jmi5.addActionListener(this);
		
		jm1.add(jmi1);
		jm1.add(jmi2);
		jm1.add(jmi3);
		jm1.add(jmi4);
		jm1.add(jmi5);
		
		jm2=new JMenu("���¹���");
		jm2.setFont(Tools.mainFont);
		jm3=new JMenu("�˵�����");
		jm3.setFont(Tools.mainFont);
		jm4=new JMenu("����ͳ��");
		jm4.setFont(Tools.mainFont);
		jm5=new JMenu("�ɱ����ⷿ");
		jm5.setFont(Tools.mainFont);
		jm6=new JMenu("����");
		jm6.setFont(Tools.mainFont);
		
		//������
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		jmb.add(jm4);
		jmb.add(jm5);
		jmb.add(jm6);
		this.setJMenuBar(jmb);
	}
	
	//��ʼ��������
	public void initToolBar()
	{
		//����������
		jtb=new JToolBar();
		jtb.setFloatable(false);
		jb1=new JButton(new ImageIcon("images\\jb1.png"));
		jb2=new JButton(new ImageIcon("images\\jb2.png"));
		jb3=new JButton(new ImageIcon("images\\jb3.png"));
		jb4=new JButton(new ImageIcon("images\\jb4.png"));
		jb5=new JButton(new ImageIcon("images\\jb5.png"));
		jb6=new JButton(new ImageIcon("images\\jb6.png"));
		jb7=new JButton(new ImageIcon("images\\jb7.png"));
		jb8=new JButton(new ImageIcon("images\\jb8.png"));
		jb9=new JButton(new ImageIcon("images\\jb9.png"));
		jb10=new JButton(new ImageIcon("images\\jb10.png"));
		jb1.setBorderPainted(false);
		jb2.setBorderPainted(false);
		jb3.setBorderPainted(false);
		jb4.setBorderPainted(false);
		jb5.setBorderPainted(false);
		jb6.setBorderPainted(false);
		jb7.setBorderPainted(false);
		jb8.setBorderPainted(false);
		jb9.setBorderPainted(false);
		jb10.setBorderPainted(false);
		
		jb1.setFocusPainted(false);
		jb2.setFocusPainted(false);
		jb3.setFocusPainted(false);
		jb4.setFocusPainted(false);
		jb5.setFocusPainted(false);
		jb6.setFocusPainted(false);
		jb7.setFocusPainted(false);
		jb8.setFocusPainted(false);
		jb9.setFocusPainted(false);
		jb10.setFocusPainted(false);
		
		jb1.setToolTipText("�л����տ����");
		jb2.setToolTipText("�л��û�");
		jb3.setToolTipText("��½����");
		jb4.setToolTipText("���¹���");
		jb5.setToolTipText("����ͳ��");
		jb6.setToolTipText("���׼۸�");
		jb7.setToolTipText("�ɱ����ⷿ");
		jb8.setToolTipText("ϵͳ����");
		jb9.setToolTipText("��������");
		jb10.setToolTipText("ϵͳ��Ϣ");
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
		jb7.addActionListener(this);
		jb8.addActionListener(this);
		jb9.addActionListener(this);
		jb10.addActionListener(this);
		
		jtb.add(jb1);
		jtb.add(jb2);
		jtb.add(jb3);
		jtb.add(jb4);
		jtb.add(jb5);
		jtb.add(jb6);
		jtb.add(jb7);
		jtb.add(jb8);
		jtb.add(jb9);
		jtb.add(jb10);
	}
	
	//�������ʾ����
	public void initMainPane()
	{
		//�������
		jp1=new JPanel(new BorderLayout());
		try {
			jp1_bgimg=ImageIO.read(new File("images/jp1_bg.jpg"));
			cursorImg = ImageIO.read(new File("images/chazi.png"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ImagePanel ip1_bgPanel=new ImagePanel(jp1_bgimg);
		ip1_bgPanel.setLayout(new GridLayout(8, 1));
		mycursor=Toolkit.getDefaultToolkit().createCustomCursor(cursorImg, new Point(30,30),"dynamite stick") ;
		
		jp1_labs = new Vector<JLabel>();
		jp1_lab1=new JLabel(new ImageIcon("images/mhl.gif"), 0);
		jp1_lab2=new JLabel("�� �� �� ��", new ImageIcon("images/jm1_icon4.png"), 0);
		jp1_lab3=new JLabel("�� ½ �� ��", new ImageIcon("images/jm1_icon3.png"), 0);
		jp1_lab4=new JLabel("�� �� �� ��", new ImageIcon("images/label_4.png"), 0);
		jp1_lab5=new JLabel("�� �� ͳ ��", new ImageIcon("images/label_5.png"), 0);
		jp1_lab6=new JLabel("�ɱ����ⷿ  ", new ImageIcon("images/label_6.png"), 0);
		jp1_lab7=new JLabel("ϵ ͳ �� ��", new ImageIcon("images/label_7.png"), 0);
		jp1_lab8=new JLabel("�� �� �� ��", new ImageIcon("images/label_8.png"), 0);
		
		//����JLabel������
		jp1_lab2.setFont(Tools.f_14);
		jp1_lab3.setFont(Tools.f_14);
		jp1_lab4.setFont(Tools.f_14);
		jp1_lab5.setFont(Tools.f_14);
		jp1_lab6.setFont(Tools.f_14);
		jp1_lab7.setFont(Tools.f_14);
		jp1_lab8.setFont(Tools.f_14);
		
		//����JLabelΪ����
		jp1_lab2.setEnabled(false);
		jp1_lab3.setEnabled(false);
		jp1_lab4.setEnabled(false);
		jp1_lab5.setEnabled(false);
		jp1_lab6.setEnabled(false);
		jp1_lab7.setEnabled(false);
		jp1_lab8.setEnabled(false);
		
		//�����ƶ���JLabel��ʱ�����ʾΪ����
		jp1_lab2.setCursor(mycursor);
		jp1_lab3.setCursor(mycursor);
		jp1_lab4.setCursor(mycursor);
		jp1_lab5.setCursor(mycursor);
		jp1_lab6.setCursor(mycursor);
		jp1_lab7.setCursor(mycursor);
		jp1_lab8.setCursor(mycursor);
		
		//��Ӽ���
		jp1_lab2.addMouseListener(this);
		jp1_lab3.addMouseListener(this);
		jp1_lab4.addMouseListener(this);
		jp1_lab5.addMouseListener(this);
		jp1_lab6.addMouseListener(this);
		jp1_lab7.addMouseListener(this);
		jp1_lab8.addMouseListener(this);
		
		//װ��JLabel
		jp1_labs.add(jp1_lab2);
		jp1_labs.add(jp1_lab3);
		jp1_labs.add(jp1_lab4);
		jp1_labs.add(jp1_lab5);
		jp1_labs.add(jp1_lab6);
		jp1_labs.add(jp1_lab7);
		jp1_labs.add(jp1_lab8);
		
		ip1_bgPanel.add(jp1_lab1);
		ip1_bgPanel.add(jp1_lab2);
		ip1_bgPanel.add(jp1_lab3);
		ip1_bgPanel.add(jp1_lab4);
		ip1_bgPanel.add(jp1_lab5);
		ip1_bgPanel.add(jp1_lab6);
		ip1_bgPanel.add(jp1_lab7);
		ip1_bgPanel.add(jp1_lab8);
		jp1.add(ip1_bgPanel);
		
		//��Ƭ����
		cl=new CardLayout();
		jp2=new JPanel(new CardLayout());
		jp2.setPreferredSize(new Dimension(30, Tools.height));
		jp2_lab1=new JLabel(new ImageIcon("images/jp2_right.jpg"));
		jp2_lab2=new JLabel(new ImageIcon("images/jp2_left.jpg"));
		jp2_lab1.addMouseListener(this);
		jp2_lab2.addMouseListener(this);
		jp2_lab1.setCursor(mycursor);
		jp2_lab2.setCursor(mycursor);
		jp2.add(jp2_lab1,"0");
		jp2.add(jp2_lab2,"1");
		
		//jp3�ı���ͼƬ
		jp3=new JPanel(cl);
		try {
			jp3_bg=new ImagePanel(ImageIO.read(new File("images/split_main.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//���¹�����洴��
		jp3_rs = new EmpInfo();
		//��½������洴��
		jp3_login = new LoginInfo();
		//���׼۸���洴��
		jp3_dishes = new DishesInfo();
		//����ͳ�ƽ���Ĵ���
		jp3_chart = new ChartInfo();
		//�ɱ����ⷿ����Ĵ���
		jp3_cost = new CostInfo();
		//ϵͳ���ý���Ĵ���
		jp3_sysrest = new SysRestInfo();
		//������������Ĵ���
		jp3_help = new HelpInfo();
		jp3.add(jp3_bg     ,"0");
		jp3.add(jp3_rs     ,"1");
		jp3.add(jp3_login  ,"2");
		jp3.add(jp3_dishes ,"3");
		jp3.add(jp3_chart  ,"4");
		jp3.add(jp3_cost   ,"5");
		jp3.add(jp3_sysrest,"6");
		jp3.add(jp3_help   ,"7");
		
		//��ֵ��Ҵ���
		jp4=new JPanel(new BorderLayout());
//		jp2.setPreferredSize(new Dimension(200,Tools.height));
		jp4.add(jp2,BorderLayout.WEST);
		jp4.add(jp3,BorderLayout.CENTER);
		
		//��ִ���
		jsp1=new JSplitPane( JSplitPane.HORIZONTAL_SPLIT, false, jp1, jp4);
		jsp1.setDividerLocation(Tools.width);
		jsp1.setDividerSize(0);
	}
	
	//���캯��
	public Window1()
	{
		Container ct=this.getContentPane();
		
		//���ó�ʼ���˵�����
		this.initMenu();
		//���ó�ʼ������������
		this.initToolBar();
		//���ó�ʼ�����ݺ���
		this.initMainPane();
		
		//�ױ�״̬��
		jbottom = new JPanel(new BorderLayout());
		st=new ShowTime();
		st.setLayout(new BorderLayout());
		StatusPanel st_bg=null;
		try {
			st_bg=new StatusPanel(ImageIO.read(new File("images/time_bg.jpg")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		st.add(st_bg);
		jbottom.add(st);
		jbottom.setPreferredSize(new Dimension(Tools.width,30));
		Thread t=new Thread(st);
		t.start();
		//���ò���
		ct.add(jsp1,BorderLayout.CENTER);
		ct.add(jbottom, BorderLayout.SOUTH);
		ct.add(jtb, BorderLayout.NORTH);

		
		//���ô���
		this.setTitle("����¥��������ϵͳ");
		this.setIconImage(jtitle.getImage());
		this.setSize(Tools.width,Tools.height-35);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//���ڵ����ǰJLabel������jp1�е�û���������¼���JLabel������������¼�
	public void getNoMouseListenerLabel(JLabel nowLabel)
	{
		for(int i=0;i<jp1_labs.size();i++)
		{
			if(jp1_labs.get(i)!=nowLabel)
			{
				if(jp1_labs.get(i).getMouseListeners().length==0)
				{
					jp1_labs.get(i).addMouseListener(this);
					jp1_labs.get(i).setEnabled(false);
				}
			}
		}
	}
	public void showPanel(JLabel label)
	{
		label.setEnabled(true);
		jsp1.setDividerLocation(220);
		label.removeMouseListener(this);
		this.getNoMouseListenerLabel(label);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.jp1_lab2)
		{
			//jp1�����¹���
			cl.show(jp3, "1");
			this.showPanel(jp1_lab2);
		}else if(e.getSource()==jp1_lab3)
		{
			//jp1�ĵ�½����
			cl.show(jp3, "2");
			this.showPanel(jp1_lab3);
		}else if(e.getSource()==jp1_lab4)
		{
			//jp1�Ĳ��׼۸�
			cl.show(jp3, "3");
			this.showPanel(jp1_lab4);
		}else if(e.getSource()==jp1_lab5)
		{
			//jp1�ı���ͳ��
			cl.show(jp3, "4");
			this.showPanel(jp1_lab5);
		}else if(e.getSource()==jp1_lab6)
		{
			//jp1�ĳɱ����ⷿ
			cl.show(jp3, "5");
			this.showPanel(jp1_lab6);
		}else if(e.getSource()==jp1_lab7)
		{
			//jp1��ϵͳ����
			cl.show(jp3, "6");
			this.showPanel(jp1_lab7);
		}else if(e.getSource()==jp1_lab8)
		{
			//jp1�Ķ�������
			cl.show(jp3, "7");
			this.showPanel(jp1_lab8);
		}else if(e.getSource()==jp2_lab1)
		{
			//jp2���������Ű�ť
			jsp1.setDividerLocation(Tools.width);
			this.getNoMouseListenerLabel(null);
		}else if(e.getSource()==jp2_lab2)
		{
			//jp2���������Ű�ť
			jsp1.setDividerLocation(220);
			
		}
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jp1_lab2)
		{
			jp1_lab2.setEnabled(true);
		}else if(e.getSource()==jp1_lab3)
		{
			jp1_lab3.setEnabled(true);
		}else if(e.getSource()==jp1_lab4)
		{
			jp1_lab4.setEnabled(true);
		}else if(e.getSource()==jp1_lab5)
		{
			jp1_lab5.setEnabled(true);
		}else if(e.getSource()==jp1_lab6)
		{
			jp1_lab6.setEnabled(true);
		}else if(e.getSource()==jp1_lab7)
		{
			jp1_lab7.setEnabled(true);
		}else if(e.getSource()==jp1_lab8)
		{
			jp1_lab8.setEnabled(true);
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jp1_lab2)
		{
			jp1_lab2.setEnabled(false);
			
		}else if(e.getSource()==jp1_lab3)
		{
			jp1_lab3.setEnabled(false);
		}else if(e.getSource()==jp1_lab4)
		{
			jp1_lab4.setEnabled(false);
		}else if(e.getSource()==jp1_lab5)
		{
			jp1_lab5.setEnabled(false);
		}else if(e.getSource()==jp1_lab6)
		{
			jp1_lab6.setEnabled(false);
		}else if(e.getSource()==jp1_lab7)
		{
			jp1_lab7.setEnabled(false);
		}else if(e.getSource()==jp1_lab8)
		{
			jp1_lab8.setEnabled(false);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jmi1||e.getSource()==jb2)
		{
			//�л��û�
			this.dispose();
			new Login();
			
		}else if(e.getSource()==jmi2||e.getSource()==jb1)
		{
			//�л����տ����
			this.dispose();
			OrderIndex oi = new OrderIndex();
			
		}else if(e.getSource()==jmi3)
		{
			//��������
			this.dispose();
			Thread t=new Thread(new Index());
			t.start();
		}else if(e.getSource()==jmi4)
		{
			//������
		}
		else if(e.getSource()==jmi5)
		{
			//�˳�ϵͳ
			System.exit(0);
		}else if(e.getSource()==jb4)
		{
			//jp1�����¹���
			cl.show(jp3, "1");
			this.showPanel(jp1_lab2);
		}else if(e.getSource()==jb3)
		{
			//jp1�ĵ�½����
			cl.show(jp3, "2");
			this.showPanel(jp1_lab3);
		}else if(e.getSource()==jb6)
		{
			//jp1�Ĳ��׼۸�
			cl.show(jp3, "3");
			this.showPanel(jp1_lab4);
		}else if(e.getSource()==jb5)
		{
			//jp1�ı���ͳ��
			cl.show(jp3, "4");
			this.showPanel(jp1_lab5);
		}else if(e.getSource()==jb7)
		{
			//jp1�ĳɱ����ⷿ
			cl.show(jp3, "5");
			this.showPanel(jp1_lab6);
		}else if(e.getSource()==jb8)
		{
			//jp1��ϵͳ����
			cl.show(jp3, "6");
			this.showPanel(jp1_lab7);
		}else if(e.getSource()==jb9)
		{
			//jp1�Ķ�������
			cl.show(jp3, "7");
			this.showPanel(jp1_lab8);
		}else if(e.getSource()==jb10)
		{
			//����ϵͳ��Ϣ
		}
		
	}
}
