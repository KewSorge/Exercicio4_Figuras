<%-- 
    Document   : Triangulo
    Created on : 16/05/2019, 15:56:50
    Author     : Kewen Sorge
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="Estilo.css">
        <title>Triangulo</title>
    </head>
    <body>
        <h1>Digite os dados do triângulo</h1><br/>
        <form action="Controle" method="post">
            <input type="hidden" name="flag" value="Triangulo"/>
            <p>Digite o valor da Base: <input type="text" name="B" size="10"/></p>
            <p>Digite o valor da Altura: <input type="text" name="A" size="10"/></p>
            <p> <input type="submit" value="Calcular"/><input type="reset" value="limpar"/>
        </form>
    </p<><br/>
    <p><a href="index.jsp">
            <input type="button" value="Voltar"/>
        </a>
    </body>
</html>
