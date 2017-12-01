/**
 * �޸��û�����
 */
package com.view;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.sql.*;
import javax.swing.*;
import com.Tools.*;
import com.model.*;
import com.db.*;
public class showAllInfo extends JDialog implements ActionListener{

	//��ȡ���캯����ֵ
	String sql;
	Vector<String> paras;
	SqlHelper sh;
	EmpModel em;
	
	Vector<String> colName;
	Vector<String> colValue;
	Vector<JPanel> jps;
	//��ô���JTextField������
	Vector<JTextField> jtextfs;
	//����JPanel����
	JPanel jp;
	JPanel jp_button;
	JButton  jb1,jcancel;
	
	//���������ڵĴ�С
	int width;
	int height;
	int field_size;
	
	//��ȡ������
	JPanel parent;
	String title;
	String falg;//�����б�������
	String insertSql;//ִ�и��µ�sql���
	public showAllInfo(String sql,Vector<String> paras,JPanel parent,String title)
	{
		this.parent=parent;
		this.sureParent();
		this.title=title;
		this.width=400;
		this.sql=sql;
		this.paras=paras;
		sh = new SqlHelper();
		jtextfs = new Vector<JTextField>();
		jps = new Vector<JPanel>();
		colName = new Vector<String>();
		colValue = new Vector<String>();
		ResultSet rs=sh.queryExecute(sql, paras);
		try {
			while(rs.next())
			{
				ResultSetMetaData rsmd=rs.getMetaData();
				
				for(int i=0;i<rsmd.getColumnCount();i++)
				{
					colName.add(rsmd.getColumnName(i+1));
					colValue.add(rs.getString(i+1));
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sh.close();
		}
		this.field_size=colName.size();
		this.height=100+25*this.field_size;
		for(int i=0;i<colName.size();i++)
		{
			JLabel colJlab=new JLabel(colName.get(i));
			JTextField jtField = new JTextField(15);
			jtField.setText(colValue.get(i));
			jtField.setEditable(false);
			jtextfs.add(jtField);
			JPanel p1=new JPanel();
			p1.add(colJlab);
			p1.add(jtField);
			jps.add(p1);
		}
		jp = new JPanel(new GridLayout(field_size+1, 1));
		for(int i=0;i<field_size;i++)
		{
			jp.add(jps.get(i));
		}
		jp_button =new JPanel();
		jb1 = new JButton("��Ҫ�޸�");
		jb1.setFont(Tools.f_14);
		jb1.addActionListener(this);
		jcancel = new JButton("ȷ�ϸ���");
		jcancel.setFont(Tools.f_14);
		jcancel.addActionListener(this);
		jp_button.add(jb1);
		jp_button.add(jcancel);
		jp.add(jp_button);
		
		this.add(jp);
		this.setSize(this.width,this.height);
		this.setTitle(title);
		this.setIconImage(new ImageIcon("images/title.gif").getImage());
		this.setLocation(Tools.width/2-width/2, Tools.height/2-height/2);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
	public void sureParent()
	{
		if(this.parent.getName().equals("���¹���"))
		{
			falg="���¹���";
			insertSql= "update users set userid=?,username=?,usersex=?,userage=?,userpassword=?,userposition=? where userid=?";
		}else if(this.parent.getName().equals("��½����"))
		{
			falg="��½����";
			insertSql= "update login set userid=?,username=?,userpassword=?,userposition=? where userid=?";
		}else if(this.parent.getName().equals("���׹���"))
		{
			falg="���׹���";
			insertSql= "update dishes set dishid=?,dishname=?,dishprice=?,dishpop=?,dishclass=? where  dishid=?";
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jcancel)
		{
			paras=new Vector<String>();
			for(int i=0;i<this.field_size;i++)
			{
				paras.add(this.jtextfs.get(i).getText().trim());
			}
			paras.add(this.jtextfs.get(0).getText().trim());
			em = new EmpModel();
			boolean res=em.updateInfo(insertSql, paras);
			if(res)
			{
				JOptionPane.showMessageDialog(this, "     ���³ɹ�");
				if(falg.equals("���¹���"))
				{
					((EmpInfo)this.parent).refresh();
				}else if(falg.equals("��½����"))
				{
					((LoginInfo)this.parent).refresh();
				}else if(falg.equals("���׹���"))
				{
					((DishesInfo)this.parent).refresh();
				}
				this.dispose();
			}else {
				JOptionPane.showMessageDialog(this, "     ����ʧ��");
			}
		}else if(e.getSource()==jb1)
		{
			for(int i=0;i<this.jtextfs.size();i++)
			{
				JTextField jtf=this.jtextfs.get(i);
				if(i>0){
					jtf.setEditable(true);
				}

			}
		}
		
	}
}

