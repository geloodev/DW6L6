package com.myproject.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListaClienteServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Lista de Clientes</h1>");
        out.println("<p>Aqui você verá a lista de clientes cadastrados (em breve).</p>");
        out.println("<a href='index.html'>Voltar à Página Inicial</a>");
    }
}
