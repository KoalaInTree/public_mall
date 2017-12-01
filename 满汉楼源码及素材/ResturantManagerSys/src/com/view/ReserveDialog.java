package com.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.Tools.Tools;
import com.model.EmpModel;
import com.model.ReserveModel;

public class ReserveDialog extends JDialog implements ActionListener {
	
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
	ReserveModel om;
	JFrame parent;
	String title;
	public ReserveDialog(String sql, Vector<String> field, JFrame parent ,String title )
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
		jb1 = new JButton("Ԥ��");
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
			if(i==0)
			{
				jtf.setText("������ȷ�Ϻ��Զ�����");
				jtf.setDisabledTextColor(Color.gray);
				jtf.setEditable(false);
			}
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
			String reservenum_seq="";
			if(true)
			{
				String sql = "select reservenumber_seq.nextval from dual where 1=?";
				Vector<String> paras=new Vector<String>();
				paras.add("1");
				ReserveModel om2 = new ReserveModel();
				om2.selectInfo(sql, paras);
				reservenum_seq=(String) om2.getValueAt(0, 0);
			}
			paras=new Vector<String>();
			paras.add(reservenum_seq);
			for(int i=1;i<this.field_size;i++)
			{
				paras.add(this.jtfs.get(i).getText());
			}
			om = new ReserveModel();
			boolean res=om.updateInfo(sql, paras);
			if(res)
			{
				JOptionPane.showMessageDialog(this, " Ԥ���ɹ�"+",���Ϊ��"+reservenum_seq);
				this.dispose();
			}else {
				JOptionPane.showMessageDialog(this, "     ���ʧ��");
			}
		}
	}
}
