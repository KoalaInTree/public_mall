/**
 * ����Model2ģʽ������ҵ���߼�
 */
package com.model;

import com.db.*;
import java.util.*;
import javax.swing.table.*;
import java.sql.*;

import com.db.SqlHelper;
//�û���¼��ģ��
public class UserModel extends AbstractTableModel {

	//����SqlHelper����
	SqlHelper sh;
	
	Vector<String> columnNames;
	Vector<Vector> rowData;
	String sql;
	Vector<String> paras;
	ResultSet rs;
	//���캯��,����SqlHelper
	public UserModel()
	{
		columnNames = new Vector<String>();
		rowData = new Vector<Vector>();
		paras=new Vector<String>();
		sh = new SqlHelper();
	}
	//���ڼ���¼�Ƿ�Ϸ�,����ְλ����(userposition) �����ѯ�����򷵻�null
	public String[] checkUser(String name,String password)
	{
		//����ҵ���߼�
		paras=new Vector<String>();
		String[] info=new String[2];
		paras.add(name);
		paras.add(name);
		paras.add(password);
		String sql="Select userposition,username from login where (userid=? or username=?) and userpassword=?";
		//ִ�в�ѯ,��ò�ѯ���
		ResultSet rs=sh.queryExecute(sql,paras);
		try {
			while(rs.next())
			{
				info[0]=rs.getString(1);
				info[1]=rs.getString(2);
				return info;
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return null;
		}finally
		{
			sh.close();
		}
		return null;
	}
	
	//ִ�в�ѯ����
	public void selectInfo(String sql,Vector<String> paras)
	{
		this.sql=sql;
		this.paras=paras;
		rs=sh.queryExecute(sql, paras);
		try {
			//rsmd���Ի�ý���ж����У�������֪������
			ResultSetMetaData rsmd=rs.getMetaData();
			for(int i=0;i<rsmd.getColumnCount();i++)
			{
				this.columnNames.add(rsmd.getColumnName(i+1));
			}
			this.columnNames.add("����");
			while(rs.next())
			{
				Vector<String> hang = new Vector<String>();
				for(int i=0;i<rsmd.getColumnCount();i++)
				{
					hang.add(rs.getString(i+1));
				}
				hang.add("��ע��");
				rowData.add(hang);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			sh.close();
		}
	}
		
	//ִ����ɾ�Ĳ���
	public boolean updateInfo(String sql,Vector<String> paras)
	{
		this.sql=sql;
		this.paras=paras;
		boolean result=false;
		if(this.paras.size()>0)
		{
			result =sh.updateExecute(sql, paras);
		}
		return result;
	}
		
		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return rowData.size();
		}

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return columnNames.size();
		}
		
		@Override
		public String getColumnName(int columnIndex) {
			// TODO Auto-generated method stub
			return  this.columnNames.get(columnIndex);
		}
		
		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			return rowData.get(rowIndex).get(columnIndex);
		}
	}

