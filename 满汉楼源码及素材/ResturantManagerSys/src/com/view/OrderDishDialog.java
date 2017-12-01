/**
 * ��˽���
 */

package com.view;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;

import com.Tools.Tools;
import com.model.OrderModel;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class OrderDishDialog extends JFrame implements MouseListener,ActionListener{
	
	JTable jt;//�˵���
	JLabel jlab_logo,j_Lab,jtip,j_select;
	JTextField jtf;
	JPanel jtop,jmain,jbottom;
	JSplitPane jsp;
	JPanel j_left,j_right;
	JLabel jleft_lab1,jleft_lab2,jleft_lab3,jleft_lab4,jleft_lab5,jleft_lab6,jleft_lab7,jleft_lab8;
	JScrollPane jscroll;
	Vector<JLabel> jleft_labs;
	Vector<String> paras;
	OrderModel om1,om2,om3,om4,om5,om6; //�ֱ���ʾ�����
	Hashtable<String,Vector<Integer>> ht;
	Vector<Integer> getJSelectTableRowInfo;
	JButton jDishes,jcon,jcancel;
	
	public static void main(String []args)
	{
		OrderDishDialog odd = new OrderDishDialog();
		
	}
	
	//����Ҫ�ı�ģ�;��г�ʼ��
	public void initModel()
	{
		om1 = new OrderModel();
		om2 = new OrderModel();
		om3 = new OrderModel();
		om4 = new OrderModel();
		om5 = new OrderModel();
		om6 = new OrderModel();
		
		this.initDishClassModel("%", om1);
		this.initDishClassModel("��������", om2);
		this.initDishClassModel("�����Ȳ�", om3);
		this.initDishClassModel("ʱ���߲�", om4);
		this.initDishClassModel("͸ζ����", om5);
		this.initDishClassModel("��ʳ����", om6);
	}
	
	//�ñ�ģ����ʾ���Բ�Ʒ��������
	public void initDishClassModel(String filed,OrderModel om)
	{
		String sql = "select dishid ���,dishname ����,dishprice �۸�,dishpop ���� from dishes where dishclass like ?";
		paras = new Vector<>();
		paras.add(filed);
		om.selectInfo(sql, paras);
	}
	
	//��ʼ����Ҫ���
	public void initMainPane()
	{
		//����JPanel����
		jtop = new JPanel(new BorderLayout());
		jlab_logo = new JLabel(new ImageIcon("images/ResOrderLogo.png"));
		j_Lab = new JLabel("����");
		j_Lab.setFont(Tools.f_12);
		jtf = new JTextField(12);
		j_select = new JLabel(new ImageIcon("images/selectLab.png"));
		j_select.setCursor(new Cursor(Cursor.HAND_CURSOR));
		jtip = new JLabel("�����˵������ο�,ʵ���Բ��������ļ۸�Ϊ׼");
		jtip.setFont(Tools.f_12);
		JPanel top_center = new JPanel();
		top_center.add(j_Lab);
		top_center.add(jtf);
		top_center.add(j_select);
		top_center.add(jtip);

		jtop.add(jlab_logo,BorderLayout.WEST);
		jtop.add(top_center,BorderLayout.CENTER);
		
		//�ָ�ڵ���߲���
		j_left = new JPanel(new GridLayout(14, 1));
		jleft_labs = new Vector<JLabel>();
		j_left.setOpaque(true);
		j_left.setBackground(Tools.colorWhite);
		jleft_lab1 = new JLabel("   ȫ��");
		jleft_lab2 = new JLabel("   ��������");
		jleft_lab2.setFocusable(true);
		jleft_lab3 = new JLabel("   �����Ȳ�");
		jleft_lab4 = new JLabel("   ʱ���߲�");
		jleft_lab5 = new JLabel("   ͸ζ����");
		jleft_lab6 = new JLabel("   ��ʳ����");
		jleft_lab7 = new JLabel("");
		jleft_lab8 = new JLabel("");
		
		jleft_lab1.setOpaque(true);
		jleft_lab1.setBackground(Tools.colorWhite);
		jleft_lab2.setOpaque(true);
		jleft_lab2.setBackground(Tools.colorGray);
		jleft_lab3.setOpaque(true);
		jleft_lab3.setBackground(Tools.colorWhite);
		jleft_lab4.setOpaque(true);
		jleft_lab4.setBackground(Tools.colorWhite);
		jleft_lab5.setOpaque(true);
		jleft_lab5.setBackground(Tools.colorWhite);
		jleft_lab6.setOpaque(true);
		jleft_lab6.setBackground(Tools.colorWhite);
		
		
		jleft_lab1.setFont(Tools.f_14);
		jleft_lab2.setFont(Tools.f_14);
		jleft_lab3.setFont(Tools.f_14);
		jleft_lab4.setFont(Tools.f_14);
		jleft_lab5.setFont(Tools.f_14);
		jleft_lab6.setFont(Tools.f_14);
		jleft_lab7.setFont(Tools.f_14);
		jleft_lab8.setFont(Tools.f_14);
		
		jleft_lab1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		jleft_lab2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		jleft_lab3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		jleft_lab4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		jleft_lab5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		jleft_lab6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		jleft_lab1.addMouseListener(this);
//		jleft_lab2.addMouseListener(this);  //Ĭ�Ͼ۽��������ϲ��� ����Ҫ����
		jleft_lab3.addMouseListener(this);
		jleft_lab4.addMouseListener(this);
		jleft_lab5.addMouseListener(this);
		jleft_lab6.addMouseListener(this);
		
		jleft_labs.add(jleft_lab1);
		jleft_labs.add(jleft_lab2);
		jleft_labs.add(jleft_lab3);
		jleft_labs.add(jleft_lab4);
		jleft_labs.add(jleft_lab5);
		jleft_labs.add(jleft_lab6);
		
		j_left.add(jleft_lab1);
		j_left.add(jleft_lab2);
		j_left.add(jleft_lab3);
		j_left.add(jleft_lab4);
		j_left.add(jleft_lab5);
		j_left.add(jleft_lab6);
		
		//�ָ�ڵ��ұ�
		ht = new Hashtable<String,Vector<Integer>>();
		this.initModel();
		jt = new JTable(om2);
		jt.addMouseListener(this);
		jt.setRowHeight(40);
		jt.setSelectionBackground(Tools.colorWhite);
		jt.setBackground(Tools.colorGray);
		jt.setFont(Tools.f_14);
		jt.setShowHorizontalLines(false);
		jt.setShowVerticalLines(false);
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();// ����table���ݾ���
		  tcr.setHorizontalAlignment(SwingConstants.CENTER);// �����Ͼ�����һ��
		  jt.setDefaultRenderer(Object.class, tcr);
		jscroll = new JScrollPane(jt);
		
		//�ָ�ڴ���
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,false, j_left, jscroll);
		jsp.setDividerLocation(200);
		jsp.setDividerSize(0);
		
		//�ײ����Ĵ���
		jbottom = new JPanel();
		jDishes = new JButton("�鿴����");
		jcon = new JButton("ȷ���µ�");
		jcancel = new JButton("ȡ������");
		
		jDishes.setFont(Tools.f_14);
		jcon.setFont(Tools.f_14);
		jcancel.setFont(Tools.f_14);
		
		jDishes.addActionListener(this);
		jcon.addActionListener(this);
		jcancel.addActionListener(this);
		
		jbottom.add(jDishes);
//		jbottom.add(jcon);  //����Ҫȷ���µ��� �ڲ鿴��������ֱ��д�����ݿ�
		jbottom.add(jcancel);
		
		//�����ڴ���
		jmain = new JPanel(new BorderLayout());
		jmain.add(jtop, "North");
		jmain.add(jsp, "Center");
		jmain.add(jbottom, "South");
	}
	
	//���캯��
	public OrderDishDialog()
	{
		//���ó�ʼ������
		this.initMainPane();
		
		//ע�����
		
		//������
		this.add(jmain);
		this.setTitle("�� �� �� ��");
		this.setIconImage(new ImageIcon("images/title.gif").getImage());
		this.setSize(1000, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(Tools.width/2-500, Tools.height/2-300);
		this.setVisible(true);	
	}
	
	//���ڵ����ǰJLabel������jp1�е�û���������¼���JLabel������������¼�
	public void getNoMouseListenerLabel(JLabel nowLabel)
	{
		for(int i=0;i<jleft_labs.size();i++)
		{
			if(jleft_labs.get(i)!=nowLabel)
			{
				if(jleft_labs.get(i).getMouseListeners().length==0)
				{
					jleft_labs.get(i).addMouseListener(this);
					jleft_labs.get(i).setBackground(Tools.colorWhite);
				}
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jleft_lab1)
		{
			//ȫ���˵�
			jleft_lab1.removeMouseListener(this);
			this.getNoMouseListenerLabel(jleft_lab1);
			jt.setModel(om1);
			
		}else if(e.getSource()==jt)
		{
			//JTable�ļ���  ѡ��һ����������1
			OrderModel getOM =  (OrderModel) jt.getModel();
			String getNumber = getOM.getValueAt(jt.getSelectedRow(), 4).toString().trim();
			String getName = getOM.getValueAt(jt.getSelectedRow(), 1).toString();
			int getPrice = Integer.parseInt(getOM.getValueAt(jt.getSelectedRow(), 2).toString().trim());
			int number=0;
			if(getNumber.equals(""))
			{
				
			}else if(Integer.parseInt(getNumber)>=0)
			{
				number = Integer.parseInt(getNumber);
			}
			getOM.setValueAt(number+1, jt.getSelectedRow(), 4);
			getJSelectTableRowInfo = new Vector<Integer>();
			getJSelectTableRowInfo.add(getPrice);
			getJSelectTableRowInfo.add(number+1);
			if(ht.containsKey(getName))
			{
				ht.replace(getName, getJSelectTableRowInfo);
//				System.out.println("1");
//				System.out.println(ht.get(getName).get(0)+" "+ht.get(getName).get(1));
				
			}else{
				ht.put(getName, getJSelectTableRowInfo);
//				System.out.println("2");
//				System.out.println(ht.get(getName).get(0)+" "+ht.get(getName).get(1));
			}
			jt.setModel(getOM);
		}else if(e.getSource()==jleft_lab2)
		{
			//ȫ���˵�
			jleft_lab2.removeMouseListener(this);
			this.getNoMouseListenerLabel(jleft_lab2);
			jt.setModel(om2);
		}else if(e.getSource()==jleft_lab3)
		{
			//�����Ȳ���
			jleft_lab3.removeMouseListener(this);
			this.getNoMouseListenerLabel(jleft_lab3);
			jt.setModel(om3);
		}else if(e.getSource()==jleft_lab4)
		{
			//ʱ���߲���
			jleft_lab4.removeMouseListener(this);
			this.getNoMouseListenerLabel(jleft_lab4);
			jt.setModel(om4);
		}else if(e.getSource()==jleft_lab5)
		{
			//͸ζ������
			jleft_lab5.removeMouseListener(this);
			this.getNoMouseListenerLabel(jleft_lab5);
			jt.setModel(om5);
		}else if(e.getSource()==jleft_lab6)
		{
			//��ʳ������
			jleft_lab6.removeMouseListener(this);
			this.getNoMouseListenerLabel(jleft_lab6);
			jt.setModel(om6);
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
		if(e.getSource()==jleft_lab1)
		{
			jleft_lab1.setBackground(Tools.colorGray);
		}else if(e.getSource()==jleft_lab2)
		{
			jleft_lab2.setBackground(Tools.colorGray);
		}else if(e.getSource()==jleft_lab3)
		{
			jleft_lab3.setBackground(Tools.colorGray);
		}else if(e.getSource()==jleft_lab4)
		{
			jleft_lab4.setBackground(Tools.colorGray);
		}else if(e.getSource()==jleft_lab5)
		{
			jleft_lab5.setBackground(Tools.colorGray);
		}else if(e.getSource()==jleft_lab6)
		{
			jleft_lab6.setBackground(Tools.colorGray);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jleft_lab1)
		{
			jleft_lab1.setBackground(Tools.colorWhite);
		}else if(e.getSource()==jleft_lab2)
		{
			jleft_lab2.setBackground(Tools.colorWhite);
		}else if(e.getSource()==jleft_lab3)
		{
			jleft_lab3.setBackground(Tools.colorWhite);
		}else if(e.getSource()==jleft_lab4)
		{
			jleft_lab4.setBackground(Tools.colorWhite);
		}else if(e.getSource()==jleft_lab5)
		{
			jleft_lab5.setBackground(Tools.colorWhite);
		}else if(e.getSource()==jleft_lab6)
		{
			jleft_lab6.setBackground(Tools.colorWhite);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jDishes)
		{
			//��ʾ����
			String sql = "insert into xxx values(?,?,?)";
			new ShowOrderDishesDialog(sql,ht,this);
			
		}else if(e.getSource()==jcon)
		{
			//ȷ�϶���
			
			
		}else if(e.getSource()==jcancel)
		{
			//ȡ������
			this.dispose();
		}
	}
	
}
