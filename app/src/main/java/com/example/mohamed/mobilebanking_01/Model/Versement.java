package com.example.mohamed.mobilebanking_01.Model;

/**
 * Created by mohamed on 29/03/15.
 */
public class Versement extends  Mouvement {
    private int id_versement;

    public Versement(int id_mouvement, String ref_mouvement, String date_mouvement, String type_mouvement, String desc_mouvement, int id_compte_foreign, int id_versement) {
        super(id_mouvement, ref_mouvement, date_mouvement, type_mouvement, desc_mouvement, id_compte_foreign);
        this.id_versement = id_versement;
    }

    public int getId_versement() {
        return id_versement;
    }

    public void setId_versement(int id_versement) {
        this.id_versement = id_versement;
    }
}
