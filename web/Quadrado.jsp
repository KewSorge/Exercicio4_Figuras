<%-- 
    Document   : Quadrado
    Created on : 16/05/2019, 15:38:38
    Author     : Kewen Sorge
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="Estilo.css">
        <title>Quadrado</title>
    </head>
    <body>
        <h1>Digite o valor do Quadrado</h1><br/>
        <form action="Controle" method="POST">
            <input type="hidden" name="flag" value="Quadrado"/>
            <p>Digite o Lado: 
                <input type="text" name="L" size="10"/></p>
            <p><input type="submit" value="Calcular"/><input type="reset" value="Limpar"/></p>
            <br/>
        </form>
    <a href="index.jsp"><input type="button" value="Voltar"  /></a>
</body>
</html>
