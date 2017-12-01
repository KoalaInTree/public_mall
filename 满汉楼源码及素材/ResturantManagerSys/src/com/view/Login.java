/**
 * �û���¼���档
 */

package com.view;

import java.awt.*;
import com.Tools.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

import com.model.UserModel;
import java.sql.*;
import java.util.*;

//��¼����.�̳�JDialog
public class Login extends JDialog implements ActionListener {
	
	public static void main(String []args)
	{
		Login l=new Login();
	}
	//�������
	JLabel jl1,jl2,jl3;
	JTextField jname;
	JPasswordField jpasswd;
	JButton jcon,jcancel;
	
	//���캯��
	public Login()
	{
		//�����ڲ����ò���
		this.setLayout(null);
		//�õ������ڵ�����
		Container ct=this.getContentPane();
		
		BackImg bimg=new BackImg();
		bimg.setBounds(0, 0, 500, 500);
		
		//�������
		jl1 = new JLabel("�������û�����");
		Font f1=new Font("����",Font.PLAIN, 20);
		jl1.setFont(f1);
		jl1.setBounds(90, 260, 160,30);
		
		jl2 = new JLabel("����Ա����");
		jl2.setFont(new Font("����" ,Font.PLAIN,14));
		jl2.setForeground(Color.red);
		jl2.setBounds(150, 290, 80,15);
		
		jl3 = new JLabel("�� �� �����룺");
		jl3.setFont(f1);
		jl3.setBounds(90, 330, 160,30);
		
		jname = new JTextField(10);
		jname.setBounds(235, 265, 160,30);
		
		jpasswd = new JPasswordField(10);
		jpasswd.setBounds(235, 330, 160,30);
		
		jcon = new JButton("��¼");
		jcon.setActionCommand("��¼");
		jcon.setBounds(140, 400, 80, 35);
		
		jcancel = new JButton("ȡ��");
		jcancel.setActionCommand("ȡ��");
		jcancel.setBounds(280, 400, 80, 35);
		
		//������
		ct.add(jl1);
		ct.add(jl2);
		ct.add(jl3);
		ct.add(jname);
		ct.add(jpasswd);
		ct.add(jcon);
		ct.add(jcancel);
		ct.add(bimg);

		//ע�����
		jcon.addActionListener(this);
		jcancel.addActionListener(this);
		
		this.setSize(500,500);
		this.setLocation(Tools.width/2-250,Tools.height/2-250);
		this.setUndecorated(true);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		
		
	}
	//�ڲ��࣬��ʾ����ͼƬ
	class BackImg extends JPanel
	{
		Image img=null;
		public BackImg()
		{
			try {
				img=ImageIO.read(new File("images\\login.png"));
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		public void paint(Graphics g)
		{
			g.drawImage(img, 0,0,500,500,this);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("��¼"))
		{
			String name = this.jname.getText().trim();
			String password = new String(jpasswd.getPassword());
			UserModel um=new UserModel();
			String[] info =um.checkUser(name,password);
			if(info!=null&&(info[0].equals("����")||info[0].equals("����")||info[0].equals("ϵͳ����Ա")))
			{
				Tools.name=info[1];
				Tools.position=info[0];
				new Window1();
				this.dispose();
			}else if(info==null){
				JOptionPane.showMessageDialog(this, "     �������");
				return;
			}
			
		}else if(e.getActionCommand().equals("ȡ��"))
		{
			this.dispose();
		}
		
	}
}
