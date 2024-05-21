package com.kosta.sample.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;

public class MyOracleConnection {
	static final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	static final String DB_ID = "it";
	static final String DB_PW = "0000";

	public DataSource oracleConn() {

		OracleConnectionPoolDataSource obj = null;
		try {
			obj = new OracleConnectionPoolDataSource();
			obj.setURL(DB_URL);
			obj.setUser(DB_ID);
			obj.setPassword(DB_PW);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return obj;
	}

	public void oracleClose(Connection conn, PreparedStatement pstmt, ResultSet rs) {

		try {
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	public void oracleClose(Connection conn, PreparedStatement pstmt) {
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	public void oracleClose(Connection conn) {
		try {
			conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	public static void main(String[] args)
	{
		BoardDAO bd = new BoardDAO();
		BoardVO bvo =  bd.boardReplySelect(1);
		int seq = bvo.getSEQ();
		String title = bvo.getTITLE();
		System.out.println(seq+"\t"+title);
		List<ReplyVO> rlist = bvo.getReplies();
		
		
		for(ReplyVO ass : rlist)
		{
			System.out.print(ass.getRseq()+"  ");
			System.out.print(ass.getReply()+"\n");
			}
		
	}
}