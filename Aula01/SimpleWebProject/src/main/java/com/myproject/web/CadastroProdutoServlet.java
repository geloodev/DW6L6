package com.myproject.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CadastroProdutoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String preco = request.getParameter("preco");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Produto Cadastrado com Sucesso!</h1>");
        out.println("<p>Nome do Produto: " + nome + "</p>");
        out.println("<p>Preço: R$: " + preco + "</p>");
        out.println("<a href='cadastro-produto.html'>Cadastrar novo produto</a>");
    }
}
