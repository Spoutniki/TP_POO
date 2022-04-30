package com.octest.servlets;

import java.io.IOException;
import java.time.LocalDate;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpSession;
import java.util.List;
import java.util.ArrayList;
import classes.Panier;
import classes.ObjetPanier;
import classes.Produit;


public class Accueil extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setAttribute("utilisateurs", liste);
	RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
	rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest resquest, HttpServletResponse response) throws ServletException, IOException {
        ShoppingForm form = new ShoppingForm();
}

}