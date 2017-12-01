package com.view;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

import com.Tools.Tools;

public class ChartInfo extends JPanel implements ActionListener {

	int charWidth,charHeight;

	int dayCount=31;
	Vector<Integer> values;
	Vector<Integer> xPoints;
	Vector<Integer> yPoints;
	Boolean flag=true;
	String year = "2017";
	String mon = "8";
	String type ="����ͼ";
	String unit ="ǧԪ";
	int maxday;
	int minday;
	int max;
	int min;
	
	//�ײ�ѡ�����Ϣ��ʾ��
	JPanel jbottom;
	JButton jb1;
//	JRadioButton jrb1,jrb2,jrb3;
//	ButtonGroup BG;
	JComboBox<String> jcb1,jcb2,jcb3,jcb4,jcb5;
	JLabel lab_1,lab_2;
	JButton jcon,jcon2,jcon3;
	JPanel jp_left;
	JPanel jcard;
	CardLayout cl;
	JPanel jp1,jp2,jp3,jtop;
	JButton jb2,jb3,jb4;
	
	JPanel jmid;
	JLabel jmid_1,jmid_2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public ChartInfo()
	{
		values = new Vector<Integer>();
		for(int i=0;i<31;i++)
		{
			this.values.add((int)Math.ceil((Math.random()*50)));
		}
		jbottom = new JPanel();
		jbottom.setLayout(null);
//		jbottom.setBackground(Color.GRAY);
		jbottom.setPreferredSize(new Dimension(this.getWidth()-50,170));

		this.setLayout(new BorderLayout());
		jb1 = new JButton("ת��Ϊ��״ͼ");
		jb1.setBounds(1500, 30, 130, 100);
		jb1.setFont(Tools.f_14);
		jb1.setFocusPainted(false);
		jb1.addActionListener(this);

		
//		BG = new ButtonGroup();
//		
//		jrb1 = new JRadioButton("2009");
//		jrb2 = new JRadioButton("2010");
//		jrb3 = new JRadioButton("2011");
//		
//		BG.add(jrb1);
//		BG.add(jrb2);
//		BG.add(jrb3);

//		jbottom.add(jrb1);
//		jbottom.add(jrb2);
//		jbottom.add(jrb3);
		jp_left = new JPanel(new BorderLayout());
		jp_left.setBorder(BorderFactory.createLineBorder(new Color(85,105,225), 2, true));
		jtop = new JPanel();
		jtop.setPreferredSize(new Dimension(450, 70));
		jb2 = new JButton("�·����۶�");
		jb2.addActionListener(this);
		jb3 = new JButton("������۶�");
		jb3.addActionListener(this);
		jb4 = new JButton("�������۶�");
		jb4.addActionListener(this);
		jtop.add(jb2);
		jtop.add(jb3);
		jtop.add(jb4);
		
		
		cl = new CardLayout();
		jcard = new JPanel(cl);
		
		jp1 = new JPanel();
		jp1.setOpaque(false);
		jp_left.setOpaque(false);
		String str1[] = {" 2016 "," 2017 "," 2018 "," 2019 "};
		String str2[] = {"1","2","3","4","5","6","7","8","9","10","11","12"};
		jcb1 = new JComboBox<String>(str1);
		jcb1.setSelectedIndex(1);
		jcb2 = new JComboBox<String>(str2);
		jcb2.setSelectedIndex(7);
		jcon = new JButton(" ȷ�� ");
		jcon.setFont(Tools.f_14);
		jcon.setFocusPainted(false);
		jcon.addActionListener(this);
		
		jp1.add(jcb1);
		jp1.add(new JLabel("��"));
		jp1.add(jcb2);
		jp1.add(new JLabel("��"));
		jp1.add(new JLabel(""));
		jp1.add(new JLabel(""));
		jp1.add(jcon);
		
		jp2 = new JPanel();
		jp2.setOpaque(false);
		
		jcb3 = new JComboBox<String>(str1);
		jcb3.setSelectedIndex(1);
		jcon2 = new JButton(" ȷ�� ");
		jcon2.setFont(Tools.f_14);
		jcon2.setFocusPainted(false);
		jcon2.addActionListener(this);
		
		jp2.add(jcb3);
		jp2.add(new JLabel("��"));
		jp2.add(new JLabel(""));
		jp2.add(new JLabel(""));
		jp2.add(jcon2);
		
		jp3 = new JPanel();
		jp3.setOpaque(false);
		
		jcb4 = new JComboBox<String>(str1);
		jcb4.setSelectedIndex(1);
		jcb5 = new JComboBox<String>(str1);
		jcb5.setSelectedIndex(3);
		jcon3 = new JButton(" ȷ�� ");
		jcon3.setFont(Tools.f_14);
		jcon3.setFocusPainted(false);
		jcon3.addActionListener(this);
		
		jp3.add(jcb4);
		jp3.add(new JLabel("��"));
		jp3.add(new JLabel(""));
		jp3.add(new JLabel("��"));
		jp3.add(new JLabel(""));
		jp3.add(jcb5);
		jp3.add(new JLabel(""));
		jp3.add(jcon3);
		
		jcard.add(jp1, "1");
		jcard.add(jp2, "2");
		jcard.add(jp3, "3");
		
		
		jp_left.add(jtop, "North");
		jp_left.add(jcard, "Center");
		jp_left.setBounds(50, 30, 400, 120);
		
		//�м���ʾ
		jmid = new JPanel(new GridLayout(2, 1));
		jmid.setBounds(jp_left.getWidth()+220,40,750,100);
		jmid.setBackground(new Color(88,179,252));
		jmid_1 = new JLabel(year+"��"+mon+"������۶�("+maxday+"��):"+max+unit);
		jmid_1.setFont(Tools.heightLight);
		jmid_2 = new JLabel(year+"��"+mon+"��С���۶�("+minday+"��):"+min+unit);
		jmid_2.setFont(Tools.heightLight);
		
		JPanel jmin1 = new JPanel();
		jmin1.setOpaque(false);
		JPanel jmin2 = new JPanel();
		jmin2.setOpaque(false);
		jmin1.add(jmid_1);
		jmin2.add(jmid_2);
		
		jmid.add(jmin1);
		jmid.add(jmin2);
		
		//�������ѡ��
		jbottom.add(jp_left);
		jbottom.add(jb1);
		jbottom.add(jmid);
		
		this.add(jbottom,"South");
		//���ô�С
		this.setSize(this.getWidth(), this.getHeight());
		this.setVisible(true);
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		xPoints = new Vector<Integer>();
		yPoints = new Vector<Integer>();
		charWidth = this.getWidth()-10;
		charHeight = this.getHeight()-180;
		//������0��0�㿪ʼ�滭
		g.fill3DRect(5, 5, charWidth, charHeight, true);
		g.setColor(new Color(56,94,15));
		for(int i=0;i<charHeight/10;i++)
		{
			g.drawLine(5, (i+1)*10, charWidth, (i+1)*10);
		}
		for(int i=0;i<charWidth/10;i++)
		{
			g.drawLine((i+1)*10, 5, (i+1)*10, charHeight);
		}
		
		//�滭����
		g.setFont(new Font("����", Font.PLAIN, 30));
		g.setColor(Color.white);
		g.drawString(year+"��"+mon+"�����۶�"+type+"��(��λ:"+unit+")", charWidth/2-270, 30);
		
		//�滭����
		g.setFont(Tools.f_14);
		g.setColor(Color.white);
		int x=70;
		int y=charHeight/2-40;
		int width = charWidth-250;
		int height = charHeight/2-110;
		//�ϰ��µ����۶�
		g.drawLine(x, y, x, y-height);
		g.drawLine(x, y, x+width, y);
		//�滭Y������ϵ
		for(int i=0,j=0;i<height;i+=height/10,j=j+5)
		{
			//�滭����ʱ���
			g.drawLine(x, y-i, x+3, y-i);
			g.drawString(j+"", x-40, y-i+3);
		}
		//�滭X������ϵ
		for(int i=width/15,j=1;i<width;i+=width/15,j++)
		{
			//�滭����ʱ���
			g.drawLine(x+i, y, x+i, y-3);
			g.drawString(j+"��", x+i-10, y+16);
			//�滭�������۶�
			g.drawString(values.get(j-1)+".0", x+i-10, y-(values.get(j-1))*height/50-10);
			g.drawLine(x+i, y-(values.get(j-1))*height/50, x+i, y-(values.get(j-1))*height/50+1);
			this.xPoints.add(x+i);
			this.yPoints.add(y-(values.get(j-1))*height/50);
		
		}
//		System.out.println(xPoints.size());
		//�°��µ����۶�
		int y2=charHeight-60;
		g.drawLine(x, y2, x, y2-height);
		g.drawLine(x, y2, x+width, y2);
		//�滭Y������ϵ
		for(int i=0,j=0;i<height;i+=height/10,j+=5)
		{
			//�滭����ʱ���
			g.drawLine(x, y2-i, x+3, y2-i);
			g.drawString(j+"", x-40, y2-i+3);
		}
		//�滭X������ϵ
		for(int i=width/(dayCount-15),j=16;i<width;i+=width/(dayCount-15),j++)
		{
			//�滭����ʱ���
			g.drawLine(x+i, y2, x+i, y2-3);
			g.drawString(j+"��", x+i-10, y2+16);
			//�滭�������۶�
			g.drawString(values.get(j-1)+".0", x+i-10, y2-(values.get(j-1))*height/50-10);
			g.drawLine(x+i, y2-(values.get(j-1))*height/50, x+i, y2-(values.get(j-1))*height/50-1);
			this.xPoints.add(x+i);
			this.yPoints.add(y2-(values.get(j-1))*height/50-1);
		}
//		System.out.println(xPoints.size());
		for(int i=0;i<xPoints.size();i++)
		{
//			xPoint = new int[xPoints.size()];
//			xPoint[0]=this.xPoints.get(i);
//			yPoint = new int[yPoints.size()];
//			yPoint[0]=this.yPoints.get(i);
			if(flag){
				if(i!=14&&i!=xPoints.size()-1)
					g.drawLine(xPoints.get(i), yPoints.get(i), xPoints.get(i+1), yPoints.get(i+1));
			}
			else{
//				System.out.println(xPoints.size()+"aaaa"+values.size());
//				System.out.println(values.get(i));
				g.fill3DRect(xPoints.get(i)-20, yPoints.get(i), 40, (values.get(i))*height/50, true);
				
			}

		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jb1)
		{
//			for(int i=0;i<31;i++)
//			{
//				this.values.add(1);
//			}
			if(flag)
			{
				flag=false;
				jb1.setText("ת��Ϊ����ͼ");
				type = "��״ͼ";
			}else{
				flag=true;
				jb1.setText("ת��Ϊ��״ͼ");
				type = "����ͼ";
			}
			
			this.repaint();
		}else if(e.getSource()==jcon)
		{
			System.out.println("1");
			
			this.year=this.jcb1.getSelectedItem().toString().replace(" ", "");
			this.mon=this.jcb2.getSelectedItem().toString().replace(" ", "");
			int MM=Integer.parseInt(mon.trim());
			if(MM==1||MM==3||MM==5||MM==7||MM==8||MM==10||MM==12)
			{
				dayCount = 31;
			}else if(MM==4||MM==6||MM==9||MM==11)
			{
				dayCount = 30;
			}else if(MM==2)
			{
				if(Integer.parseInt(year)%4==0)
				{
					dayCount = 29;
				}else{
					dayCount = 28;
				}
			}
			values = new Vector<Integer>();
			//��ԭÿ�ε�ֵ
			maxday=0;
			minday=0;
			max=0;
			min=0;
			for(int i=0;i<dayCount;i++)
			{
				int temp = (int)Math.ceil((Math.random()*50));
				if(temp>max)
				{
					max = temp;
					maxday = i+1;
				}
				if(i==0)
				{
					min = temp;
				}else if(i>0&&temp<min)
				{
					min = temp;
					minday = i+1;
				}
				
				this.values.add(temp);
			}
			jmid_1.setText(year+"��"+mon+"������۶�("+maxday+"��):"+max+unit);
			jmid_2.setText(year+"��"+mon+"��С���۶�("+minday+"��):"+min+unit);
			this.repaint();
		}else if(e.getSource()==jb2)
		{
			//�·����۶�
			cl.show(jcard, "1");
		}else if(e.getSource()==jb3)
		{
			//������۶�
			cl.show(jcard, "2");
			
		}else if(e.getSource()==jb4)
		{
			//�������۶�
			cl.show(jcard, "3");
		}
	}

}
