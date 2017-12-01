package com.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import com.Tools.*;
import com.model.*;

public class DishesInfo extends JPanel implements ActionListener,MouseListener {
	JTable jt3;
	DishModel dm;
	JScrollPane jsp;
	JPanel jp3_3_top,jp3_3_bottom;
	JLabel jp3_3_top_jl,jp3_3_bottom_jl;
	JTextField jp3_3_top_jtf;
	JButton jp3_3_top_jb,jp3_3_bottom_jb1,jp3_3_bottom_jb2,jp3_3_bottom_jb3,jp3_3_bottom_jb4;
	String sql;
	Vector<String> paras;
	AddDialog addDialog;//��Ӳ�Ʒ���
	UpdateDialog ud;//�޸Ĳ�Ʒ���
	public DishesInfo()
	{
		//���׹������
		jp3_3_top = new JPanel();
		jp3_3_top.setPreferredSize(new Dimension(Tools.width, 40));
		jp3_3_top_jl = new JLabel("���������(��Ʒ��Ż��߲�Ʒ���): ");
		jp3_3_top_jl.setFont(Tools.f_14);
		jp3_3_top_jtf = new JTextField(15);
		jp3_3_top_jb = new JButton("ˢ��");
		jp3_3_top_jb.addActionListener(this);
		jp3_3_top_jb.setFont(Tools.f_12);
		jp3_3_top.add(jp3_3_top_jl);
		jp3_3_top.add(jp3_3_top_jtf);
		jp3_3_top.add(jp3_3_top_jb);
		
		jp3_3_bottom = new JPanel(new BorderLayout());
		jp3_3_bottom.setPreferredSize(new Dimension(Tools.width, 40));
		jp3_3_bottom_jl = new JLabel(" �� �� 0 �� �� ¼ ");
		jp3_3_bottom_jl.setFont(Tools.f_14);
		JPanel jp3_3_bottom_east =  new JPanel();
		jp3_3_bottom_jb1 = new JButton("��ϸ��Ϣ");
		jp3_3_bottom_jb1.setEnabled(false);
		jp3_3_bottom_jb1.addActionListener(this);
		jp3_3_bottom_jb1.setFont(Tools.f_12);
		jp3_3_bottom_jb2 = new JButton("���");
		jp3_3_bottom_jb2.addActionListener(this);
		jp3_3_bottom_jb2.setFont(Tools.f_12);
		jp3_3_bottom_jb3 = new JButton("�޸�");
		jp3_3_bottom_jb3.setEnabled(false);
		jp3_3_bottom_jb3.addActionListener(this);
		jp3_3_bottom_jb3.setFont(Tools.f_12);
		jp3_3_bottom_jb4 = new JButton("ɾ��");
		jp3_3_bottom_jb4.setEnabled(false);
		jp3_3_bottom_jb4.addActionListener(this);
		jp3_3_bottom_jb4.setFont(Tools.f_12);
		jp3_3_bottom_east.add(jp3_3_bottom_jb1);
		jp3_3_bottom_east.add(jp3_3_bottom_jb2);
		jp3_3_bottom_east.add(jp3_3_bottom_jb3);
		jp3_3_bottom_east.add(jp3_3_bottom_jb4);
		jp3_3_bottom.add(jp3_3_bottom_jl,BorderLayout.WEST);
		jp3_3_bottom.add(jp3_3_bottom_east,BorderLayout.EAST);
	
		jt3=new JTable(dm);
		this.refresh();
		jt3.setRowHeight(22);
		jt3.addMouseListener(this);
		jsp = new JScrollPane(jt3);
		jsp.setBorder(BorderFactory.createTitledBorder(Tools.getTitleBorder("�� �� �� ��")));
		jp3_3_bottom_jl.setText(" �� �� "+dm.getRowCount()+" �� �� ¼ ");
		
		this.setLayout(new BorderLayout());
		this.add(jp3_3_top,BorderLayout.NORTH);
		this.add(jp3_3_bottom,BorderLayout.SOUTH);
		this.add(jsp,BorderLayout.CENTER);
		this.setName("���׹���");
		this.setVisible(true);
	}
	
	//ˢ��model
	public void refresh()
	{
		dm = new  DishModel();
		sql = "select dishid ��Ʒ��� ,dishname ��Ʒ����,dishprice ��Ʒ�۸�,dishpop ��Ʒ����,dishclass ��Ʒ��� from dishes where 1=? ";
		paras = new Vector<String>();
		paras.add("1");
		dm.selectInfo(sql,paras);
		jt3.setModel(dm);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//ˢ�°�ť�ļ�������
		if(e.getSource()==this.jp3_3_top_jb)
		{
			String id=this.jp3_3_top_jtf.getText().trim();
			if(id.length()>0)
			{
				sql = "select dishid ��Ʒ��� ,dishname ��Ʒ����,dishprice ��Ʒ�۸�,dishpop ��Ʒ����,dishclass ��Ʒ��� from dishes where  dishid=? or dishname like ? or dishclass like ?";
				paras = new Vector<String>();
				paras.add(id);
				paras.add(id);
				paras.add(id);
				dm=new DishModel();
				dm.selectInfo(sql , paras);
				jt3.setModel(dm);
				jp3_3_top_jtf.setText("");
			}else{
				this.refresh();
			}
			jp3_3_bottom_jl.setText(" �� �� "+dm.getRowCount()+" �� �� ¼ ");
		}else if(e.getSource()==this.jp3_3_bottom_jb2)
		{
			//��Ӱ�ť�ļ�������
			sql = "insert into users values (?,?,?,?,?)";
			paras = new Vector<String>();
			paras.add("��Ʒ���");
			paras.add("��Ʒ����");
			paras.add("��Ʒ�۸�");
			paras.add("��Ʒ����");
			paras.add("��Ʒ���");

			addDialog=new AddDialog(sql, paras,this,"�� �� �� Ʒ");
			return;
		}else if(e.getSource()==this.jp3_3_bottom_jb4)
		{
			//ɾ����ť�ļ�������
			int selectIndex=this.jt3.getSelectedRow();
			paras = new Vector<String>();
			paras.add((String) this.jt3.getModel().getValueAt(selectIndex, 1));
			sql = "delete from dishes where dishname like ?";
			dm=new DishModel();
			dm.updateInfo(sql, paras);
		}else if(e.getSource()==this.jp3_3_bottom_jb3)
		{
			//�޸İ�ť�ļ�������
			int selectIndex=this.jt3.getSelectedRow();
			if(selectIndex>-1)
			{
				String name = (String) this.jt3.getModel().getValueAt(selectIndex, 1);
				sql = "select dishid ��Ʒ��� ,dishname ��Ʒ����,dishprice ��Ʒ�۸�,dishpop ��Ʒ����,dishclass ��Ʒ��� from dishes where  dishname=?";
				paras = new Vector<String>();
				paras.add(name);
				ud = new UpdateDialog(sql,paras,this,"�� �� �� Ʒ");
			}else if (selectIndex==-1)
			{
				JOptionPane.showMessageDialog(this, "��ѡ����Ҫ�޸ĵĲ�Ʒ");
			}
		}else if(e.getSource()==this.jp3_3_bottom_jb1)
		{
			//��ϸ��Ϣ��ť�ļ�������
			int selectIndex=this.jt3.getSelectedRow();
			if(selectIndex>-1)
			{
				String name = (String) this.jt3.getModel().getValueAt(selectIndex, 1);
				sql = "select dishid ��Ʒ��� ,dishname ��Ʒ����,dishprice ��Ʒ�۸�,dishpop ��Ʒ����,dishclass ��Ʒ��� from dishes where  dishname=?";
				paras = new Vector<String>();
				paras.add(name);
				showAllInfo sa = new showAllInfo(sql,paras,this,"�� Ʒ �� ϸ �� Ϣ");
			}else if (selectIndex==-1)
			{
				JOptionPane.showMessageDialog(this, "��ѡ����Ҫ��ʾ�Ĳ�Ʒ");
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.jt3)
		{
			jp3_3_bottom_jb1.setEnabled(true);
			jp3_3_bottom_jb3.setEnabled(true);
			jp3_3_bottom_jb4.setEnabled(true);
			/**
			 * ��ȡ��ǰ���������
			 */
//					System.out.println(jt3.getSelectedRow());
//					System.out.println(jt3.getModel().getValueAt(jt3.getSelectedRow(), 0));
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
