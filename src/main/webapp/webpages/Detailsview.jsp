<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@  page import="com.medicalinsurance.customer.entity.Customers"%>
<%@  page import="java.util.List"%>
<%@  page import="java.util.ArrayList"%>
<%@  page import="java.util.Iterator"%>
<%@  page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%
//Customers customer =(Customers)request.getAttribute("data");
Set<Object>list=(Set<Object>)request.getAttribute("data");


%>
</head>
<body>

 <% 
 for(Object m : list){ 

	 %>
	
	<h2> <%out.print( m +" ");%> </h2> 
	<% 	
	   } 
 %>
 
	
</body>
</html>