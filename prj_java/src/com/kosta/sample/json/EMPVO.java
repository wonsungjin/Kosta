package com.kosta.sample.json;

public class EMPVO {
	
	private int empno;
	private String ename;
	private int sal;
	
	
	@Override
	public String toString() {
		return "EMPVO [empno=" + empno + ", ename=" + ename + ", sal=" + sal + "]";
	}
	public EMPVO(int empno, String ename, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	

}
