package com.view;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import com.Tools.*;
import com.model.*;

public class LoginInfo extends JPanel implements ActionListener,MouseListener {

	JTable jt2;
	UserModel um;
	JScrollPane jsp;
	JPanel jp3_2_top,jp3_2_bottom;
	JLabel jp3_2_top_jl,jp3_2_bottom_jl;
	JTextField jp3_2_top_jtf;
	JButton jp3_2_top_jb,jp3_2_bottom_jb1,jp3_2_bottom_jb2,jp3_2_bottom_jb3,jp3_2_bottom_jb4;
	String sql;
	Vector<String> paras;
	AddDialog addDialog;//������
	UpdateDialog ud;//�޸����
	public LoginInfo()
	{
		//��½�������
		jp3_2_top = new JPanel();
		jp3_2_top.setPreferredSize(new Dimension(Tools.width, 40));
		jp3_2_top_jl = new JLabel("����������(Ա���Ż���ְλ): ");
		jp3_2_top_jl.setFont(Tools.f_14);
		jp3_2_top_jtf = new JTextField(15);
		jp3_2_top_jb = new JButton("ˢ��");
		jp3_2_top_jb.addActionListener(this);
		jp3_2_top_jb.setFont(Tools.f_12);
		jp3_2_top.add(jp3_2_top_jl);
		jp3_2_top.add(jp3_2_top_jtf);
		jp3_2_top.add(jp3_2_top_jb);
		
		jp3_2_bottom = new JPanel(new BorderLayout());
		jp3_2_bottom.setPreferredSize(new Dimension(Tools.width, 40));
		jp3_2_bottom_jl = new JLabel(" �� �� 0 �� �� ¼ ");
		jp3_2_bottom_jl.setFont(Tools.f_14);
		JPanel jp3_2_bottom_east =  new JPanel();
		jp3_2_bottom_jb1 = new JButton("��ϸ��Ϣ");
		jp3_2_bottom_jb1.setEnabled(false);
		jp3_2_bottom_jb1.addActionListener(this);
		jp3_2_bottom_jb1.setFont(Tools.f_12);
		jp3_2_bottom_jb2 = new JButton("���");
		jp3_2_bottom_jb2.addActionListener(this);
		jp3_2_bottom_jb2.setFont(Tools.f_12);
		jp3_2_bottom_jb3 = new JButton("�޸�");
		jp3_2_bottom_jb3.setEnabled(false);
		jp3_2_bottom_jb3.addActionListener(this);
		jp3_2_bottom_jb3.setFont(Tools.f_12);
		jp3_2_bottom_jb4 = new JButton("ɾ��");
		jp3_2_bottom_jb4.setEnabled(false);
		jp3_2_bottom_jb4.addActionListener(this);
		jp3_2_bottom_jb4.setFont(Tools.f_12);
		jp3_2_bottom_east.add(jp3_2_bottom_jb1);
		jp3_2_bottom_east.add(jp3_2_bottom_jb2);
		jp3_2_bottom_east.add(jp3_2_bottom_jb3);
		jp3_2_bottom_east.add(jp3_2_bottom_jb4);
		jp3_2_bottom.add(jp3_2_bottom_jl,BorderLayout.WEST);
		jp3_2_bottom.add(jp3_2_bottom_east,BorderLayout.EAST);
	
		jt2=new JTable(um);
		this.refresh();
		jt2.setRowHeight(22);
		jt2.addMouseListener(this);
		jsp = new JScrollPane(jt2);
		jsp.setBorder(BorderFactory.createTitledBorder(Tools.getTitleBorder("�� ½ �� ��")));
		jp3_2_bottom_jl.setText(" �� �� "+um.getRowCount()+" �� �� ¼ ");
		
		this.setLayout(new BorderLayout());
		this.add(jp3_2_top,BorderLayout.NORTH);
		this.add(jp3_2_bottom,BorderLayout.SOUTH);
		this.add(jsp,BorderLayout.CENTER);
		this.setName("��½����");
		this.setVisible(true);
	}
	
	//ˢ��model
	public void refresh()
	{
		um = new  UserModel();
		sql = "select userid Ա���� ,username ����,userposition ְλ from login where 1=?  ";
		paras = new Vector<String>();
		paras.add("1");
		um.selectInfo(sql,paras);
		jt2.setModel(um);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//ˢ�°�ť�ļ�������
		if(e.getSource()==this.jp3_2_top_jb)
		{
			String id=this.jp3_2_top_jtf.getText().trim();
			if(id.length()>0)
			{
				sql = "select userid Ա���� ,username ����,userposition ְλ from login where userid=? or username like ? or userposition like ?";
				paras = new Vector<String>();
				paras.add(id);
				paras.add(id);
				paras.add(id);
				um=new UserModel();
				um.selectInfo(sql , paras);
				jt2.setModel(um);
				jp3_2_top_jtf.setText("");
			}else{
				this.refresh();
			}
			jp3_2_bottom_jl.setText(" �� �� "+um.getRowCount()+" �� �� ¼ ");
		}else if(e.getSource()==this.jp3_2_bottom_jb2)
		{
			//��Ӱ�ť�ļ�������
			sql = "insert into login values (?,?,?,?)";
			paras = new Vector<String>();
			paras.add("Ա����");
			paras.add("�� ��");
			paras.add("�� ��");
			paras.add("ְλ");

			addDialog=new AddDialog(sql, paras,this,"�� �� �� ��");
			return;
		}else if(e.getSource()==this.jp3_2_bottom_jb4)
		{
			//ɾ����ť�ļ�������
			int selectIndex=this.jt2.getSelectedRow();
			paras = new Vector<String>();
			paras.add((String) this.jt2.getModel().getValueAt(selectIndex, 0));
			sql = "delete from login where dishname like ?";
			um=new UserModel();
			um.updateInfo(sql, paras);
		}else if(e.getSource()==this.jp3_2_bottom_jb3)
		{
			//�޸İ�ť�ļ�������
			int selectIndex=this.jt2.getSelectedRow();
			if(selectIndex>-1)
			{
				String id = (String) this.jt2.getModel().getValueAt(selectIndex, 0);
				sql = "select userid Ա���� ,username ����,userpassword ����,userposition ְλ from login where userid=? ";
				paras = new Vector<String>();
				paras.add(id);
				ud = new UpdateDialog(sql,paras,this,"�� �� �� ��");
			}else if (selectIndex==-1)
			{
				JOptionPane.showMessageDialog(this, "��ѡ����Ҫ�޸ĵ��û�");
			}
		}else if(e.getSource()==this.jp3_2_bottom_jb1)
		{
			//��ϸ��Ϣ��ť�ļ�������
			int selectIndex=this.jt2.getSelectedRow();
			if(selectIndex>-1)
			{
				String id = (String) this.jt2.getModel().getValueAt(selectIndex, 0);
				sql = "select userid Ա���� ,username ����,userpassword ����,userposition ְλ from login where userid=?";
				paras = new Vector<String>();
				paras.add(id);
				showAllInfo sa = new showAllInfo(sql,paras,this,"�� �� �� ϸ �� Ϣ");
			}else if (selectIndex==-1)
			{
				JOptionPane.showMessageDialog(this, "��ѡ����Ҫ��ʾ���û�");
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.jt2)
		{
			jp3_2_bottom_jb1.setEnabled(true);
			jp3_2_bottom_jb3.setEnabled(true);
			jp3_2_bottom_jb4.setEnabled(true);
			/**
			 * ��ȡ��ǰ���������
			 */
//					System.out.println(jt2.getSelectedRow());
//					System.out.println(jt2.getModel().getValueAt(jt2.getSelectedRow(), 0));
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
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
