/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Retangulo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Retangulo;
import Modelo.RetanguloDAO;

import Modelo.Quadrado;
import Modelo.QuadradoDAO;

import Modelo.Triangulo;
import Modelo.TrianguloDAO;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Kewen Sorge
 */
@WebServlet(name = "Controle", urlPatterns = {"/Controle"})
public class Controle extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String mensagem;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int A, B, L;

        String flag = request.getParameter("flag");

        if (flag.equalsIgnoreCase("Retangulo")) {
            L = Integer.parseInt(request.getParameter("B"));
            A = Integer.parseInt(request.getParameter("A"));

            Retangulo ret = new Retangulo();

            ret.setBase(L);
            ret.setAltura(A);
            ret.calArea();

            RetanguloDAO rdao = new RetanguloDAO();
            int r = rdao.conectar();

            if (r == 0) {
                mensagem = "Erro ao se conectar ao banco de dados";
                request.setAttribute("mensagem", mensagem);
                RequestDispatcher d = request.getRequestDispatcher("Erro.jsp");
                d.forward(request, response);
            } else {
                r = rdao.salvarforma(ret);
                if (r == 1) {
                    mensagem = String.valueOf(ret.getArea());
                    request.setAttribute("mensagem", mensagem);
                    RequestDispatcher d = request.getRequestDispatcher("Resultado.jsp");
                    d.forward(request, response);
                } else {
                    mensagem = "Ocorreu algum erro!!!";
                    request.setAttribute("mensagem", mensagem);
                    RequestDispatcher d = request.getRequestDispatcher("Erro.jsp");
                    d.forward(request, response);
                }
            }
        } else if (flag.equalsIgnoreCase("Quadrado")) {
            L = Integer.parseInt(request.getParameter("L"));

            Quadrado qua = new Quadrado();

            qua.setLado(L);
            qua.calArea();

            QuadradoDAO qdao = new QuadradoDAO();
            int r = qdao.conectar();

            if (r == 0) {
                mensagem = "Erro ao conectar no banco";
                request.setAttribute("mensagem", mensagem);
                RequestDispatcher d = request.getRequestDispatcher("Erro.jsp");
                d.forward(request, response);
            } else {
                r = qdao.salvarforma(qua);
                if (r == 1) {
                    mensagem = String.valueOf(qua.getArea());
                    request.setAttribute("mensagem", mensagem);
                    RequestDispatcher d = request.getRequestDispatcher("Resultado.jsp");
                    d.forward(request, response);
                } else {
                    mensagem = "Ocorreu um erro";
                    request.setAttribute("mensegem", mensagem);
                    RequestDispatcher d = request.getRequestDispatcher("Erro.jsp");
                    d.forward(request, response);
                }
            }
        } else if (flag.equalsIgnoreCase("Triangulo")) {
            B = Integer.parseInt(request.getParameter("B"));
            A = Integer.parseInt(request.getParameter("A"));

            Triangulo tri = new Triangulo();

            tri.setAltura(A);
            tri.setBase(B);
            tri.calArea();

            TrianguloDAO tdao = new TrianguloDAO();
            int r = tdao.conectar();

            if (r == 0) {
                mensagem = "Erro ao conectar no banco";
                request.setAttribute("mensagem", mensagem);
                RequestDispatcher d = request.getRequestDispatcher("Erro.jsp");
                d.forward(request, response);
            } else {
                r = tdao.salvarforma(tri);
                if (r == 1) {
                    mensagem = String.valueOf(tri.getArea());
                    request.setAttribute("mensagem", mensagem);
                    RequestDispatcher d = request.getRequestDispatcher("Resultado.jsp");
                    d.forward(request, response);
                } else {
                    mensagem = "Ocorreu algum erro";
                    request.setAttribute("mensagem", mensagem);
                    RequestDispatcher d = request.getRequestDispatcher("Erro.jsp");
                    d.forward(request, response);
                }
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
