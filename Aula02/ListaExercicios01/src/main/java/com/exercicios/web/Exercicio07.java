package com.exercicios.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Exercicio07 extends HttpServlet {

    private Map<String, Integer> table = new HashMap<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("nome");
        if (name != null) {
            if (table.containsKey(name)) {
                table.put(name, table.get(name) + 1);
            } else {
                table.put(name, 1);
            }
        }
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>1Exercício 07 - Lista de Nomes:</h1>");

        for (String key : table.keySet()) {
            out.println("<li>" + key + " - " + table.get(key) + "</li>");
        }
    }
}
