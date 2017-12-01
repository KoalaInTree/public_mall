package com.view;

import javax.swing.*;

import com.Tools.Tools;
import com.model.CheckOutModel;
import com.model.OrderModel;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class CheckoutDialog extends JDialog implements ActionListener{

	//����λ�õ�JPanel
	JPanel jtop,jmiddle,jbottom;
	
	JLabel lab_1;
	JTextField jtf;
	JButton jselect;

	JTable jt;
	JScrollPane jsp;
	JLabel lab_sum;
	JPanel jp_sum;
	int sum;
	
	JButton jcon,jcancel;
	
	//���ݿ��������Ĵ���
	String menuid;
	CheckOutModel com;
	Vector<String> paras;
	
	//�����ڵĴ�С
	int width=600,height;
	//���ڵ���
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		CheckoutDialog cd = new CheckoutDialog();
//	}
	public void init()
	{
		//��������������
		jtop = new JPanel(new FlowLayout(FlowLayout.CENTER,20,10));
		lab_1 = new JLabel("���붩����(Ԥ����)");
		lab_1.setFont(Tools.f_14);
		jtf = new JTextField(12);
		jselect = new JButton("��ѯ");
		jselect.addActionListener(this);
		jselect.setFont(Tools.f_14);
		jtop.add(lab_1);
		jtop.add(jtf);
		jtop.add(jselect);
		
		//�м��˵�����
		jmiddle = new JPanel(new BorderLayout());
		jt = new JTable();
		jt.setRowHeight(25);
		jsp = new JScrollPane(jt);
		jsp.setBorder(BorderFactory.createTitledBorder(Tools.getTitleBorder("�� �� ��")));
		lab_sum = new JLabel();
		lab_sum.setFont(Tools.heightLight);
		jp_sum = new JPanel();
		jp_sum.add(lab_sum);
		jmiddle.add(jsp,"Center");
		
		//�ײ�״̬������
		jbottom = new JPanel(new FlowLayout(FlowLayout.CENTER,30,10));
		jcon = new JButton("����");
		jcon.setFont(Tools.f_14);
		jcon.addActionListener(this);
		jcancel  = new JButton("ȡ������");
		jcancel.setFont(Tools.f_14);
		jcancel.addActionListener(this);
		jbottom.add(jcon);
		jbottom.add(jcancel);
	}
	public CheckoutDialog()
	{
		//��ʼ�����
		this.init();
		
		//���ò���
		this.setLayout(new BorderLayout());
		//������
		this.add(jtop,"North");

		this.add(jbottom,"South");
		
		//���ô���
		height = 100+20*2;
		this.setVisible(true);
		this.setTitle("�������");
		this.setSize(width, height);
		this.setResizable(false);
		this.setIconImage(new ImageIcon("images/title.gif").getImage());
		this.setLocation(Tools.width/2-width/2, Tools.height/2-height/2);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jselect)
		{
			//��ѯ������  ��ʾ��˵�
			menuid = jtf.getText().trim();
			//���û�����붩����
			if(menuid.length()==0)
			{
				JOptionPane.showMessageDialog(this, "�������붩����");
			}else if(menuid.length()>0)
			{
				String sql = "select dishname ������dishprice �۸�,dishnumber ���� from menu where menuid = ?";
				paras = new Vector<String>();
				paras.add(menuid);
				com = new CheckOutModel();
				com.selectInfo(sql, paras);
				if(com.getRowCount()>0)
				{
					//�����Ŵ��� 
					//��ʾ�������޸Ĵ��ڴ�С
					jt.setModel(com);
					this.add(jmiddle,"Center");
					if(com.getColumnCount()>8)
					{
						height = 140+20*com.getColumnCount();
					}else if(com.getColumnCount()<=8)
					{
						height = 500;
					}
					//�����ܽ��
					String p;
					for(int i=0;i<com.getRowCount();i++)
					{
						p=com.getValueAt(i, 3).toString();
						sum+=Integer.parseInt(p.substring(0,p.length()-1));
					}
					lab_sum.setText("�ܼ�Ϊ"+sum+"Ԫ");
					jmiddle.add(jp_sum,"South");
					
					this.setSize(width, height);
					jsp.setPreferredSize(new Dimension(width-80, height-200));
					this.setLocation(Tools.width/2-width/2, Tools.height/2-height/2);
				}else {
					JOptionPane.showMessageDialog(this, "������"+menuid+"�����ڣ�����������");
					jtf.setText("");
					jtf.setFocusable(true);
				}
			}
		}
		else if(e.getSource()==jcon)
		{

			Boolean isInsert = false;
			//�����ܽ�������ˮ�� ���ڱ���ͳ��
			String sql = "insert into turnover (money) values(?)";
			paras = new Vector<String>();
			paras.add(sum+"");
			isInsert = com.updateInfo(sql, paras);
			if(isInsert)
			{
				JOptionPane.showMessageDialog(this, "����ɹ�,��ӭ�´ι���");
				this.dispose();
			}else{
				JOptionPane.showMessageDialog(this, "����ʧ��,���ٴ�ȷ��");
			}
		}else if(e.getSource()==jcancel)
		{
			this.dispose();
		}
	}
	

}
