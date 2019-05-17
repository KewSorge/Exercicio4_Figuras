<%-- 
    Document   : Resultado
    Created on : 16/05/2019, 16:09:19
    Author     : Kewen Sorge
--%>
<%@page import="Modelo.Retangulo;"%>
<%@page import="Modelo.Quadrado;"%>
<%@page import="Modelo.Triangulo;"%>
<%@page import="java.util.ArrayList" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="Estilo.css">
        <title>Resultado</title>
    </head>
    <body>
        <%
                String flag =  request.getParameter("flag");
                %>
        <div id= "<%=flag%>">                    
                <p>A Area do <%=flag%> é 
                            ${mensagem}
                            <%
                                String msg = (String) request.getAttribute("mensagem");
                            %>
                metros² 
                </P>
                
                <br/><a href="index.html"><input type="button" value="Voltar"  /></a><br/><br/>
                <div>
    </body>
</html>
