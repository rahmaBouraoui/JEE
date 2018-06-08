<%@page import="com.esgi.tache.domaine.TacheDao"%>
<%@page import="com.esgi.tache.domaine.Tache" %>
<%@page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@page import="java.util.Map" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Voici la liste des tâches : </h1>

	<table border=1>
			<thead>
				<tr>
					<th>id</th>
					<th>libelle</th>
					<th>priorite</th>
					<th>etat</th>
					<th colspan=2>Action</th>
				</tr>
			</thead>
			<tbody>
				<%Tache tache = new Tache(); %>
				<c:forEach items="${tache.getAllTaches()}" var="tache">
					<tr>
						<td><c:out value="${tache.id}" /></td>
						<td><c:out value="${tache.libelle}" /></td>
						<td><c:out value="${tache.priorite}" /></td>
						<td><c:out value="${tache.etat}" /></td>
						<td>
							<a href="<%=application.getContextPath()%>/UpdateTask.jsp" value="${tache.id}"/>">Update</a></td>
						<td>
						<a href="<%=application.getContextPath()%>/DeleteTask.jsp" value="${tache.id}"/>">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<p>
			<a href="<%=application.getContextPath()%>/AddTask.jsp"">Add Task</a>
		</p>
	</body>
</html>