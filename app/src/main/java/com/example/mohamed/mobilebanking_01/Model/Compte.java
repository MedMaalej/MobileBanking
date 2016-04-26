package com.example.mohamed.mobilebanking_01.Model;

/**
 * Created by mohamed on 29/03/15.
 */
public class Compte {
    private int id_compte;
    private String ref_compte;
    private String type_compte;
    private double solde_compte;
    private String devise_compte;
    private String rib_compte;
    private int id_client;

    public Compte(int id_compte, String ref_compte, String type_compte, double solde_compte, String devise_compte, String rib_compte, int id_client) {
        this.id_compte = id_compte;
        this.ref_compte = ref_compte;
        this.type_compte = type_compte;
        this.solde_compte = solde_compte;
        this.devise_compte = devise_compte;
        this.rib_compte = rib_compte;
        this.id_client = id_client;
    }

    public int getId_compte() {
        return id_compte;
    }

    public void setId_compte(int id_compte) {
        this.id_compte = id_compte;
    }

    public String getRef_compte() {
        return ref_compte;
    }

    public void setRef_compte(String ref_compte) {
        this.ref_compte = ref_compte;
    }

    public String getType_compte() {
        return type_compte;
    }

    public void setType_compte(String type_compte) {
        this.type_compte = type_compte;
    }

    public double getSolde_compte() {
        return solde_compte;
    }

    public void setSolde_compte(double solde_compte) {
        this.solde_compte = solde_compte;
    }

    public String getDevise_compte() {
        return devise_compte;
    }

    public void setDevise_compte(String devise_compte) {
        this.devise_compte = devise_compte;
    }

    public String getRib_compte() {
        return rib_compte;
    }

    public void setRib_compte(String rib_compte) {
        this.rib_compte = rib_compte;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }
}
