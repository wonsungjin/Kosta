package com.kosta.sample.jdbc;
import com.kosta.sample.json.EmpVO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JDBCCallTest {
		static final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		static final String DB_ID = "it";
		static final String DB_PW = "0000";
		public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(DB_URL,DB_ID,DB_PW);
			if(conn!=null) System.out.print("연결됨");
			else System.out.print("연결ss");
			String sql = "select * from emp";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
//			ArrayList<HashMap<String,String>> list = new ArrayList<HashMap<String,String>>();
//			while(rs.next()==true)
//			{
//				HashMap hash = new HashMap();
//				hash.put("empno", rs.getInt("empno"));
//				hash.put("ename", rs.getString("ename"));
//				list.add(hash);
//			}
//			ObjectMapper map = new ObjectMapper();
//			//////////VO방법////////////
			ArrayList<EmpVO> list = new ArrayList();
			while(rs.next()==true)
			{
				EmpVO emp = new EmpVO();
				emp.setEname(rs.getString("ename"));
				emp.setEmpno(rs.getInt("empno"));
				list.add(emp);
			}
			System.out.println(list.get(0));
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}