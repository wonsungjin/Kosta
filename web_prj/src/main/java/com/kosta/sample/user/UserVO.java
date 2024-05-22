package com.kosta.sample.user;

public class UserVO {
	int seq;
	String userid;
	String uname;
	String uemail;
	String passwd;
	String regdate;
	String grade;
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	UserVO() {}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	/**
	 * 
	 * @param seq
	 * @param userid
	 * @param uname
	 * @param uemail
	 * @param passwd
	 * @param regdate
	 */
	public UserVO(int seq, String userid, String uname, String uemail, String passwd,String grade) {
		super();
		this.seq = seq;
		this.userid = userid;
		this.uname = uname;
		this.uemail = uemail;
		this.passwd = passwd;
		this.grade = grade;
	}

}
