/**
 * �����������¹���Ľ���
 */
package com.view;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import com.Tools.*;
import com.model.*;

public class EmpInfo extends JPanel implements ActionListener,MouseListener{
	JTable jt1;
	EmpModel em;
	JScrollPane jsp;
	JPanel jp3_1_top,jp3_1_bottom;
	JLabel jp3_1_top_jl,jp3_1_bottom_jl;
	JTextField jp3_1_top_jtf;
	JButton jp3_1_top_jb,jp3_1_bottom_jb1,jp3_1_bottom_jb2,jp3_1_bottom_jb3,jp3_1_bottom_jb4;
	String sql;
	Vector<String> paras;
	AddDialog addDialog;//������
	UpdateDialog ud;//�޸����
	public  EmpInfo()
	{
		//���µǼ����
		jp3_1_top = new JPanel();
		jp3_1_top.setPreferredSize(new Dimension(Tools.width, 40));
		jp3_1_top_jl = new JLabel("����������(Ա���Ż���ְλ): ");
		jp3_1_top_jl.setFont(Tools.f_14);
		jp3_1_top_jtf = new JTextField(15);
		jp3_1_top_jb = new JButton("ˢ��");
		jp3_1_top_jb.addActionListener(this);
		jp3_1_top_jb.setFont(Tools.f_12);
		jp3_1_top.add(jp3_1_top_jl);
		jp3_1_top.add(jp3_1_top_jtf);
		jp3_1_top.add(jp3_1_top_jb);
		
		jp3_1_bottom = new JPanel(new BorderLayout());
		jp3_1_bottom.setPreferredSize(new Dimension(Tools.width, 40));
		jp3_1_bottom_jl = new JLabel(" �� �� 0 �� �� ¼ ");
		jp3_1_bottom_jl.setFont(Tools.f_14);
		JPanel jp3_1_bottom_east =  new JPanel();
		jp3_1_bottom_jb1 = new JButton("��ϸ��Ϣ");
		jp3_1_bottom_jb1.setEnabled(false);
		jp3_1_bottom_jb1.addActionListener(this);
		jp3_1_bottom_jb1.setFont(Tools.f_12);
		jp3_1_bottom_jb2 = new JButton("���");
		jp3_1_bottom_jb2.addActionListener(this);
		jp3_1_bottom_jb2.setFont(Tools.f_12);
		jp3_1_bottom_jb3 = new JButton("�޸�");
		jp3_1_bottom_jb3.setEnabled(false);
		jp3_1_bottom_jb3.addActionListener(this);
		jp3_1_bottom_jb3.setFont(Tools.f_12);
		jp3_1_bottom_jb4 = new JButton("ɾ��");
		jp3_1_bottom_jb4.setEnabled(false);
		jp3_1_bottom_jb4.addActionListener(this);
		jp3_1_bottom_jb4.setFont(Tools.f_12);
		jp3_1_bottom_east.add(jp3_1_bottom_jb1);
		jp3_1_bottom_east.add(jp3_1_bottom_jb2);
		jp3_1_bottom_east.add(jp3_1_bottom_jb3);
		jp3_1_bottom_east.add(jp3_1_bottom_jb4);
		jp3_1_bottom.add(jp3_1_bottom_jl,BorderLayout.WEST);
		jp3_1_bottom.add(jp3_1_bottom_east,BorderLayout.EAST);
	
		jt1=new JTable(em);
		this.refresh();
		jt1.setRowHeight(22);
		jt1.addMouseListener(this);
		jsp = new JScrollPane(jt1);
		jsp.setBorder(BorderFactory.createTitledBorder(Tools.getTitleBorder("�� �� �� ��")));
		jp3_1_bottom_jl.setText(" �� �� "+em.getRowCount()+" �� �� ¼ ");
		
		this.setLayout(new BorderLayout());
		this.add(jp3_1_top,BorderLayout.NORTH);
		this.add(jp3_1_bottom,BorderLayout.SOUTH);
		this.add(jsp,BorderLayout.CENTER);
		this.setName("���¹���");
		this.setVisible(true);
	}
	
	//ˢ��model
	public void refresh()
	{
		em = new  EmpModel();
		sql = "select userid Ա���� ,username ����,usersex �Ա�,userposition ְλ from users where 1=? ";
		paras = new Vector<String>();
		paras.add("1");
		em.selectInfo(sql,paras);
		jt1.setModel(em);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//ˢ�°�ť�ļ�������
		if(e.getSource()==this.jp3_1_top_jb)
		{
			String id=this.jp3_1_top_jtf.getText().trim();
			if(id.length()>0)
			{
				sql = "select userid Ա���� ,username ����,usersex �Ա�,userposition ְλ from users where userid=? or username like ? or userposition like ?";
				paras = new Vector<String>();
				paras.add(id);
				paras.add(id);
				paras.add(id);
				em=new EmpModel();
				em.selectInfo(sql , paras);
				jt1.setModel(em);
				jp3_1_top_jtf.setText("");
			}else{
				this.refresh();
			}
			jp3_1_bottom_jl.setText(" �� �� "+em.getRowCount()+" �� �� ¼ ");
		}else if(e.getSource()==this.jp3_1_bottom_jb2)
		{
			//��Ӱ�ť�ļ�������
			sql = "insert into users values (?,?,?,?,?,?)";
			paras = new Vector<String>();
			paras.add("Ա����");
			paras.add("��  ��");
			paras.add("��  ��");
			paras.add("��  ��");
			paras.add("��  ��");
			paras.add("ְ  λ");
			addDialog=new AddDialog(sql, paras,this,"�� �� �� ��");
			return;
		}else if(e.getSource()==this.jp3_1_bottom_jb4)
		{
			//ɾ����ť�ļ�������
			int selectIndex=this.jt1.getSelectedRow();
			paras = new Vector<String>();
			paras.add((String) this.jt1.getModel().getValueAt(selectIndex, 0));
			sql = "delete from users where userid=?";
			em=new EmpModel();
			em.updateInfo(sql, paras);
			this.refresh();
		}else if(e.getSource()==this.jp3_1_bottom_jb3)
		{
			//�޸İ�ť�ļ�������
			int selectIndex=this.jt1.getSelectedRow();
			if(selectIndex>-1)
			{
				String id = (String) this.jt1.getModel().getValueAt(selectIndex, 0);
				sql = "select userid Ա���� ,username ����,usersex �Ա�,userage ����,userpassword ����,userposition ְλ from users where userid=?";
				paras = new Vector<String>();
				paras.add(id);
				ud = new UpdateDialog(sql,paras,this,"�� �� �� ��");
			}else if (selectIndex==-1)
			{
				JOptionPane.showMessageDialog(this, "��ѡ����Ҫ�޸ĵ��û�");
			}
		}else if(e.getSource()==this.jp3_1_bottom_jb1)
		{
			//��ϸ��Ϣ��ť�ļ�������
			int selectIndex=this.jt1.getSelectedRow();
			if(selectIndex>-1)
			{
				String id = (String) this.jt1.getModel().getValueAt(selectIndex, 0);
				sql = "select userid Ա���� ,username ����,usersex �Ա�,userage ����,userpassword ����,userposition ְλ from users where userid=?";
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
		if(e.getSource()==this.jt1)
		{
			jp3_1_bottom_jb1.setEnabled(true);
			jp3_1_bottom_jb3.setEnabled(true);
			jp3_1_bottom_jb4.setEnabled(true);
			/**
			 * ��ȡ��ǰ���������
			 */
//			System.out.println(jt1.getSelectedRow());
//			System.out.println(jt1.getModel().getValueAt(jt1.getSelectedRow(), 0));
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
