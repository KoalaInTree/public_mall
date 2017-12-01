package com.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import com.Tools.Tools;

//��ʾʱ����
public class ShowTime extends JPanel implements Runnable
{
	Date date;//����ϵͳʱ�����
	public void paint(Graphics g)
	{
		super.paint(g);
		String nowTome=this.getNowTime();
		g.setColor(Color.black);
		g.setFont(new Font("����", Font.PLAIN, 15));
		g.drawString(nowTome, Tools.width-400, 20);
	}
	//��ȡ��ǰ��ʱ�䲢�����������ʾ���ַ���
	public String getNowTime()
	{
		date=new Date();//�������Ҫ��ʽ,��ֱ����dt,dt���ǵ�ǰϵͳʱ��
		DateFormat df = new SimpleDateFormat("yyyy:MM:dd:HH:mm:ss");//������ʾ��ʽ
		String nowDate=df.format(date);
		String[] time=nowDate.split(":");
		int year=Integer.parseInt(time[0]);
		int mon= Integer.parseInt(time[1]);
		int day= Integer.parseInt(time[2]);
		int hour=Integer.parseInt(time[3]);
		int min= Integer.parseInt(time[4]);
		int sec= Integer.parseInt(time[5]);
		String nowTime="�� ǰ ʱ �� ��"+year+"�� "+mon+"�� "+day+"�� "+hour+"ʱ "+min+"�� "+sec+"��";
		return nowTime;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				//ÿ��1000�������»滭
				Thread.sleep(1000);
				this.repaint();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
