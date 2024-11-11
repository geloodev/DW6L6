package com.exercicios.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Exercicio05 extends HttpServlet {

    private ArrayList<String> names = new ArrayList<String>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("addNome");
        if (name != null)
            names.add(name);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Lista de Nomes:</h1>");
        for (String n : names) {
            out.println("<li>" + n + "</li>");
        }
    }
}
