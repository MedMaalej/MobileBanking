package com.example.mohamed.mobilebanking_01.Model;

/**
 * Created by mohamed on 29/03/15.
 */
public class Carte {
    private int id_carte;
    private String ref_carte;
    private String type_carte;
    private String dateExp_carte;
    private int id_compte_foreign;

    public Carte(int id_carte, String ref_carte, String type_carte, String dateExp_carte, int id_compte_foreign) {
        this.id_carte = id_carte;
        this.ref_carte = ref_carte;
        this.type_carte = type_carte;
        this.dateExp_carte = dateExp_carte;
        this.id_compte_foreign = id_compte_foreign;
    }

    public int getId_carte() {
        return id_carte;
    }

    public void setId_carte(int id_carte) {
        this.id_carte = id_carte;
    }

    public String getRef_carte() {
        return ref_carte;
    }

    public void setRef_carte(String ref_carte) {
        this.ref_carte = ref_carte;
    }

    public String getType_carte() {
        return type_carte;
    }

    public void setType_carte(String type_carte) {
        this.type_carte = type_carte;
    }

    public String getDateExp_carte() {
        return dateExp_carte;
    }

    public void setDateExp_carte(String dateExp_carte) {
        this.dateExp_carte = dateExp_carte;
    }

    public int getId_compte_foreign() {
        return id_compte_foreign;
    }

    public void setId_compte_foreign(int id_compte_foreign) {
        this.id_compte_foreign = id_compte_foreign;
    }
}
