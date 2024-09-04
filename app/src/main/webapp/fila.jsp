<%@ page contentType="text/html;charset=UTF-8" language="java"  %>
<%@ page import="application.FilaSimples" %>
<%
FilaSimples fila = new FilaSimples(5);
fila.enqueue(5);
fila.enqueue(20);

request.SetAttribute("fila", fila);
%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <title>Fila</title>
    </head>
    <body>
        <p>${fila.dequeue()}</p>
    </body>
</html>