package com.view;

import java.util.*;
import javax.swing.*;

import com.Tools.Tools;
import com.db.SqlHelper;
import com.model.EmpModel;
import com.model.OrderModel;
import com.model.ReserveModel;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ShowOrderDishesDialog extends JDialog implements ActionListener,MouseListener{

	Hashtable<String,Vector<Integer>> ht;
	//��ȡ���캯����ֵ
	String sql;
	Vector<String> paras;
	SqlHelper sh;
	OrderModel om;
	
	Vector<String> colName;
	Vector<String> colValue;
	Vector<JPanel> jps;
	//��ô���JTextField������
	Vector<JTextField> jtextfs1,jtextfs2;
	Vector<String> dishnames;
	//����JPanel����
	JPanel jp;
	JPanel jp_button;
	JButton  jb1,jb2,jcancel;
	
	//���������ڵĴ�С
	int width;
	int height;
	int field_size;
	JLabel lab_sum; //�������ܼ۸�
	JTextField menuid;
	String title;
	String insertSql;//ִ�и��µ�sql���
	int sum;//�µ����ܽ��
	JFrame parent;
	Vector<Vector<String>> BatchUpdate;
	
	public ShowOrderDishesDialog(String sql,Hashtable<String,Vector<Integer>> ht,JFrame parent)
	{
		this.parent=parent;
		this.width=500;
		this.sql=sql;
		this.ht=ht;
		int j=0;
		field_size = ht.size();
		jtextfs1 = new Vector<JTextField>();
		jtextfs2 = new Vector<JTextField>();
		dishnames = new Vector<String>();
		jps = new Vector<JPanel>();
		JPanel jp2 = new JPanel();
		menuid = new JTextField(28);
		menuid.setText("��û�е��ţ��µ����Զ�����");
		menuid.setEditable(false);
		menuid.setFont(Tools.f_12);
		menuid.addMouseListener(this);
		JLabel lab_id = new JLabel("������");
		lab_id.setFont(Tools.f_14);
		JPanel jp_id=new JPanel();
		jp_id.add(lab_id);
		jp_id.add(menuid);
		jp2.setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
		jp2.add(new JLabel("����"));
		jp2.add(new JLabel("����"));
		jp2.add(new JLabel("����"));
		
		jps.add(jp_id);
		jps.add(jp2);
		for(Iterator it = ht.keySet().iterator(); it.hasNext();){   
	        //��ht��ȡ  
	        String dishname = (String)it.next();
	        dishnames.add(dishname);
			JLabel colJlab=new JLabel(dishname);
			JTextField jtField1 = new JTextField(10);
			jtField1.setText(ht.get(dishname).get(0).toString());
			jtField1.setEditable(false);
			JTextField jtField2 = new JTextField(10);
			jtField2.setText(ht.get(dishname).get(1).toString());
			jtextfs1.add(jtField1);
			jtextfs2.add(jtField2);
			JPanel p1=new JPanel();
			p1.add(colJlab);
			p1.add(jtField1);
			p1.add(jtField2);
//			JLabel lab_cancel = new JLabel(new ImageIcon("images/cancel.png"));
//			lab_cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
//			lab_cancel.addMouseListener(this);
//			lab_cancel.setName((j++)+"");
//			
//			p1.add(lab_cancel);
			jps.add(p1);
		}
		jp = new JPanel(new GridLayout(field_size+4, 1)); //����һ��  ��ťһ��  �ܼ�һ��
		for(int i=0;i<jps.size();i++)
		{
			jp.add(jps.get(i));
		}
		JPanel jp_sum = new JPanel();
		lab_sum = new JLabel();
		jp_sum.add(lab_sum);
		jp.add(jp_sum);
		jp_button =new JPanel();
		jb2 = new JButton("�鿴�ܽ��");
		jb2.setFont(Tools.f_14);
		jb2.addActionListener(this);
		jb1 = new JButton("�µ�");
		jb1.setEnabled(false);
		jb1.setFont(Tools.f_14);
		jb1.addActionListener(this);
		jcancel = new JButton("�����µ�");
		jcancel.setFont(Tools.f_14);
		jcancel.addActionListener(this);
		jp_button.add(jb2);
		jp_button.add(jb1);
		jp_button.add(jcancel);
		jp.add(jp_button);
		
		this.height=100+25*jp.getComponentCount();
		
		this.add(jp);
		this.setSize(this.width,this.height);
		this.setTitle(title);
		this.setIconImage(new ImageIcon("images/title.gif").getImage());
		this.setLocation(Tools.width/2-width/2, Tools.height/2-height/2);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==jcancel)
			{
				this.dispose();
			}else if(e.getSource()==jb1)
			{
				String sql1 = "update dishes set dishpop=dishpop+? where dishname like ?";
				String sql2 = "insert into menu (dishnumber,dishname,dishprice��menuid) values(?,?,?,?)";
				om = new OrderModel();
				String reservenum_seq="";
				Boolean isInsert=false;
				for(int i=0;i<jtextfs2.size();i++)
				{
					Vector<String> paras = new Vector<String>();
					//����µ��˵ĸ����˵�����
					paras.add(jtextfs2.get(i).getText());
					//����µ��˵ĸ����˵�����
					paras.add(dishnames.get(i));
					//ִ�и��²�Ʒ����
					om.updateInfo(sql1, paras);
					//����µ��˵ĸ����˵ļ۸�
					paras.add(jtextfs1.get(i).getText());
					if(menuid.getText().trim().equals("")||menuid.getText().equals("��û�е��ţ��µ����Զ�����"))
					{
						if(reservenum_seq.equals(""))
						{
							//�Զ�����һ��������
							String getID = "select reservenumber_seq.nextval from dual where 1=?";
							Vector<String> resid = new Vector<String>();
							resid.add("1");
							OrderModel getIdOM = new OrderModel();
							getIdOM.selectInfo(getID, resid);
							reservenum_seq=(String) getIdOM.getValueAt(0, 0);
							paras.add(reservenum_seq);
						}else{
							paras.add(reservenum_seq);
						}
					}else{
						//��ö�����
						reservenum_seq=menuid.getText().trim();
						paras.add(reservenum_seq);
						
					}
					//ִ�в���'��˵�'
					isInsert = om.updateInfo(sql2, paras);
				}
				
				if(!isInsert)
				{
					JOptionPane.showMessageDialog(this, "   �µ�ʧ��");
				}
				else{
					JOptionPane.showMessageDialog(this, "�µ��ɹ�,������Ϊ"+reservenum_seq+"��");
					this.dispose();
					parent.dispose();
				}
			}
			else if(e.getSource()==jb2)
			{

				for(int i=0;i<jtextfs1.size();i++)
				{
					sum+=Integer.parseInt(jtextfs1.get(i).getText())*Integer.parseInt(jtextfs2.get(i).getText());
				}
				lab_sum.setText("�������ܼ۸�Ϊ��"+sum+"Ԫ");
				jb1.setEnabled(true);
			}
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==menuid)
			{
				menuid.setEditable(true);
				menuid.setText("");
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