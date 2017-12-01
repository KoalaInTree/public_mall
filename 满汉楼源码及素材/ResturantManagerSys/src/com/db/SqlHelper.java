/**
 * ִ�ж����ݿ�Ĳ�������ҵ���߼�
 */
package com.db;

import java.sql.*;
import java.util.*;
public class SqlHelper {
	
	//�������ݿ������������
	Connection ct=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	//oracle��������Ĳ���
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@127.0.0.1:1521:myora1";
	String user="scott";
	String password="Aa123654";
	
	//��������ִ�е�����Լ�����
	String sql;
	Vector<String> parps;
	
	public SqlHelper()
	{
		try {
			//��������
			Class.forName(driver);
			System.out.println("��ʼ�������ݿ�����");
			ct=DriverManager.getConnection(url, user, password);
			System.out.println("���ݿ����ӳɹ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//ִ�в�ѯ����
	public ResultSet queryExecute(String sql, Vector<String> parps)
	{
		this.sql=sql;
		this.parps=parps;
		try {
			ps=ct.prepareStatement(sql);
			for(int i=0;i<parps.size();i++)
			{
				ps.setString(i+1,this.parps.get(i));
			}
			rs=ps.executeQuery();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rs;
	}
	
	//ִ����ɾ�Ĳ���
	public boolean updateExecute(String sql, Vector<String> parps)
	{
		this.sql=sql;
		this.parps=parps;
		try {
			ps=ct.prepareStatement(sql);
			for(int i=0;i<parps.size();i++)
			{
				ps.setString(i+1, parps.get(i));
			}
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}finally
		{
			this.close();
		}
		return true;
	}
	//���ڹرմ򿪵���Դ
	public void close()
	{
		try {
			//�ر�˳����ѭ�ȿ����
			if(rs!=null)rs.close();
			if(ps!=null)ps.close();
			if(ct!=null)ct.close();
			System.out.println("���ݿ�رճɹ�");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
