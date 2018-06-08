<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>Page add tasks</p>
	<form method="post">
	<label for="libelleLabel">Libellé : 
	</label>
	<input name="libelle" type="text" />
	<label for="priority">Priorité : 
	</label>
	<input name="priority" type="text" />
	<label for="etat">État : 
	</label>
	<input name="Etat" type="text" />
	<input name="valider" type="submit" onclick="window.location.href = 'AffichageTaches.jsp';" value="Link" />
	</body>
</html>