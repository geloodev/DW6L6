package com.exercicios.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Exercicio08 extends HttpServlet {

    class Product {
        String name;
        Integer price;

        public Product(String name, Integer price) {
            this.name = name;
            this.price = price;
        }
    }

    private ArrayList<Product> products = new ArrayList<Product>();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("nome");
        Integer price = Integer.parseInt(request.getParameter("preco"));
        if (name != null && price != null)
            products.add(new Product(name, price));

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Lista de Produtos:</h1>");

        for (Product p : products) {
            out.println("<li>" + p.name + " - $" + p.price + "</li>");
        }
    }
}
