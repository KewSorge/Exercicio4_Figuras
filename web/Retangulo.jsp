<%-- 
    Document   : Retangulo
    Created on : 16/05/2019, 15:32:00
    Author     : Kewen Sorge
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="Estilo.css">
        <title>retangulo</title>
    </head>
    <body>
        <form action="Controle" method="POST">
            <input type="hidden" name="flag" value="Retangulo"/>
        <h1>Digite os valores do retângulo</h1><br/><br/>
        <p>Largura: <input type="text" name="B" size="10"/></p>
        <p>Altura: <input type="text" name="A" size="10"/></p>
        <p> <input type="submit" value="Calcular"> <input type="reset" value="Limpar">
            </form>
    </p><br/>
    <p><a href="index.jsp"><input type="button" value="Voltar"  /></a>
    </body>
</html>
