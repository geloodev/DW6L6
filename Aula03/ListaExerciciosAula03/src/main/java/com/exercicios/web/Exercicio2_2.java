package com.exercicios.web;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Exercicio2_2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String param = request.getParameter("parametro");
        request.setAttribute("message", "Parametro: " + param);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Exercicio2_2.jsp");
        dispatcher.forward(request, response);
    }
}
