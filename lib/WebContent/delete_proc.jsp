    
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="db.DBManager"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%
String id = request.getParameter("id");

try {
	DBManager db = DBManager.getInstance();
	Connection con = db.open();
	String sql = "delete from article where id=?";
	PreparedStatement stmt = con.prepareStatement(sql);
	stmt.setString(1, id);	
	
	int result = stmt.executeUpdate(); // �����̸� 1 �̻�, ���и� 0
	if(result > 0) {
		//        http://localhost/JspBoard/list.jsp
		response.sendRedirect("list.jsp");
	} else {
		out.println("��������");
	}
} catch (ClassNotFoundException e) {
	e.printStackTrace();
} catch (SQLException e) {
	e.printStackTrace();
}	
%>
