/**
 * ����¥����ϵͳ���ؽ���
 */
package com.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
import javax.imageio.*;
import com.Tools.*;

public class Index extends JWindow implements Runnable{

	BackImage bgimg=new BackImage();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Index index=new Index();
		Thread t=new Thread(index);
		t.start();
	}
	//���캯�����ڳ�ʼ��
	public Index()
	{
		Thread t=new Thread(bgimg);
		t.start();
		Container ct=this.getContentPane();
		this.add(bgimg);
		this.setSize(600,390);
		this.setVisible(true);
		this.setLocation(Tools.width/2-300, Tools.height/2-185);
	}
	//����һ���ڲ��࣬���滭���ؽ����ͼ���ͽ�����
	class BackImage extends JPanel implements Runnable
	{
		Image img = null;
		int i=0;
		public BackImage()
		{
			try {
				img=ImageIO.read(new File("images\\index.jpg"));
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		//���ǻ滭����
		public void paint(Graphics g)
		{
			super.paint(g);
			g.drawImage(img, 0, 0, this);
			g.setColor(Color.green);
			g.fill3DRect(0, 360, 20*(1+i), 40, false);
			g.setColor(Color.black);
			g.setFont(new Font("����",Font.BOLD,25));
			g.drawString("�� �� �� �� �� �� �� "+(int)(((i+1)*3.3+1))+"%", 120, 383);
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			int j=0;
			while(true)
			{
				if(j==30)
				{
					break;
				}
				for(i=0;i<30;i++)
				{
					//ÿ��169�������»滭һ�ν�����,ʵ�ֽ������Ķ�̬ǰ��
					this.repaint();
					j++;
					try {
						Thread.sleep(169);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
				
			}
		}
	}
	@Override
	public void run() {
		//���Ƽ��ؽ������ʾʱ��
		try {
			Thread.sleep(5500);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//�رձ�����
		this.dispose();
		//����һ����¼������ת
		new Login();
	}
}