package com.rsv.beans;

import java.util.Optional;

public class Reservation {
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private String typeAppart;
    private String prix;
    private String option;

    public Reservation(){
        this.nom=nom;
        this.prenom=prenom;
        this.telephone=telephone;
        this.email=email;
        this.typeAppart=typeAppart;
        this.prix=prix;
        this.option=option;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public String getTelephone(){
        return this.telephone;
    }

    public String getEmail(){
        return this.email;
    }

    public String getTypeAppart(){
        return this.typeAppart;
    }

    public String getPrix(){
        return this.prix;
    }

    public String getOption(){
        return this.option;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public void setTelephone(String telephone){
        this.telephone=telephone;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setTypeAppart(String typeAppart){
        this.typeAppart = typeAppart;
    }

    public void setPrix(String prix){
        this.prix = prix;
    }

    public void setOption(String option){
        this.option = option;
    }
}
