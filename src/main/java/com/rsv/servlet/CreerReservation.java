package com.rsv.servlet;

import com.rsv.beans.Reservation;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.beans.PropertyEditorSupport;
import java.io.IOException;

@WebServlet(name="creer-reservation", urlPatterns ="/creer-reservation")
public class CreerReservation extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String telephone = request.getParameter("tel");
        String email = request.getParameter("email");
        String typeAppart = request.getParameter("type");
        String prix = request.getParameter("prix");
        String option = request.getParameter("option");

        if(nom.isBlank() || prenom.isBlank() || telephone.isBlank() || email.isBlank() || typeAppart.isBlank() || prix.isBlank() || option.isBlank()
                || nom==null || prenom==null || telephone==null || email==null || typeAppart==null || prix==null || option==null){
            request.setAttribute("erreur", "Vous devez remplir tous les champs");
            request.getRequestDispatcher("/reservation/index.jsp").forward(request,response);
        }else{
            Reservation reservation = new Reservation();
            reservation.setNom(nom);
            reservation.setPrenom(prenom);
            reservation.setTelephone(telephone);
            reservation.setEmail(email);
            reservation.setTypeAppart(typeAppart);
            reservation.setPrix(prix);
            reservation.setOption(option);

            request.setAttribute("reservation",reservation);
            request.getRequestDispatcher("/info_reservation/index.jsp").forward(request,response);
        }
    }
}
