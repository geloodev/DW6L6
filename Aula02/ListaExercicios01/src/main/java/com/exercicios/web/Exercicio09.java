package com.exercicios.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Exercicio09 extends HttpServlet {

    public ArrayList<String> names;

    @Override
    public void init() throws ServletException {
        names = new ArrayList<String>();
        names.add("Ana");
        names.add("Pedro");
        names.add("Larissa");
        names.add("Lucas");
        names.add("Manuela");
        names.add("Marcelo");
        names.add("Juliana");
        names.add("Tomas");
        names.add("Eduarda");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("removeNome");
        if (name != null)
            names.remove(name);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h1>Exercício 09 - Lista de Nomes:</h1>");
        for (String n : names) {
            out.println("<li>" + n + "</li>");
        }
    }
}
