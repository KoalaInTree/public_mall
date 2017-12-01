package com.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import com.model.ReserveModel;

public class UnsubscribeDialog extends JDialog implements ActionListener {
	
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
	JPanel jp,jp_top;
	JPanel jp_button;
	ReserveModel om;
	JFrame parent;
	String title;
	
	//��ѯ���
	JButton jbSelectInfo;
	JPanel jp_isexist;
	JLabel jl_isexist;
	public UnsubscribeDialog(String sql, Vector<String> field, JFrame parent ,String title )
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
		this.width=450;
		this.height=100+25*this.field.size();
		this.field_size=field.size();
		//�������
		jb1 = new JButton("ȷ��ȡ��");
		jb1.setFont(Tools.f_14);
		jb1.setEnabled(false);
		jcancel = new JButton("�˳�");
		jcancel.setFont(Tools.f_14);
		jbSelectInfo = new JButton("��ѯ");
		jp_isexist = new JPanel();
		jbSelectInfo.setFont(Tools.f_14);
		jl_isexist = new JLabel("");
		jl_isexist.setFont(Tools.f_14);
		jp_button = new JPanel();
		jp_button.add(jb1);
		jp_button.add(jcancel);
		jps=new Vector<JPanel>();
		jtfs=new Vector<JTextField>();
		//ע�����
		jb1.addActionListener(this);
		jcancel.addActionListener(this);
		jbSelectInfo.addActionListener(this);
		
		jp_top = new JPanel();
		JLabel jp_top_j1 = new JLabel(field.get(0));
		jp_top_j1.setFont(Tools.f_14);
		JTextField jp_top_jtf = new JTextField(15);
		jtfs.add(jp_top_jtf);
		
		//������
		jp_isexist.add(jl_isexist);
		jp_top.add(jp_top_j1);
		jp_top.add(jp_top_jtf);
		jp_top.add(jbSelectInfo);
		jp = new JPanel(new GridLayout(field_size+2, 1));
		
		jp.add(jp_top);
		jp.add(jp_isexist);
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
			om = new ReserveModel();
			boolean res=om.updateInfo(sql, paras);
			if(res)
			{
				JOptionPane.showMessageDialog(this, "     ȡ���ɹ�");
				this.dispose();
			}else {
				JOptionPane.showMessageDialog(this, "     ȡ��ʧ��");
			}
		}else if(e.getSource()==this.jbSelectInfo)
		{
			String sql = "select reservenumber from reserve where reservenumber=?";
			Vector<String> paras = new Vector<String>();
			paras.add(this.jtfs.get(0).getText().trim());
			om = new ReserveModel();
			om.selectInfo(sql, paras);
			if(om.getRowCount()>0)
			{
				this.jl_isexist.setText("��Ŵ��ڣ�����ɾ��");
				jb1.setEnabled(true);
			}else {
				this.jl_isexist.setText("��Ų�����");
			}
		}
	}
}
