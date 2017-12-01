package com.model;

import java.sql.*;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

import com.db.SqlHelper;

public class ReserveModel extends AbstractTableModel{
	Vector<String> columnNames;
	Vector<Vector> rowData;
	SqlHelper sh;
	String sql;
	Vector<String> paras;
	ResultSet rs;
	
	public ReserveModel()
	{
		columnNames = new Vector<String>();
		rowData = new Vector<Vector>();
		paras=new Vector<String>();
		sh = new SqlHelper();
	}
	//ִ�в�ѯ����
	public void selectInfo(String sql,Vector<String> paras)
	{
		this.sql=sql;
		this.paras=paras;
		rs=sh.queryExecute(this.sql, this.paras);
		try {
			//rsmd���Ի�ý���ж����У�������֪������
			ResultSetMetaData rsmd=rs.getMetaData();
			for(int i=0;i<rsmd.getColumnCount();i++)
			{
				this.columnNames.add(rsmd.getColumnName(i+1));
			}
			while(rs.next())
			{
				Vector<String> hang = new Vector<String>();
				for(int i=0;i<rsmd.getColumnCount();i++)
				{
					hang.add(rs.getString(i+1));
				}
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