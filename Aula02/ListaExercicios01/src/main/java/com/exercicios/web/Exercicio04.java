package com.exercicios.web;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Exercicio04 extends HttpServlet {

    public Integer n = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        n++;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Esite servlet foi acessado " + n + " vezes.</h1>");
    }
}
