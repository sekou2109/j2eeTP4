package com.rsv.beans;

public class Client {

    private String nom;
    private String prenom;
    private String telephone;
    private String email;

    public Client(){
        this.nom=nom;
        this.prenom=prenom;
        this.telephone=telephone;
        this.email=email;
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
}
