package com.kosta.sample.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDAO {
	public int boardDelete(int seq) {
		MyOracleConnection mc = new MyOracleConnection();
		Connection conn = null;
		PreparedStatement pstmt = null;
		int delCount = 0;
		try {
			conn = mc.oracleConn().getConnection();
			String sql = "delete from board where seq=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);
			delCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mc.oracleClose(conn, pstmt);
		}
		return delCount;
	}
	
	public int boardInsert() {
		//seq       *title *contents *regid            regdate
		//nextval                    session,cookies   sysdate  

		int insertRows = 0;

		String sql = "insert into board values(board_seq.nextval,?,?,?,sysdate)";

		return insertRows;
	}

	//public int boardUpdate(String title, String contetns, String regdate ) {

	public int boardUpdate(BoardVO bvo) {

		int updateRows = 0;

		String sql = "update board set title=?, contents=? where seq=?";

		return updateRows;

	}
	public ArrayList<BoardVO> boardSelect() {
		MyOracleConnection mc = new MyOracleConnection();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<BoardVO> list = null;
		String sql = "select * from board";
		try {
			conn = mc.oracleConn().getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			list = new ArrayList();
			while (rs.next() == true) {
				BoardVO vo= new BoardVO
				(rs.getString("CONTENTS"),
				rs.getString("REGDATE"),
				rs.getInt("SEQ"),
				rs.getString("TITLE"),
				rs.getString("REGID"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mc.oracleClose(conn, pstmt);
		}
		return list;
	}
	public ArrayList<BoardVO> boardSelectOne(int seq) {
		MyOracleConnection mc = new MyOracleConnection();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<BoardVO> list = null;
		 // set바인딩값타입(1번째물음표에 , 바인딩될값) 	
		try {
			conn = mc.oracleConn().getConnection();
			String sql = "select * from board where SEQ= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);  //--------런타임시 : 동적 바인딩
			rs = pstmt.executeQuery();
			list = new ArrayList();
			while (rs.next() == true) {
				BoardVO vo= new BoardVO
				(rs.getString("CONTENTS"),
				rs.getString("REGDATE"),
				rs.getInt("SEQ"),
				rs.getString("TITLE"),
				rs.getString("REGID"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mc.oracleClose(conn, pstmt);
		}
		return list;
	}
	public ArrayList<ReplyVO> replyListOne(int seq)
	{
		MyOracleConnection mc = new MyOracleConnection();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<ReplyVO> list = null;
		 // set바인딩값타입(1번째물음표에 , 바인딩될값) 	
		try {
			conn = mc.oracleConn().getConnection();
			String sql = "select * from reply where SEQ= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);  //--------런타임시 : 동적 바인딩
			rs = pstmt.executeQuery();
			list = new ArrayList();
			while (rs.next() == true) {
				ReplyVO rvo = new ReplyVO
						(rs.getInt("RSEQ"),
						rs.getString("REPLY"),
						rs.getString("RREGID"),
						rs.getString("RREGDATE"),
						rs.getInt("SEQ"));
				list.add(rvo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mc.oracleClose(conn, pstmt);
		}
		return list;
	}
	public BoardVO boardReplySelect(int seq)
	{
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		MyOracleConnection mc = new MyOracleConnection();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVO vo=null;
		ArrayList<ReplyVO> replyList = new ArrayList();
		 // set바인딩값타입(1번째물음표에 , 바인딩될값) 	
		try {
			conn = mc.oracleConn().getConnection();
			String sql = "select b.seq, b.title, b.regid, b.regdate, r.rseq , r.reply, r.regid as rregid, r.regdate as rregdate from board b, reply r where b.seq=? and b.seq = r.seq(+) order by r.seq desc";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, seq);  //--------런타임시 : 동적 바인딩
			rs = pstmt.executeQuery();
			list = new ArrayList();
			vo= null;
			while (rs.next() == true) {
				if(vo==null) vo= new BoardVO
				(
				rs.getString("TITLE"),
				rs.getInt("SEQ"),
				rs.getString("REGDATE"),
				rs.getString("REGID"));
				ReplyVO rvo = new ReplyVO
				(rs.getInt("RSEQ"),
				rs.getString("REPLY"),
				rs.getString("RREGID"),
				rs.getString("RREGDATE"),
				rs.getInt("SEQ"));
				replyList.add(rvo);
			}
			vo.setReplies(replyList);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			mc.oracleClose(conn, pstmt);
		}
		return vo;
	}
}
