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
@WebServlet(
		description = "/board_servlet_url", 
		urlPatterns = { 
				"/BoardServlet", 
				"/board_servlet_url"
		})
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BoardServlet() {

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("hrrherherServed at: ").append(request.getContextPath());
		//response.sendRedirect("index.html");
		System.out.println("get");
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		System.out.println("post");
		String vUserid = request.getParameter("userid");
		String vUserpw =request.getParameter("userpw");
		String vGen =request.getParameter("gen");
		String vSubject =request.getParameter("subject");
		String vUserfile =request.getParameter("userfile");
		String vSsn =request.getParameter("ssn");
		String vContents =request.getParameter("contents");
		String[] vHabit =request.getParameterValues("habit");
		
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
