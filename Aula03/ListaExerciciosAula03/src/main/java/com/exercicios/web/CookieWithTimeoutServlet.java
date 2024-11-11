package com.exercicios.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CookieWithTimeoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        Cookie userCookie = new Cookie("username", username);
        userCookie.setMaxAge(10); // 10 seconds
        response.addCookie(userCookie);
        response.sendRedirect("welcome-cookie");
    }
}
