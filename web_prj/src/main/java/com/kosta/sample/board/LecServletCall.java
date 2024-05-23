package com.kosta.sample.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BoardServlet
 */
@WebServlet("/board_servlet_url")
public class LecServletCall extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LecServletCall() {

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=euc-kr");
		//response.getWriter().append("hrrherherServed at: ").append(request.getContextPath());
		//response.sendRedirect("index.html");
		response.getWriter().append("get" + request.getParameter("userid")).append(request.getContextPath());
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=euc-kr");
		String vUserid = request.getParameter("userid");
		String vUserpw =request.getParameter("userpw");
		String vGen =request.getParameter("gen");
		String vSubject =request.getParameter("subject");
		String vUserfile =request.getParameter("userfile");
		String vSsn =request.getParameter("ssn");
		String vContents =request.getParameter("contents");
		String[] vHabit =request.getParameterValues("habit");
		
		response.getWriter().append("post" + request.getParameter("userid")).append(request.getContextPath());
		System.out.println(vUserid);
		System.out.println(vUserpw);
		System.out.println(vGen);
		System.out.println(vSubject);
		System.out.println(vUserfile);
		System.out.println(vSsn);
		System.out.println(vContents);
		for(String st : vHabit) System.out.println(st);
	}

}
