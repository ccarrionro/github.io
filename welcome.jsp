<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String name = request.getParameter("name");
%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bienvenida</title>
</head>
<body>
<h1>Bienvenida <%= name %>!</h1>
</body>
</html>
