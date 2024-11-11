package com.exercicios.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Exercicio06 extends HttpServlet {

    ArrayList<String> comments = new ArrayList<String>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String comment = request.getParameter("comment");
        if (comment != null)
            comments.add(comment);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Exercício 06 - Comentários:</h1>");

        for (String c : comments) {
            out.println("<li>" + c + "</li>");
        }
    }
}
