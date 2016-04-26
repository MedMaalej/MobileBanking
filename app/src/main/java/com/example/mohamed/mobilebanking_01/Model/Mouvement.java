package com.example.mohamed.mobilebanking_01.Model;

/**
 * Created by mohamed on 29/03/15.
 */
public class Mouvement {
    private int id_mouvement;
    private String ref_mouvement;
    private String date_mouvement;
    private String type_mouvement;
    private String desc_mouvement;
    private int id_compte_foreign;

    public Mouvement(int id_mouvement, String ref_mouvement, String date_mouvement, String type_mouvement, String desc_mouvement, int id_compte_foreign) {
        this.id_mouvement = id_mouvement;
        this.ref_mouvement = ref_mouvement;
        this.date_mouvement = date_mouvement;
        this.type_mouvement = type_mouvement;
        this.desc_mouvement = desc_mouvement;
        this.id_compte_foreign = id_compte_foreign;
    }

    public int getId_mouvement() {
        return id_mouvement;
    }

    public void setId_mouvement(int id_mouvement) {
        this.id_mouvement = id_mouvement;
    }

    public String getRef_mouvement() {
        return ref_mouvement;
    }

    public void setRef_mouvement(String ref_mouvement) {
        this.ref_mouvement = ref_mouvement;
    }

    public String getDate_mouvement() {
        return date_mouvement;
    }

    public void setDate_mouvement(String date_mouvement) {
        this.date_mouvement = date_mouvement;
    }

    public String getType_mouvement() {
        return type_mouvement;
    }

    public void setType_mouvement(String type_mouvement) {
        this.type_mouvement = type_mouvement;
    }

    public String getDesc_mouvement() {
        return desc_mouvement;
    }

    public void setDesc_mouvement(String desc_mouvement) {
        this.desc_mouvement = desc_mouvement;
    }

    public int getId_compte_foreign() {
        return id_compte_foreign;
    }

    public void setId_compte_foreign(int id_compte_foreign) {
        this.id_compte_foreign = id_compte_foreign;
    }
}
