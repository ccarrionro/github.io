<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario de Bienvenida</title>
</head>
<body>
<h1>Formulario de Bienvenida</h1>
<form action="myServlet2" method="post">
    <label for="name">Nombre:</label>
    <input type="text" id="name" name="name" required>
    <br><br>
    <input type="submit" value="Enviar">
</form>
</body>
</html>
