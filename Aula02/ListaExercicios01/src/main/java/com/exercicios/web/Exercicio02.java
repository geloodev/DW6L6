package com.exercicios.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Exercicio02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("nome");
        if (name == null)
            name = "Anonimo";
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Olá , " + name + "!</h1>");
    }
}
