/**
 * ͨ����ӶԻ���塣 ��������ֶε�����,������д�ֶε�����
 */
package com.view;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import com.Tools.*;
import com.model.*;

public class AddDialog extends JDialog implements ActionListener {
	
	//��ȡ�ֶ�������sql���
	Vector<String> field;
	String sql;
	//������ģ�͵�����
	Vector<String> paras;
	int width;
	int height;
	int field_size;
	JButton jb1,jcancel;
	//��ô���JPanel������
	Vector<JPanel> jps;
	//��ô���JTextField������
	Vector<JTextField> jtfs;
	//����JPanel����
	JPanel jp;
	JPanel jp_button;
	EmpModel em;
	JPanel parent;
	String title;
	public AddDialog(String sql, Vector<String> field, JPanel parent ,String title )
	{
		this.parent=parent;
		this.field=field;
		this.sql=sql;
		this.title=title;
		
		//��ʼ�����
		this.initDialog();
		
		
		this.add(jp);
		this.setSize(width,height);
		this.setTitle(title);
		this.setIconImage(new ImageIcon("images/title.gif").getImage());
		this.setLocation(Tools.width/2-width/2, Tools.height/2-height/2);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
	public void initDialog()
	{
		this.width=400;
		this.height=100+25*this.field.size();
		this.field_size=field.size();
		//�������
		jb1 = new JButton("���");
		jcancel = new JButton("ȡ��");
		jp_button = new JPanel();
		jp_button.add(jb1);
		jp_button.add(jcancel);
		jps=new Vector<JPanel>();
		jtfs=new Vector<JTextField>();
		//ע�����
		jb1.addActionListener(this);
		jcancel.addActionListener(this);
		
		
		for(int i=0;i<field_size;i++)
		{
			JLabel jl=new JLabel(field.get(i));
			jl.setFont(Tools.f_14);
			JTextField jtf=new JTextField(15);
			JPanel p1=new JPanel();
			p1.add(jl);
			p1.add(jtf);
			jtfs.add(jtf);
			jps.add(p1);
		}
		
		jp = new JPanel(new GridLayout(field_size+1, 1));
		for(int i=0;i<field_size;i++)
		{
			jp.add(jps.get(i));
		}
		jp.add(jp_button);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.jcancel)
		{
			this.dispose();
		}else if(e.getSource()==this.jb1)
		{
			paras=new Vector<String>();
			for(int i=0;i<this.field_size;i++)
			{
				paras.add(this.jtfs.get(i).getText().trim());
			}
			em = new EmpModel();
			boolean res=em.updateInfo(sql, paras);
			if(res)
			{
				JOptionPane.showMessageDialog(this, "     ��ӳɹ�");
				if(this.parent.getName().equals("���¹���"))
				{
					((EmpInfo)this.parent).refresh();
				}else if(this.parent.getName().equals("��½����"))
				{
					((LoginInfo)this.parent).refresh();
				}else if(this.parent.getName().equals("���׹���"))
				{
					((DishesInfo)this.parent).refresh();
				}
				this.dispose();
			}else {
				JOptionPane.showMessageDialog(this, "     ���ʧ��");
			}
		}
	}
}
