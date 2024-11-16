package com.rsv.servlet;

import com.rsv.beans.Client;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Créer un client", urlPatterns = "/creer-client")
public class CreerClient extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String telephone = request.getParameter("tel");
        String email = request.getParameter("email");

        if(nom==null || prenom==null || telephone==null || email==null
        || nom.isBlank() || prenom.isBlank() || telephone.isBlank() || email.isBlank()){
            request.setAttribute("erreur", "Vous devez remplir tous les champs");
            request.getRequestDispatcher("/inscription/index.jsp").forward(request,response);
        }else{
            Client client = new Client();
            client.setNom(nom);
            client.setPrenom(prenom);
            client.setTelephone(telephone);
            client.setEmail(email);
            request.setAttribute("success", "Inscription avec succès");
            request.setAttribute("client",client);
            request.getRequestDispatcher("/info_client/index.jsp").forward(request,response);

        }

    }

}
