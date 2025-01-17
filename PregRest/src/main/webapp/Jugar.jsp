<%@page import="com.afd.trivial.modelo.Partida"%>
<%@page import="com.afd.trivial.modelo.Respuesta"%>
<%@page import="com.afd.trivial.modelo.Pregunta"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Jugar</title>
	<link rel="stylesheet" type="text/css" href="estiloJuego.css">
	
</head>
	<body class="jugarPartida">
		<% Partida partida = (Partida)application.getAttribute("partida"); %>
		<form action="RecogerRespuestas">
			<div class="pregresp">
			<% for (Pregunta p : partida.getListaPreguntas()) { %>
				<div class="pregunta"><%=p.getEnunciado() %></div>
				<div class="respuestas"> 
				<% for (Respuesta r: p.getListaRespuesta()) { %> 
					<input required type="radio" name="resp<%=p.getIdPregunta()%>" value="<%= r.getIdRespuesta()%>"/> <%= r.getTexto() %>
					<br/>
				<% } %>
			 	</div>
			 <%} %>
			<input type="submit" value="Enviar respuesta"> 
			</div>
		</form>
	

	</body>
</html>