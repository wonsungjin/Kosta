package com.kosta.sample.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kosta.sample.board.BoardVO;
import com.kosta.sample.common.MyOracleConnection;

public class UserDAO {
	public int userInsert(UserVO vo)
	{
		MyOracleConnection mc = new MyOracleConnection();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = mc.oracleConn().getConnection();
			String sql = "insert into users values(users_seq.nextval,?,?,?,?,sysdate,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getUserid());
			pstmt.setString(2, vo.getUname());
			pstmt.setString(3, vo.getUemail());
			pstmt.setString(4, vo.getPasswd());
			pstmt.setString(5, vo.getGrade());
			pstmt.executeUpdate();
			System.out.print(vo.getSeq()+" "+vo.getUserid()+" "+vo.getPasswd()+" "+vo.getUname()+" "+vo.getUemail()+" "+vo.getRegdate()+" ");
			if(conn != null) System.out.print(true);
			else System.out.print(false);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mc.oracleClose(conn);
		}
		return 1;
	}
	public UserVO userLogin(String userid, String passwd)
	{
		UserVO vo = null;
		MyOracleConnection mc = new MyOracleConnection();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
				conn = mc.oracleConn().getConnection();
				String sql = "select uname,email,userid from users where userid = ? and passwd = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, userid);
				pstmt.setString(2, passwd);
				rs = pstmt.executeQuery();
				while (rs.next() == true) 
				{
					vo.setUname(rs.getString("uname"));
					vo.setUemail(rs.getString("email"));
					vo.setUserid(rs.getString("userid"));
				System.out.println(rs.getString("uname") +" "+rs.getString("email")+" "+rs.getString("userid"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				mc.oracleClose(conn, pstmt);
			}
			
		return vo;
	}
}