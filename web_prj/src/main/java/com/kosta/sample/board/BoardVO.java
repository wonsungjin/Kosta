package com.kosta.sample.board;

import java.util.List;

public class BoardVO extends VO {

	int SEQ;
	String TITLE;
	String CONTENTS;
	String REGID;
	String REGDATE;
	List<ReplyVO> replies;
	public List<ReplyVO> getReplies() {
		return replies;
	}
	public void setReplies(List<ReplyVO> replies) {
		this.replies = replies;
	}
	public int getSEQ() {
		return SEQ;
	}
	public void setSEQ(int sEQ) {
		SEQ = sEQ;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	public String getCONTENTS() {
		return CONTENTS;
	}
	public void setCONTENTS(String cONTENTS) {
		CONTENTS = cONTENTS;
	}
	public String getREGID() {
		return REGID;
	}
	public void setREGID(String rEGID) {
		REGID = rEGID;
	}
	public String getREGDATE() {
		return REGDATE;
	}
	public void setREGDATE(String rEGDATE) {
		REGDATE = rEGDATE;
	}
	public BoardVO(String cONTENTS, String tITLE, int sEQ, String rEGID, String rEGDATE) {
		SEQ = sEQ;
		TITLE = tITLE;
		CONTENTS = cONTENTS;
		REGID = rEGID;
		REGDATE = rEGDATE;
	}
	public BoardVO( String tITLE, int sEQ, String rEGID, String rEGDATE) {
		SEQ = sEQ;
		TITLE = tITLE;
		REGID = rEGID;
		REGDATE = rEGDATE;
	}
	public BoardVO() {
	}
}
//String CREATED;
//String LAST_DDL_TIME;
//String SEQUENCE_OWNER;
//String SEQUENCE_NAME;
//int MIN_VALUE;
//int MAX_VALUE;
//int INCREMENT_BY;
//String CYCLE_FLAG;
//String ORDER_FLAG;
//int CACHE_SIZE;
//int LAST_NUMBER;