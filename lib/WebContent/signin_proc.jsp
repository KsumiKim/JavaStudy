    
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="db.DBManager"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<%
String id = request.getParameter("id");
String pw = request.getParameter("pw");

try {
	DBManager db = DBManager.getInstance();
	Connection con = db.open();
	String sql = "select id from member where id=? and pw=?";
	PreparedStatement stmt = con.prepareStatement(sql);
	stmt.setString(1, id);
	stmt.setString(2, pw);
	stmt.executeUpdate();
	
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

%>
