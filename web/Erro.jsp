<%-- 
    Document   : Erro
    Created on : 17/05/2019, 12:36:33
    Author     : Kewen Sorge
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="Estilo.css">
        <title>ERRO</title>
    </head>
    <body>
        <h1>
            ${mensagem}
            <%
                String msg = (String) request.getAttribute("mensagem");
            %>
            <br/>
            <a href="index.jsp"><input type="button" value="Voltar"  /></a>
        </h1>
    </body>
</html>
