package com.kosta.sample.board;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BoardServlet
 */
@WebServlet("/BoardServlet")
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
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=euc-kr");
		String pagecode = request.getParameter("pagecode");
		
		if(pagecode.endsWith("B001"))
		{
			BoardDAO bd = new BoardDAO();
			ArrayList<BoardVO> list = bd.boardSelect();
			//테이블jsp에 ?뒤에 uid (&)그리고 upw의 값을 전송 
			//response.sendRedirect("tables.jsp?uid=kim&upw=123");
			//객체 전송에 사용
			request.setAttribute("KEY_BOARDLIST",list);
			RequestDispatcher rd =  request.getRequestDispatcher("tables.jsp");
			rd.forward(request, response);
		}
		else if(pagecode.endsWith("B002"))
		{
			int seq = Integer.parseInt(request.getParameter("seq"));
			BoardDAO bd = new BoardDAO();
			ArrayList<BoardVO> list = bd.boardSelectOne(seq);
			request.setAttribute("KEY_BOARDLIST",list);
			System.out.print(list.size());
			RequestDispatcher rd =  request.getRequestDispatcher("tables_detail.jsp");
			rd.forward(request, response);
		}
		else response.sendRedirect("500.html");
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=euc-kr");
		
		response.getWriter().append("post").append(request.getContextPath());

	}

}
