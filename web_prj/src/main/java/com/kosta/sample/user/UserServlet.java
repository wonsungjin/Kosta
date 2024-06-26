package com.kosta.sample.user;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	int count = 0;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("KEY_SESS_USERID");
		session.removeAttribute("KEY_SESS_UNAME");
		session.removeAttribute("KEY_SESS_GRADE");
		session.invalidate();//한번에지우기
		session.setMaxInactiveInterval(0);//세션유효시간 0초설정
		
		response.sendRedirect("index.jsp");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String pagecode = request.getParameter("pagecode");
			String userid = request.getParameter("userid");
			String passwd = request.getParameter("passwd");
			String uemail = request.getParameter("uemail");
			String uname = request.getParameter("uname");
			String grade = request.getParameter("grade");
			count++;
			UserDAO dao = new UserDAO();
			UserVO vo = new UserVO(count,userid,uname,uemail,passwd,grade);
			if(pagecode.equals("P001"))//회원가입
			{
				int insertRows = dao.userInsert(vo);
				if(insertRows==1) 
				{
					response.sendRedirect("index.jsp");
				}
				else 
				{
					response.sendRedirect("500.html");					
				}
			}
			else if(pagecode.equals("P002"))//login
			{
				UserVO vo1 = dao.userLogin(userid,passwd);
				if(vo1 != null)//성공
				{
					System.out.print("세션할당");
					HttpSession session = request.getSession();
					session.setAttribute("KEY_SESS_USERID", vo1.getUserid());
					session.setAttribute("KEY_SESS_UNAME", vo1.getUname());
					session.setAttribute("KEY_SESS_GRADE", vo1.getGrade());
					
					
				
					response.sendRedirect("index.jsp");
				}
				else//실패
				{
					response.sendRedirect("500.html");	
				}
			}
			else
			{
				response.sendRedirect("500.html");
			}
	}

}
