/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-05-27 06:04:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import com.kosta.sample.board.BoardVO;
import com.kosta.sample.board.ReplyVO;

public final class tables_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(4);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.kosta.sample.board.BoardVO");
    _jspx_imports_classes.add("com.kosta.sample.board.ReplyVO");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<meta name=\"author\" content=\"\" />\n");
      out.write("<title>Tables - SB Admin</title>\n");
      out.write("<link\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/style.min.css\"\n");
      out.write("	rel=\"stylesheet\" />\n");
      out.write("<link href=\"css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("<script src=\"https://use.fontawesome.com/releases/v6.3.0/js/all.js\"\n");
      out.write("	crossorigin=\"anonymous\"></script>\n");
      out.write("</head>\n");
      out.write("<body class=\"sb-nav-fixed\">\n");
      out.write("	<nav class=\"sb-topnav navbar navbar-expand navbar-dark bg-dark\">\n");
      out.write("		<!-- Navbar Brand-->\n");
      out.write("		<a class=\"navbar-brand ps-3\" href=\"index.html\">Start Bootstrap</a>\n");
      out.write("		<!-- Sidebar Toggle-->\n");
      out.write("		<button class=\"btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0\"\n");
      out.write("			id=\"sidebarToggle\" href=\"#!\">\n");
      out.write("			<i class=\"fas fa-bars\"></i>\n");
      out.write("		</button>\n");
      out.write("		<!-- Navbar Search-->\n");
      out.write("		<form\n");
      out.write("			class=\"d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0\">\n");
      out.write("			<div class=\"input-group\">\n");
      out.write("				<input class=\"form-control\" type=\"text\" placeholder=\"Search for...\"\n");
      out.write("					aria-label=\"Search for...\" aria-describedby=\"btnNavbarSearch\" />\n");
      out.write("				<button class=\"btn btn-primary\" id=\"btnNavbarSearch\" type=\"button\">\n");
      out.write("					<i class=\"fas fa-search\"></i>\n");
      out.write("				</button>\n");
      out.write("			</div>\n");
      out.write("		</form>\n");
      out.write("		<!-- Navbar-->\n");
      out.write("		<ul class=\"navbar-nav ms-auto ms-md-0 me-3 me-lg-4\">\n");
      out.write("			<li class=\"nav-item dropdown\"><a\n");
      out.write("				class=\"nav-link dropdown-toggle\" id=\"navbarDropdown\" href=\"#\"\n");
      out.write("				role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"><i\n");
      out.write("					class=\"fas fa-user fa-fw\"></i></a>\n");
      out.write("				<ul class=\"dropdown-menu dropdown-menu-end\"\n");
      out.write("					aria-labelledby=\"navbarDropdown\">\n");
      out.write("					<li><a class=\"dropdown-item\" href=\"#!\">Settings</a></li>\n");
      out.write("					<li><a class=\"dropdown-item\" href=\"#!\">Activity Log</a></li>\n");
      out.write("					<li><hr class=\"dropdown-divider\" /></li>\n");
      out.write("					<li><a class=\"dropdown-item\" href=\"#!\">Logout</a></li>\n");
      out.write("				</ul></li>\n");
      out.write("		</ul>\n");
      out.write("	</nav>\n");
      out.write("	<div id=\"layoutSidenav\">\n");
      out.write("		<div id=\"layoutSidenav_nav\">\n");
      out.write("			<nav class=\"sb-sidenav accordion sb-sidenav-dark\"\n");
      out.write("				id=\"sidenavAccordion\">\n");
      out.write("				<div class=\"sb-sidenav-menu\">\n");
      out.write("					<div class=\"nav\">\n");
      out.write("						<div class=\"sb-sidenav-menu-heading\">Core</div>\n");
      out.write("						<a class=\"nav-link\" href=\"index.html\">\n");
      out.write("							<div class=\"sb-nav-link-icon\">\n");
      out.write("								<i class=\"fas fa-tachometer-alt\"></i>\n");
      out.write("							</div> Dashboard\n");
      out.write("						</a>\n");
      out.write("						<div class=\"sb-sidenav-menu-heading\">Interface</div>\n");
      out.write("						<a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\"\n");
      out.write("							data-bs-target=\"#collapseLayouts\" aria-expanded=\"false\"\n");
      out.write("							aria-controls=\"collapseLayouts\">\n");
      out.write("							<div class=\"sb-nav-link-icon\">\n");
      out.write("								<i class=\"fas fa-columns\"></i>\n");
      out.write("							</div> Layouts\n");
      out.write("							<div class=\"sb-sidenav-collapse-arrow\">\n");
      out.write("								<i class=\"fas fa-angle-down\"></i>\n");
      out.write("							</div>\n");
      out.write("						</a>\n");
      out.write("						<div class=\"collapse\" id=\"collapseLayouts\"\n");
      out.write("							aria-labelledby=\"headingOne\" data-bs-parent=\"#sidenavAccordion\">\n");
      out.write("							<nav class=\"sb-sidenav-menu-nested nav\">\n");
      out.write("								<a class=\"nav-link\" href=\"layout-static.html\">Static\n");
      out.write("									Navigation</a> <a class=\"nav-link\" href=\"layout-sidenav-light.html\">Light\n");
      out.write("									Sidenav</a>\n");
      out.write("							</nav>\n");
      out.write("						</div>\n");
      out.write("						<a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\"\n");
      out.write("							data-bs-target=\"#collapsePages\" aria-expanded=\"false\"\n");
      out.write("							aria-controls=\"collapsePages\">\n");
      out.write("							<div class=\"sb-nav-link-icon\">\n");
      out.write("								<i class=\"fas fa-book-open\"></i>\n");
      out.write("							</div> Pages\n");
      out.write("							<div class=\"sb-sidenav-collapse-arrow\">\n");
      out.write("								<i class=\"fas fa-angle-down\"></i>\n");
      out.write("							</div>\n");
      out.write("						</a>\n");
      out.write("						<div class=\"collapse\" id=\"collapsePages\"\n");
      out.write("							aria-labelledby=\"headingTwo\" data-bs-parent=\"#sidenavAccordion\">\n");
      out.write("							<nav class=\"sb-sidenav-menu-nested nav accordion\"\n");
      out.write("								id=\"sidenavAccordionPages\">\n");
      out.write("								<a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\"\n");
      out.write("									data-bs-target=\"#pagesCollapseAuth\" aria-expanded=\"false\"\n");
      out.write("									aria-controls=\"pagesCollapseAuth\"> Authentication\n");
      out.write("									<div class=\"sb-sidenav-collapse-arrow\">\n");
      out.write("										<i class=\"fas fa-angle-down\"></i>\n");
      out.write("									</div>\n");
      out.write("								</a>\n");
      out.write("\n");
      out.write("								<div class=\"collapse\" id=\"pagesCollapseAuth\"\n");
      out.write("									aria-labelledby=\"headingOne\"\n");
      out.write("									data-bs-parent=\"#sidenavAccordionPages\">\n");
      out.write("									<nav class=\"sb-sidenav-menu-nested nav\">\n");
      out.write("\n");
      out.write("\n");
      out.write("										<!-- ---------------  로그인/로그아웃 처리 ------------------------- -->\n");
      out.write("										");

										String userid = (String) session.getAttribute("KEY_SESS_USERID");
										String uname = (String) session.getAttribute("KEY_SESS_UNAME");
										String grade = (String) session.getAttribute("KEY_SESS_GRADE");

										if (grade != null) {
										
      out.write("\n");
      out.write("										<a class=\"nav-link\"\n");
      out.write("											href=\"");
      out.print(request.getContextPath());
      out.write("/UserServlet\">Logout</a>\n");
      out.write("										");

										} else {
										
      out.write("\n");
      out.write("										<a class=\"nav-link\"\n");
      out.write("											href=\"");
      out.print(request.getContextPath());
      out.write("/login.jsp\">Login</a>\n");
      out.write("										");

										}
										
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("										<a class=\"nav-link\" href=\"register.html\">Register</a> <a\n");
      out.write("											class=\"nav-link\" href=\"password.html\">Forgot Password</a>\n");
      out.write("									</nav>\n");
      out.write("								</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("								<a class=\"nav-link collapsed\" href=\"#\" data-bs-toggle=\"collapse\"\n");
      out.write("									data-bs-target=\"#pagesCollapseError\" aria-expanded=\"false\"\n");
      out.write("									aria-controls=\"pagesCollapseError\"> Error\n");
      out.write("									<div class=\"sb-sidenav-collapse-arrow\">\n");
      out.write("										<i class=\"fas fa-angle-down\"></i>\n");
      out.write("									</div>\n");
      out.write("								</a>\n");
      out.write("								<div class=\"collapse\" id=\"pagesCollapseError\"\n");
      out.write("									aria-labelledby=\"headingOne\"\n");
      out.write("									data-bs-parent=\"#sidenavAccordionPages\">\n");
      out.write("									<nav class=\"sb-sidenav-menu-nested nav\">\n");
      out.write("										<a class=\"nav-link\" href=\"401.html\">401 Page</a> <a\n");
      out.write("											class=\"nav-link\" href=\"404.html\">404 Page</a> <a\n");
      out.write("											class=\"nav-link\" href=\"500.html\">500 Page</a>\n");
      out.write("									</nav>\n");
      out.write("								</div>\n");
      out.write("							</nav>\n");
      out.write("						</div>\n");
      out.write("						<div class=\"sb-sidenav-menu-heading\">Addons</div>\n");
      out.write("						<a class=\"nav-link\" href=\"charts.html\">\n");
      out.write("							<div class=\"sb-nav-link-icon\">\n");
      out.write("								<i class=\"fas fa-chart-area\"></i>\n");
      out.write("							</div> Charts\n");
      out.write("						</a>\n");
      out.write("\n");
      out.write("						<!--  ------------------ BOARD 연결------------------------ -->\n");
      out.write("						<a class=\"nav-link\"\n");
      out.write("							href=\"");
      out.print(request.getContextPath());
      out.write("/BoardServlet?pagecode=B001\">\n");
      out.write("							<div class=\"sb-nav-link-icon\">\n");
      out.write("								<i class=\"fas fa-table\"></i>\n");
      out.write("							</div> Tables\n");
      out.write("						</a>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"sb-sidenav-footer\">\n");
      out.write("					<div class=\"small\">Logged in as:</div>\n");
      out.write("					Start Bootstrap\n");
      out.write("				</div>\n");
      out.write("			</nav>\n");
      out.write("		</div>\n");
      out.write("		<div id=\"layoutSidenav_content\">\n");
      out.write("			<main>\n");
      out.write("				<div class=\"container-fluid px-4\">\n");
      out.write("					<h1 class=\"mt-4\">\n");
      out.write("						Tables\n");
      out.write("\n");
      out.write("\n");
      out.write("						<!-- ---------------  세션 보이기 ------------------------- -->\n");
      out.write("						");

if (grade != null) {
	out.println(uname + "님 환영합니다.");
	if (grade.equals("u")) {
		out.println("사용자접속");
	} else if (grade.equals("a")) {
		out.println("관리자접속");
	}
}

      out.write("\n");
      out.write("\n");
      out.write("						");

						ArrayList<BoardVO> list = (ArrayList<BoardVO>) request.getAttribute("KEY_BOARDLIST");
						int seq = 0;
						String title = "";
						String contents = "";
						String regid = "";
						String regdate = "";
						List<ReplyVO> replies = null;
						
						int rseq = 0;
						String reply = "";
						String rregid = "";
						String rregdate = "";
						for (BoardVO vo : list) {
							seq = vo.getSeq();
							title = vo.getTitle();
							contents = vo.getContents();
							regid = vo.getRegid();
							regdate = vo.getRegdate();
							replies = vo.getReplies();
							for(ReplyVO rvo : replies)
							{
								rregid = rvo.getRegid();
								rregdate = rvo.getRegdate();
								reply = rvo.getReply();
								rseq = rvo.getRseq();
								//System.out.println(seq + "- " + title + "- " + contents + "- " + regid + "- " + regdate);
							}
						}
						
      out.write("\n");
      out.write("\n");
      out.write("						<script src=\"https://code.jquery.com/jquery-3.7.1.js\"></script>\n");
      out.write("						<script>\n");
      out.write("						$(function() {\n");
      out.write("							$(\"#correction\").click(  function()\n");
      out.write("									{\n");
      out.write("										$(\"#correctionForm\").attr(\"method\",\"post\");\n");
      out.write("										$(\"#correctionForm\").attr(\"action\",\"/BoardServlet?pagecode=B003\");\n");
      out.write("										$(\"#correctionForm\").submit();\n");
      out.write("									});\n");
      out.write("							$(\"#delete\").click(  function()\n");
      out.write("									{\n");
      out.write("										$(\"#correctionForm\").attr(\"method\",\"post\");\n");
      out.write("										$(\"#correctionForm\").attr(\"action\",\"/BoardServlet?pagecode=B004\");\n");
      out.write("										$(\"#correctionForm\").submit();\n");
      out.write("									});\n");
      out.write("							$(\"#reply\").click(  function()\n");
      out.write("									{\n");
      out.write("										$(\"#replyForm\").attr(\"method\",\"post\");\n");
      out.write("										$(\"#replyForm\").attr(\"action\",\"/BoardServlet?pagecode=B006&seq=");
      out.print(seq);
      out.write("\");\n");
      out.write("										$(\"#replyForm\").submit();\n");
      out.write("									});\n");
      out.write("							//$(\"#list\").click\n");
      out.write("						});\n");
      out.write("						</script>\n");
      out.write("						</head>\n");
      out.write("					</h1>\n");
      out.write("					<ol class=\"breadcrumb mb-4\">\n");
      out.write("						<li class=\"breadcrumb-item\"><a href=\"index.html\">Dashboard</a></li>\n");
      out.write("						<li class=\"breadcrumb-item active\">Tables</li>\n");
      out.write("					</ol>\n");
      out.write("\n");
      out.write("					<div class=\"card mb-4\">\n");
      out.write("						<div class=\"card-header\">\n");
      out.write("							<i class=\"fas fa-table me-1\"></i> DataTable Example\n");
      out.write("						</div>\n");
      out.write("						<div class=\"card-body\">\n");
      out.write("								<form name=\"correctionForm\" id=\"correctionForm\" method=\"post\">\n");
      out.write("							<table border=\"1\" width=\"100%\">\n");
      out.write("								<tr>\n");
      out.write("									<th width=\"20%\">글번호</th>\n");
      out.write("									<td width=\"80%\"><input type = \"hidden\" name = \"seq\" value = ");
      out.print(seq);
      out.write('>');
      out.print(seq);
      out.write("</td>\n");
      out.write("								</tr>\n");
      out.write("								<tr>\n");
      out.write("									<th>작성자</th>\n");
      out.write("									<td><input type = \"hidden\" name = \"regid\" value = ");
      out.print(regid);
      out.write('>');
      out.print(regid);
      out.write("</td>\n");
      out.write("								</tr>\n");
      out.write("								<tr>\n");
      out.write("									<th>작성일</th>\n");
      out.write("									<td><input type = \"hidden\" name = \"regdate\" value = ");
      out.print(regdate);
      out.write('>');
      out.print(regdate);
      out.write("</td>\n");
      out.write("								</tr>\n");
      out.write("								<tr>\n");
      out.write("									<th>제목</th>\n");
      out.write("									<td><input type=\"text\" name=\"title\" size=\"60\"\n");
      out.write("										value=");
      out.print(title);
      out.write("></td>\n");
      out.write("								</tr>\n");
      out.write("								<tr>\n");
      out.write("									<th>내용</th>\n");
      out.write("									<td><textarea name=\"contents\" cols=\"80\" rows=\"6\">");
      out.print(contents);
      out.write("</textarea></td>\n");
      out.write("								</tr>\n");
      out.write("								<tr>\n");
      out.write("									<td colspan=2 align=\"center\">\n");
      out.write("										\n");
      out.write("											<br> <a input type=\"button\" name=\"correction\"\n");
      out.write("												id=\"correction\" class=\"btn btn-primary btn-block\" value=\"수정\">수정</a>\n");
      out.write("					\n");
      out.write("											<a input type=\"button\" name=\"delete\" id=\"delete\"\n");
      out.write("												class=\"btn btn-primary btn-block\" value=\"삭제\">삭제</a> \n");
      out.write("									\n");
      out.write("												<a name=\"list\" id=\"list\" class=\"btn btn-primary btn-block\">목록</a>\n");
      out.write("									</td>\n");
      out.write("							</table>\n");
      out.write("												</form>\n");
      out.write("												<br>\n");
      out.write("<table width=100% border=1>\n");
      out.write("												");
if(reply!=null) {
													for(ReplyVO rvo : replies)
													{
	
      out.write("\n");
      out.write("<font color=red><a type = \"button\" href = \"/BoardServlet?pagecode=B005&rseq=");
      out.print(rvo.getRseq());
      out.write("&seq=");
      out.print(seq);
      out.write("\">[X]</a></font>");
      out.print(rvo.getReply());
      out.write("</td></tr>\n");
      out.write("<br>\n");
}}
      out.write("\n");
      out.write("<form name=\"replyForm\" id=\"replyForm\" method=\"post\">\n");
      out.write("<table width=100% border=1>\n");
      out.write("<tr>\n");
      out.write("	<td>\n");
      out.write("		<input type=\"text\" size=100 name=\"replyContents\">\n");
      out.write("		<input name=\"reply\" id=\"reply\" type=\"submit\" value=\"댓글등록\">\n");
      out.write("	</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</main>\n");
      out.write("			<footer class=\"py-4 bg-light mt-auto\">\n");
      out.write("				<div class=\"container-fluid px-4\">\n");
      out.write("					<div\n");
      out.write("						class=\"d-flex align-items-center justify-content-between small\">\n");
      out.write("						<div class=\"text-muted\">Copyright &copy; Your Website 2023</div>\n");
      out.write("						<div>\n");
      out.write("							<a href=\"#\">Privacy Policy</a> &middot; <a href=\"#\">Terms\n");
      out.write("								&amp; Conditions</a>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</footer>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	<script\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\"\n");
      out.write("		crossorigin=\"anonymous\"></script>\n");
      out.write("	<script src=\"js/scripts.js\"></script>\n");
      out.write("	<script\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/umd/simple-datatables.min.js\"\n");
      out.write("		crossorigin=\"anonymous\"></script>\n");
      out.write("	<script src=\"js/datatables-simple-demo.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
